
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        //Write a program which prints the integers from 1 to a number given by the user.

        System.out.println("Where to?");
        int num1 = Integer.valueOf(scanner.nextLine());

        System.out.println("Where from?");
        int num2 = Integer.valueOf(scanner.nextLine());


        for (int i = num2; i<= num1; i++){
            System.out.println(i);
        }


    }
}
