
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> listOfNumbers = new ArrayList<>();

        while(true){
            int prompt = Integer.parseInt(scanner.nextLine());

            if(prompt < 0){
                break;
            }

            listOfNumbers.add(prompt);

        }

        listOfNumbers.stream().filter(s -> s >=1 && s<= 5).forEach(i -> System.out.println(i));
    }
}
