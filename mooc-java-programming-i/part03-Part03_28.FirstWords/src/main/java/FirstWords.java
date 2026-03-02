
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
         * Write a program that reads user input until an empty line is entered.
         *  For each non-empty line the program splits the string by spaces  
         *  and prints the first part of the string.
         */

         while(true){
            String prompt = scanner.nextLine();
            if(prompt.equals("")){
                break;
            }

            String[] promptToPieces = prompt.split(" ");
            
            System.out.println(promptToPieces[0]);
         }
    }
}
