import java.util.Objects;

public class Item {

    private String name;
    private int weight;

    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public Item(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public boolean equals(Object compared) {
        if(this == compared){
            return true;
        }

        if(compared == null){
            return false;
        }

        if(!(compared instanceof Item)){
            return false;
        }

        Item other = (Item) compared;

        return other.name.equals(this.name);
    }

    public int hashCode() {
        return Objects.hash(name);
    }

}
