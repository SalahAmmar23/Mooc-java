
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        int numberOfTiems = 0;
        while (true){

            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());
    
            if(num == 0){
                break;
            }else {
                sum = sum + num;
                numberOfTiems += 1;
            }
        }

        System.out.println("Number of numbers: "+ numberOfTiems);
        System.out.println("Sum of the numbers: " + sum);
  



    }
}
