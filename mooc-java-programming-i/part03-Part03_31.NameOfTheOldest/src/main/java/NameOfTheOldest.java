
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        

        int higher = 0;
        String oldestname = "";
        

        while(true){
            String prompt = scanner.nextLine();

            if(prompt.equals("")){
                break;
            }
 
            String[] promptToPieces = prompt.split(",");

            for(int i =1; i < promptToPieces.length; i++){
                if(higher < Integer.parseInt(promptToPieces[i])){
                    higher = Integer.parseInt(promptToPieces[i]);
                    oldestname = promptToPieces[i -1];
                }
            }
        }

        System.out.println("Name of the oldest: "+ oldestname );

    }
}
