
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container storage1 = new Container();
        Container storage2 = new Container();



        while (true) {

            System.out.println("First: " + storage1);
            System.out.println("Second: " + storage2);
            String input = scan.nextLine();
            
            
           
            String[] parts = input.split(" ");
            String command = parts[0];
            
            if (input.equals("quit")) {
                break;
            } 
            if(command.equals("add")){
                int adding = Integer.parseInt(parts[1]);
                 if(adding <0){
                    System.out.println("");
                    continue;
                }
                storage1.add(adding);
                System.out.println("");
            }else if (command.equals("move")){
                int moving = Integer.parseInt(parts[1]);

                if(storage1.isEmpty() || moving < 0){
                    System.out.println("");
                    continue;
                }
                
                if(moving <= storage1.contains()){
                    if((moving + storage2.contains()) > 100){
                        storage2.clear();
                        storage2.add(100);
                        int result = storage1.contains() - moving;
                        storage1.clear();
                        storage1.add(result);
                        System.out.println("");
                    }
                }
                
                if(moving > storage1.contains()){
                    System.out.println("");
                    storage2.add(storage1.contains());
                    storage1.clear();
                    continue;
                }

                if ( moving + storage2.contains() > 0 && moving + storage2.contains() < 100){
                    if(storage1.contains() >= moving){
                        int updatestorage1 = storage1.contains() - moving; storage1.clear(); storage1.add(updatestorage1);
                        storage2.add(moving); System.out.println("");
                    }
                }
            }else if(command.equals("remove")){
                int removeAmount = Integer.parseInt(parts[1]);
                storage2.remove(removeAmount);
                System.out.println("");
            }
        }

    }

}
