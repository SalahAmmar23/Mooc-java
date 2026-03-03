import java.util.HashMap;

public class Abbreviations {
    private HashMap<String, String> nameAbb;

    public Abbreviations(){
        nameAbb = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation){
            nameAbb.put(abbreviation, explanation);
    }

    public boolean hasAbbreviation(String abbreviation){
        return nameAbb.containsKey(abbreviation);
    }

    public String findExplanationFor(String abbreviation){
        return nameAbb.get(abbreviation);
    }
}
