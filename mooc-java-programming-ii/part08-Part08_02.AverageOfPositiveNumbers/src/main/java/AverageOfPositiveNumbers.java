
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        double sum = 0.0;

        while(true){
            int prompt = Integer.parseInt(scanner.nextLine());

            if(prompt == 0){
                break;
            }else if (prompt > 0) {
                sum += prompt;
                count++;
                continue;
            }else if(prompt < 0){
                continue;
            }

           

        }
        if(count == 0){
            System.out.println("Cannot calculate the average");
        }else{
            System.out.println(sum / count);
        }
        
    }
}
