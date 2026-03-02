
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();


        while (true) {

            System.out.println("First: "+ first);
            System.out.println("Second: "+ second);
            String input = scan.nextLine();
            System.out.println("");
            
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.parseInt(parts[1]);

            if(command.equals("add")){
              first.add(amount);
            }else if(command.equals("move")){
                if(amount < 0){
                    continue;
                }else if(amount > first.contains()){
                    int temp = first.contains();
                    first.remove(first.contains());
                    second.add(temp);
                }else if ((second.contains() + amount) > 100){
                    second.add(100);
                    first.remove(amount);
                }else{
                    first.remove(amount);
                    second.add(amount);
                }


            }else if(command.equals("remove")){
                second.remove(amount);
            }
    



        }
    }

}
