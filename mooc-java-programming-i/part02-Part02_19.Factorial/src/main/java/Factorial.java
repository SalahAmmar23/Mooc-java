
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number: ");
        int factorialNum = Integer.valueOf(scanner.nextLine());

        int resultOfFactorial = 1;
        for(int i = 1; i < factorialNum; i++){
            resultOfFactorial = resultOfFactorial * (i+1);
        }

        System.out.println("Factorial: "+ resultOfFactorial);
    }
}
