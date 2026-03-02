
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the exercise

        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers, 
        // and lastly the one that tracks the sum of odd numbers!

        int sum = 0;
        int evensum = 0;
        int oddsum= 0;
        Statistics totalNumbers = new Statistics();
        Statistics evenNumbers = new Statistics();
        Statistics oddNumbers = new Statistics();
        

        while(true){
            System.out.println("Enter numbers: ");
            int prompt = Integer.parseInt(scanner.nextLine());


            if(prompt == -1){
                break;
            }
            totalNumbers.addNumber(prompt);


            if (prompt % 2 == 0){
                evenNumbers.addNumber(prompt);

            }else{
                oddNumbers.addNumber(prompt);
            }

        }

        sum = totalNumbers.sum();
        System.out.println("Sum: " + sum);

        evensum = evenNumbers.sum();
        System.out.println("Sum of even numbers: "+ evensum);

        oddsum = oddNumbers.sum();
        System.out.println("Sum of odd numbers: "+ oddsum);



    }
}
