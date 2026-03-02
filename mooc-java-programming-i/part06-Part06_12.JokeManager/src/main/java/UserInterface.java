import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private JokeManager jokes;

    public UserInterface(JokeManager jokes , Scanner scanner) {
        this.scanner = scanner;
        this.jokes = jokes;
    } 

    public void start(){
        while(true){

            System.out.println("Commands: ");
            System.out.println("1 - add a joke");
            System.out.println("2 - draw a joke");
            System.out.println("3 - list jokes");
            System.out.println("4 - stop");
            String command = scanner.nextLine();

            if(command.equals("X")){
                break;
            }else if (command.equals("1")){
                System.out.println("Write the joke to be added:");
                String additionJoke = scanner.nextLine();

                this.jokes.addJoke(additionJoke);
            }else if(command.equals("2")){
                System.out.println("Drawing a joke.");
                System.out.println(this.jokes.drawJoke());
            }else if(command.equals("3")) {
                System.out.println("Printing the jokes.");
                this.jokes.printJokes();
            }

        }
    }

}
