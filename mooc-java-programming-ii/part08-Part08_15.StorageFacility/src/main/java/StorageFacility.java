import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {
   private HashMap<String, ArrayList<String>> unit;
   
   
    public StorageFacility() {
        unit = new HashMap<>();
    }

    public void add(String unit, String item) {
            this.unit.putIfAbsent(unit, new ArrayList<>());
            this.unit.get(unit).add(item);
    }

    public ArrayList<String> contents(String storageUnit) {
        if(unit.containsKey(storageUnit)){
            return new ArrayList<>(this.unit.get(storageUnit));
        }
        return new ArrayList<>();
    }

    public void remove(String storageUnit, String item) {
        // check if the unit exists
        if (!unit.containsKey(storageUnit)) return;

        ArrayList<String> items = unit.get(storageUnit);
        items.remove(item); // removes only the first occurrence

        // remove the unit if empty
        if (items.isEmpty()) {
            unit.remove(storageUnit);
        }
    }

    public ArrayList<String> storageUnits() {
    ArrayList<String> unitsWithItems = new ArrayList<>();
    for (String key : unit.keySet()) {
        if (!unit.get(key).isEmpty()) {
            unitsWithItems.add(key);
        }
    }
    return unitsWithItems;
}


}
