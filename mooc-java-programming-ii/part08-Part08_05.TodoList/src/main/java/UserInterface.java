import java.util.Scanner;

public class UserInterface{
    private TodoList list;
    private Scanner scanner;

    public UserInterface(TodoList list, Scanner scanner){
        this.list = list;
        this.scanner = scanner;
    }

    public void start(){

        while(true){
            System.out.print("Command: ");
            String command = scanner.nextLine();

            if(command.toLowerCase().equals("stop")){
                break;
            }else if(command.toLowerCase().equals("add")){
                System.out.print("To add: ");
                String addtoToDoList = scanner.nextLine();

                list.add(addtoToDoList);
            }else if(command.toLowerCase().equals("list")){
                list.print();
            }else if(command.toLowerCase().equals("remove")){
                System.out.print("Which one is removed? ");
                int removeFromToDoList =  Integer.parseInt(scanner.nextLine());

                list.remove(removeFromToDoList);
            }
        }
    }
    
}