
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            String prompt = scanner.nextLine();

            if(prompt.equals("end")){
                break;
            }

            int convert_prompt = Integer.parseInt(prompt);
            System.out.println(convert_prompt*convert_prompt*convert_prompt);


        }

    }
}
