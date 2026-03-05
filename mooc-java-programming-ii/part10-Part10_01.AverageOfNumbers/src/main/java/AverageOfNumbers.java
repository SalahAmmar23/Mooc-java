
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your program here
        ArrayList<String> inputs = new ArrayList<>();
        
        System.out.println("Input number, type \"end\" to stop.");

        while(true){
            String command = scanner.nextLine();
            
            if(command.equals("end")){
                break;
            }

            inputs.add(command);


        }

        double average = inputs.stream().mapToInt(s -> Integer.valueOf(s)).average().getAsDouble();


        System.out.println("average of the numbers: " + average);

    }
}
