
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int sum = 0;
        int count = 0;
        int length0 = 0;
        String longestString = "";

        while(true){
            String prompt = scanner.nextLine();

            if(prompt.equals("")){
                break;
            }

            String[] promptToPieces = prompt.split(",");

            for(int i = 1; i < promptToPieces.length; i++){
                sum = sum + Integer.parseInt(promptToPieces[i]);
                count++;
            }

            for(int i = 0; i< promptToPieces.length -1; i++){
                int length = promptToPieces[i].length();

                if(length0 < length){
                    length0 = length;
                    longestString = promptToPieces[i];
                }

            }

            

        }


        System.out.println("Longest name: "+ longestString);
        System.out.println("Average of the birth years: "+ 1.0 * sum / count );

    }
}
