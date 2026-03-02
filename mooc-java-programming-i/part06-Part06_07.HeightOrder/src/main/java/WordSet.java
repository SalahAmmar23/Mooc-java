import java.util.ArrayList;

public class WordSet {

    private ArrayList<String> words;

    public WordSet () {
        this.words = new ArrayList<>();        
    }

    public void addWord(String word){
        this.words.add(word);
    }

    public boolean contains(String word){
        return  this.words.contains(word);  
    }
}
