
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {    
        Scanner scanner = new Scanner(System.in);

        System.out.println("Last number? ");
        int num = Integer.valueOf(scanner.nextLine());

        //using while loop
        /* 
        int startingNumber = 0;
        int sum =0;
        while(startingNumber < num){
           
            startingNumber++;
            sum += startingNumber;
        }

        System.out.println("The sum is " +sum);
        */


        //using for loop
        int total = 0;
        for(int i = 1; i <= num; i++){
            total += i;
        }
        System.out.println("sum is " + total);
    }
}
