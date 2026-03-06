
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;


public class LiteracyComparison {
    
    public static void main(String[] args) {

        ArrayList<String> rows = new ArrayList<>();
        try{
            Files.lines(Paths.get("literacy.csv")).forEach(i -> rows.add(i));
        }catch(Exception e){
            System.out.println(e.getMessage());
        }


        rows.stream().map(row -> row.split(","))
        .filter(parts -> parts.length >= 6)
        .sorted((a, b) -> Double.compare(Double.parseDouble(a[5]), Double.parseDouble(b[5])))
        .forEach(parts -> {
        String gender = parts[2].trim().contains("female") ? "female" : "male";
        System.out.println(parts[3].trim() + " (" + parts[4].trim() + "), " + gender + ", " + parts[5].trim());
        });

    }
}
