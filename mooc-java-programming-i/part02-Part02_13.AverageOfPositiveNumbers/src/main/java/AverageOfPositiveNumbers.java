
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumOfPositive = 0;
        int countOfPositive = 0;
        int numFromUser;

        while(true){
            
            numFromUser = Integer.valueOf(scanner.nextLine());

            if(numFromUser == 0){
                break;
            }else if (numFromUser > 0){
                sumOfPositive = numFromUser + sumOfPositive;
                countOfPositive++;
            }else if (numFromUser < 0){
                continue;
            }
            
        }
        if(countOfPositive > 0){
            System.out.println( 1.0* sumOfPositive / countOfPositive);
        }else {
            System.out.println("Cannot calculate the average");
        }
        

    }
}
