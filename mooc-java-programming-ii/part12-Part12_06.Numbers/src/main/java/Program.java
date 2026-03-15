
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("How many random numbers should be printed?");
        int prompt = Integer.parseInt(scanner.nextLine());

        Random testobject = new Random();
        for(int i =0;  i< prompt; i++){
            System.out.println(testobject.nextInt(11));
        }

    }


}
