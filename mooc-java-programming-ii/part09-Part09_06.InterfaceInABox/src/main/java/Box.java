import java.util.ArrayList;

public class Box implements Packable {
    private double capacity;
    private ArrayList<Packable> multipleBoxes;

    public Box(double capacity) {
        this.capacity = capacity;
        multipleBoxes =  new ArrayList<>();
    }

    public void add(Packable item){
        if(!((item.weight() + this.weight()) > capacity) ){
            multipleBoxes.add(item);
        }
    }

    public double weight(){
        double sum =0;
        for(Packable c : multipleBoxes){
           sum +=  c.weight();
        }

        return sum;
    }

    @Override
    public String toString(){
        return  "Box: " + this.multipleBoxes.size() + " items, total weight " + this.weight() + " kg"; 
    }





}
