
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            String prompt = scanner.nextLine();

            if (prompt.equals("")){
                break;
            }

            String[] promptToPieces = prompt.split(" ");
            int lastPrompt = promptToPieces.length -1;
            System.out.println(promptToPieces[lastPrompt]);
        }

    }
}
