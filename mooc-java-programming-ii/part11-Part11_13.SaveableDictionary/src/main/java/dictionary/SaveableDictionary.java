package dictionary;

import java.io.File;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;

public class SaveableDictionary {
    private HashMap<String, String> dictionary;
    private String filename;

    public SaveableDictionary() {
        dictionary = new HashMap<>();
    }

    public SaveableDictionary(String file){
        this.filename = file;
        dictionary = new HashMap<>();

    }

    public void add(String words, String translation){
        dictionary.putIfAbsent(words, translation);
    }

    public String translate(String word){
        if (dictionary.containsKey(word)){
           return dictionary.get(word); 
        }
        
        for(String key : dictionary.keySet()){
            if(dictionary.get(key).equals(word)){
                return key;
            }
        }
        return null;
    }

    public void delete(String word){
        if(dictionary.containsKey(word)){
            dictionary.remove(word);
        }
        if(dictionary.containsValue(word)){
            String helperKey = "";
            for(String s : dictionary.keySet()){
                if(dictionary.get(s).equals(word)){
                    helperKey = s;
                }
            }
            dictionary.remove(helperKey);
        }
    }

    public boolean load(){
        try(Scanner scanner = new Scanner(new File(this.filename))) {
                while(scanner.hasNextLine()){
                    String row = scanner.nextLine();
                    String[] parts = row.split(":");
                    add(parts[0], parts[1]);
                } 
                return true;
        } catch (Exception e) {
            return false;
        }    
    }

    public boolean save(){
        try (PrintWriter writer = new PrintWriter(filename)) {

            for(String key : dictionary.keySet()){
                writer.println(key + ":" + dictionary.get(key));
            }
            writer.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }


}
