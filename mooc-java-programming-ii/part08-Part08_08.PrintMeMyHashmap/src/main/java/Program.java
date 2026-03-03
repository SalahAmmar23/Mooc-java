
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        // Test your program here!
        HashMap<String, String> hashmap = new HashMap<>();
        hashmap.put("f.e", "for example");
        hashmap.put("etc.", "and so on");
        hashmap.put("i.e", "more precisely");

        printKeys(hashmap);
        System.out.println("---");
        printKeysWhere(hashmap, "i");
        System.out.println("---");
        printValuesOfKeysWhere(hashmap, ".e");
    }

    public static void printKeys(HashMap<String,String> hashmap){
        for(String n : hashmap.keySet()){
            System.out.println(n);
        }
    }

    public static void printKeysWhere(HashMap<String,String> hashmap, String text){
        for(String n : hashmap.keySet()){
            if(!n.contains(text)){
                continue;
            }
            System.out.println(n);   
        }
    }

    public static void printValuesOfKeysWhere(HashMap<String,String> hashmap, String text){
         for(String n : hashmap.keySet()){
            if(!n.contains(text)){
                continue;
            }
            System.out.println(hashmap.get(n));   
        }
    }



}
