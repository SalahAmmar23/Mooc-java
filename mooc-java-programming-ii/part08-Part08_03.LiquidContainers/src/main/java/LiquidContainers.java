
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            int first = 0; //container 1
            int second = 0; // container 2

        while (true) {
            

            System.out.println("First: "+ first + "/100");
            System.out.println("Second: "+ second + "/100");
            String input = scan.nextLine();
            System.out.println("");

            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.parseInt(parts[1]);
    
            if(command.equals("add")){
                if(first + amount >100){
                    first = 100;
                }else if(amount < 0){
                    continue;
                }else if(first + amount <= 100){
                    first += amount;
                }
            }else if(command.equals("move")){
                if(amount <= 0){
                    continue;
                }

                if(amount > first){
                    second += first;
                    first = 0;
                }else if ((second+ amount) > 100){
                    second = 100;
                    first -= amount;                    
                }else {
                    first -= amount;
                    second +=  amount;
                }

            }else if(command.equals("remove")){
                if(amount <= 0){
                    continue;
                }else if( amount > second){
                    second = 0;
                }else{
                    second -= amount;
                }


            }

        }
    }

}
