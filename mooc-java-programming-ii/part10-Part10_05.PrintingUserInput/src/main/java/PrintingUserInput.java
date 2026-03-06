
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> inputs = new ArrayList<>();

        while(true){
            String prompt = scanner.nextLine();

            if(prompt.isEmpty()){
                break;
            }
            inputs.add(prompt);
        }



        inputs.stream().forEach(name -> System.out.println(name));


    }
}
