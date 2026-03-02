// import java.util.ArrayList;

// public class Hold {

//     private int maxWeight;
//     private ArrayList<Suitcase> luggages;
//     private int counter;
//     private int totalCurrentWeight;

//     public Hold(int initialMaxWeight) {
//         this.maxWeight = initialMaxWeight;
//         this.counter = 0;
//         this.luggages = new ArrayList<>();
//         this.totalCurrentWeight = 0;
//     }

//     public void addSuitcase(Suitcase suitcase){
//         if((suitcase.totalWeight() + this.totalCurrentWeight) <= this.maxWeight){
//             this.luggages.add(suitcase);
//             counter++;
//             this.totalCurrentWeight += suitcase.totalWeight();
//         }
//     }

//     public void printItems(){
//         for(Suitcase luggage : luggages){
//             luggage.printItems();
//         }
//     }

//     public String toString(){
//         return this.counter + " suitcases (" + this.totalCurrentWeight + " kg)";
//     }

// }


import java.util.ArrayList;

public class Hold {

    private int maxWeight;
    private ArrayList<Suitcase> luggages;

    public Hold(int initialMaxWeight) {
        this.maxWeight = initialMaxWeight;
        this.luggages = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase){
        if(this.totalWeight() + suitcase.totalWeight() <= this.maxWeight){
            this.luggages.add(suitcase);
        }
    }

    public void printItems(){
        for(Suitcase luggage : luggages){
            luggage.printItems();
        }
    }

    public int totalWeight(){
        int sum = 0;
        for(Suitcase luggage : luggages){
            sum += luggage.totalWeight();
        }
        return sum;
    }

    public String toString(){
        int count = this.luggages.size();
        int weight = this.totalWeight();

        return count + " suitcases (" + weight + " kg)";
    }

}
