
import java.util.Scanner;

public class ThirdElement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        int longest = 0;
        String longestString = "";

        int sum = 0;
        int count = 0;

        while (true) { 
            String input = scanner.nextLine();
            
            if(input.equals("")){
                break;
            }

            String[] inputToPieces = input.split(",");

            int lengthOfFirstElement = inputToPieces[0].length();

            if(lengthOfFirstElement > longest ){
                longest = lengthOfFirstElement;
                longestString = inputToPieces[0];
            }

            sum += Integer.parseInt(inputToPieces[1]);
            count++;


        }

        System.out.println("Longest name: "+ longestString);

        if(count== 0){
            System.out.println("Average cannot be calulated");
        }else{
            System.out.println("Average of the birth years: "+ 1.0* sum /count);
        }


    }

}
