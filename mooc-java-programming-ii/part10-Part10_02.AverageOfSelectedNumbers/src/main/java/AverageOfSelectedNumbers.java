
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

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


        System.out.println("Print the average of the negative number of the positive numbers? (n/p)");
        String question = scanner.nextLine();

        if(question.equals("n")){
            double negativeAverage = inputs.stream().mapToInt(s -> Integer.valueOf(s))
            .filter(s -> s  < 0).average().getAsDouble();

            System.out.println("Average of the negative numbers: " + negativeAverage);

        }else if (question.equals("p")){
            double positiveAverage = inputs.stream().mapToInt(s -> Integer.valueOf(s))
                        .filter(s -> s  > 0).average().getAsDouble();

            System.out.println("Average of the positive numbers: " + positiveAverage);          
        }

    }
}
