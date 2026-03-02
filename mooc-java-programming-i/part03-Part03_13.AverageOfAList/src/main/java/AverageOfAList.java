
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        
        ArrayList<Integer> lists = new ArrayList<>();
        
        while(true){
            int prompt = Integer.valueOf(scanner.nextLine());

            if(prompt == -1){
                break;
            }

            lists.add(prompt);
            
        }
        
        int sum = 0;
        int count =0;
        for(int list : lists){
            sum = sum +list;
            count++;
        }

        System.out.println("Average: " + 1.0 * sum / count);
        
    }
}
