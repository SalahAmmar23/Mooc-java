import java.util.Random;
import java.util.ArrayList;

public class JokeManager {
    private ArrayList<String> jokes;

    public JokeManager() {
        this.jokes = new ArrayList<>();
    }


    public void addJoke(String joke){
        this.jokes.add(joke);
    }

    public String drawJoke(){
        if(this.jokes.isEmpty()){
            return "Jokes are in short supply.";
        }else{
            Random rand = new Random();
            int randomJoke = rand.nextInt(this.jokes.size());
            return this.jokes.get(randomJoke);
        }
    }

    public void printJokes(){
        
        for(String joke: jokes){
            System.out.println(joke);    
        }
    }

}
