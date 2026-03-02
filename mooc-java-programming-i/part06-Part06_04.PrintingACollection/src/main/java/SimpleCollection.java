
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String toString(){
        if(this.elements.isEmpty()){
            return "The collection " + this.name + " is empty.";
        }

        if(this.elements.size() == 1){
            String outputFormat1 =  "The collection " + this.name + " has " + this.elements.size() + " element:\n";
            return outputFormat1 + this.elements.get(0);
        }

        String outputFormat2 =  "The collection " + this.name + " has " + this.elements.size() + " elements:\n";
        String content = "";
        for(int i =0; i< this.elements.size(); i++){
            content += this.elements.get(i);
            if (i < this.elements.size()-1) {
                    content += "\n";          
            }

        }
        return (outputFormat2 +  content);
    }
}
