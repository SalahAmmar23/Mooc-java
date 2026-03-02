import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private TodoList tries;

    public UserInterface(TodoList tries, Scanner scanner) {
        this.scanner = scanner;
        this.tries = tries;
    }

    public void start(){
        while(true){
           System.out.print("Command: ");
           String command = this.scanner.nextLine();


           if(command.equals("stop")){
                break;
           }

           if(command.equals("add")){
                System.out.print("To add: ");
                String adding = this.scanner.nextLine();
                
                this.tries.add(adding);
           }

           if(command.equals("list")){
                this.tries.print();
           }

           if(command.equals("remove")){
                System.out.print("Which one is removed? ");
                int removeIndcies = Integer.parseInt(this.scanner.nextLine());

                this.tries.remove(removeIndcies);
           }
        }
    }
}
