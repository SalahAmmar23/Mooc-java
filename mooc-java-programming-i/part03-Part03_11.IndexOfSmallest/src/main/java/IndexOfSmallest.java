
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999

        ArrayList<Integer> list = new ArrayList<>();

        while(true){
            int prompt = Integer.valueOf(scanner.nextLine());


            if (prompt == 9999){
                break;
            }

            list.add(prompt);
        }
        
        int smallest = list.get(0);
        int index = 0;

        for(int i= 0; i < list.size(); i++){
            int item = list.get(i);
            if(smallest > item){
                smallest = item;
            }
        }
        System.out.println("Smallest number: "+ smallest);

        for(int i= 0; i < list.size(); i++){
            if(smallest == list.get(i)){
                System.out.println("Found at index: "+ i);
            }
        
        }
        
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times

        
    }
}
