import java.util.ArrayList;

public class HashMap<K, V> {

    private ArrayList<ArrayList<Pair<K, V>>> values;
    private int firstFreeIndex;

    public HashMap() {
        this.values = new ArrayList<>();
        // Create 32 initial buckets (ArrayLists)
        for (int i = 0; i < 32; i++) {
            this.values.add(new ArrayList<>());
        }
        this.firstFreeIndex = 0;
    }

    // Finds the specific value associated with a key
    public V get(K key) {
        int hashValue = Math.abs(key.hashCode() % this.values.size());
        ArrayList<Pair<K, V>> valuesAtIndex = this.values.get(hashValue);

        for (Pair<K, V> pair : valuesAtIndex) {
            if (pair.getKey().equals(key)) {
                return pair.getValue();
            }
        }

        return null;
    }

    // Adds a new key-value pair or updates an existing one
    public void add(K key, V value) {
        int hashValue = Math.abs(key.hashCode() % this.values.size());
        ArrayList<Pair<K, V>> valuesAtIndex = this.values.get(hashValue);

        int index = -1;
        for (int i = 0; i < valuesAtIndex.size(); i++) {
            if (valuesAtIndex.get(i).getKey().equals(key)) {
                index = i;
                break;
            }
        }

        if (index < 0) {
            valuesAtIndex.add(new Pair<>(key, value));
            this.firstFreeIndex++;
        } else {
            valuesAtIndex.get(index).setValue(value);
        }

        // Grow the internal array if more than 75% of the capacity is used
        if (1.0 * this.firstFreeIndex / this.values.size() > 0.75) {
            grow();
        }
    }

    // Increases the number of buckets and rehashes all items
    private void grow() {
        ArrayList<ArrayList<Pair<K, V>>> newValues = new ArrayList<>();
        for (int i = 0; i < this.values.size() * 2; i++) {
            newValues.add(new ArrayList<>());
        }

        for (int i = 0; i < this.values.size(); i++) {
            for (Pair<K, V> pair : this.values.get(i)) {
                int hashValue = Math.abs(pair.getKey().hashCode() % newValues.size());
                newValues.get(hashValue).add(pair);
            }
        }

        this.values = newValues;
    }

    // Removes a key-value pair from the map
    public V remove(K key) {
        int hashValue = Math.abs(key.hashCode() % this.values.size());
        ArrayList<Pair<K, V>> valuesAtIndex = this.values.get(hashValue);

        if (valuesAtIndex.isEmpty()) {
            return null;
        }

        int index = -1;
        for (int i = 0; i < valuesAtIndex.size(); i++) {
            if (valuesAtIndex.get(i).getKey().equals(key)) {
                index = i;
                break;
            }
        }

        if (index < 0) {
            return null;
        }

        Pair<K, V> pair = valuesAtIndex.get(index);
        valuesAtIndex.remove(pair);
        this.firstFreeIndex--;
        return pair.getValue();
    }
}