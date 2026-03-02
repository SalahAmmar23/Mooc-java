
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);
        

        int totalPositiveNumber = 0;
        int count =0;
        int evenCount = 0;
        int oddCount = 0;

        System.out.println("Give numbers:");
        while(true){

            int randomNum = Integer.valueOf(scanner.nextLine());

            if (randomNum == -1){
                System.out.println("Thx! Bye!");
                break;
            }else if (randomNum > 0){
                totalPositiveNumber = totalPositiveNumber + randomNum;
                count++;

                if ((randomNum % 2) == 0 ) {
                    evenCount++;
                }

                if ((randomNum %2) != 0) {
                    oddCount++;
                }
            }
        }
        double averageOfPositiveNumbers = (double) totalPositiveNumber/count;

        System.out.println("Sum: " + totalPositiveNumber);
        System.out.println("Numbers: "+ count);
        System.out.println("Average: " +  averageOfPositiveNumbers);
        System.out.println("Even: "+ evenCount);
        System.out.println("Odd: "+ oddCount);

    }
}
