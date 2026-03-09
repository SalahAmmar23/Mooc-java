import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hand implements Comparable<Hand> {
    private List<Card> cards;

    public Hand() {
        cards = new ArrayList<>();
    }

    public void add(Card card){
        cards.add(card);
    }

    public void print(){
        for(Card e : cards){
            System.out.println(e);
        }
    }

    public void sort(){
        Collections.sort(this.cards);
    }

    public List<Card> getCards(){
        return this.cards;
    }

    public int compareTo(Hand other) {
        int totalcardsofThis = 0;
        for(Card s: cards) {
           totalcardsofThis += s.getValue();
        }

        int totalcardsofOther = 0;
        for(Card b : other.getCards()){
            totalcardsofOther += b.getValue();
        }

        return totalcardsofThis - totalcardsofOther;


    }

    public void sortBySuit(){
        Collections.sort(this.cards ,new BySuitInValueOrder());
    }

}
