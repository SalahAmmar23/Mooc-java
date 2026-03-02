import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary idk;

    public TextUI(Scanner scanner, SimpleDictionary idk) {
        this.scanner = scanner;
        this.idk = idk;
    }

    public void start(){
        while(true){
            System.out.print("Command: ");
            String storing = this.scanner.nextLine();

            if(storing.equals("end")){
                System.out.println("Bye bye!");
                break;
            }


            if(storing.equals("add")){
                System.out.print("Word: ");
                String word = scanner.nextLine();

                System.out.print("Translation: ");
                String trans = scanner.nextLine();

                this.idk.add(word, trans);
                continue;
            }

            if(storing.equals("search")){

                System.out.print("To be translated: ");
                String getWord = scanner.nextLine();

                if(!(this.idk.contains(getWord))    || this.idk == null){
                    System.out.println("Word " + getWord + " was not found");
                    continue;
                }
               

                System.out.println("Translation: " + this.idk.translate(getWord));
                continue;
            }



            System.out.println("Unknown command");
        }
    }
}
