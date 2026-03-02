import java.util.ArrayList;
public class Package {
    //contains gifts.
    private ArrayList<Gift> listOfGifts;

    public Package(){
        this.listOfGifts = new ArrayList<>();
    }

    public void addGift(Gift gift){
        this.listOfGifts.add(gift);
    }

    public int totalWeight(){
        int totalweight= 0;
        for(Gift element : listOfGifts){
            totalweight += element.getWeight();
        }

        return totalweight;
    }

}
