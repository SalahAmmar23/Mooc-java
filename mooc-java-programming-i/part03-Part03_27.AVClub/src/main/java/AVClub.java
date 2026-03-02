
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            String prompt = scanner.nextLine();

            String[] promptToPieces = prompt.split(" ");

            if(prompt.equals("")){
                break;
            }

            for(int i=0; i< promptToPieces.length; i++){
                if(promptToPieces[i].contains("av")){
                    System.out.println(promptToPieces[i]);
                }
            }


        }

    }
}
