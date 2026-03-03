
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        // Test your program here!

    }

    public static void printValues(HashMap<String,Book> hashmap){
        for(Book s : hashmap.values()){
            System.out.println(s);
        }
    }

    public static void printValueIfNameContains(HashMap<String,Book> hashmap, String text){
        for(Book s : hashmap.values()){
            if(s.getName().contains(text)){
                System.out.println(s);
            }
        }
    }

}
