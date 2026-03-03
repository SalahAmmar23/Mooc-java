
import java.util.HashMap;

public class Nicknames {

    public static void main(String[] args) {
        // Do the operations required here!
        HashMap<String, String> testing = new HashMap<>();

        testing.put("matthew", "matt");
        testing.put("michael", "mix");
        testing.put("arthur", "artie");

        String matthew = testing.get("matthew");
        System.out.println(matthew);

    }

}
