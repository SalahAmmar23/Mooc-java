import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {
    private ArrayList<Item> items;
    private int capacity;
    
    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        items = new ArrayList<>();
    }

    public void add(Item item){
         int sum = 0;
        for(Item s : items){
            sum += s.getWeight();
        }

        if(sum + item.getWeight()  <= this.capacity){
            this.items.add(item);
        }
    }

    
    public boolean isInBox(Item item){
        return this.items.contains(item);
    }

}
