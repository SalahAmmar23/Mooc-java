
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cube = 0;
        while(true){
            String prompt = scanner.nextLine();

            if(prompt.equals("end")){
                break;
            }
            
           cube = Integer.parseInt(prompt) *Integer.parseInt(prompt)* Integer.parseInt(prompt); 
           System.out.println(cube);
        }

    }
}
