// import java.util.ArrayList;

// public class Suitcase {
//     private int maxWeight;
//     private ArrayList<Item> collectionOfItems;
//     private int counter;
//     private int totalCurrentWeight;

//     public Suitcase(int maxWeight) {
//         this.maxWeight = maxWeight;
//         this.collectionOfItems = new ArrayList<>();
//         this.counter = 0;
//         this.totalCurrentWeight = 0;
//     }

//     public void addItem(Item item){
        
//         if((item.getWeight() + this.totalCurrentWeight) <= this.maxWeight ){
//             this.collectionOfItems.add(item);
//             counter++;
//             totalCurrentWeight += item.getWeight();
//         }
//     }

//     public void printItems(){
//         String outputFormat1 = "";
//         for(Item item : collectionOfItems){
//           outputFormat1 += item + "\n";
//         }
//         System.out.println(outputFormat1.trim());
//     }

//     public int totalWeight(){
//         return this.totalCurrentWeight;
//     }

//     public Item heaviestItem(){
//         if(this.collectionOfItems.isEmpty()){
//             return null;
//         }

//         Item returnedHeaviestItem = this.collectionOfItems.get(0);

//         for(Item checking: this.collectionOfItems){
//             if(checking.getWeight() > returnedHeaviestItem.getWeight()){
//                 returnedHeaviestItem = checking;
//             }
//         }
        
//         return returnedHeaviestItem;
//     }

//     public String toString(){
//         if(this.collectionOfItems.isEmpty()){
//             return "no items (0 kg)";
//         }
//         if(this.counter < 2){
//              return this.counter + " item (" + this.totalCurrentWeight + " kg)";
//         }
//         return this.counter + " items (" + this.totalCurrentWeight + " kg)";

//     }
// }


import java.util.ArrayList;

public class Suitcase {
    private int maxWeight;
    private ArrayList<Item> collectionOfItems;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.collectionOfItems = new ArrayList<>();
    }

    public void addItem(Item item){
        if(this.totalWeight() + item.getWeight() <= this.maxWeight ){
            this.collectionOfItems.add(item);
        }
    }

    public void printItems(){
        for(Item item : collectionOfItems){
            System.out.println(item);
        }
    }

    public int totalWeight(){
        int sum = 0;
        for(Item item : collectionOfItems){
            sum += item.getWeight();
        }
        return sum;
    }

    public Item heaviestItem(){
        if(this.collectionOfItems.isEmpty()){
            return null;
        }

        Item returnedHeaviestItem = this.collectionOfItems.get(0);

        for(Item checking: this.collectionOfItems){
            if(checking.getWeight() > returnedHeaviestItem.getWeight()){
                returnedHeaviestItem = checking;
            }
        }
        return returnedHeaviestItem;
    }

    public String toString(){
        int size = this.collectionOfItems.size();
        int weight = this.totalWeight();

        if(size == 0){
            return "no items (0 kg)";
        }
        if(size == 1){
             return "1 item (" + weight + " kg)";
        }
        return size + " items (" + weight + " kg)";
    }
}
