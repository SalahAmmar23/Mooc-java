import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private WordSet words;

    public UserInterface( WordSet words, Scanner scanner) {
        this.scanner = scanner;
        this.words = words;
    }

    public void start(){
        while(true){
            System.out.print("Enter a word: ");
            String word = scanner.nextLine();

            if(this.words.contains(word)){
                break;
            }

            this.words.addWord(word);

        }
        System.out.println("You gave the same word twice!");
    }
}
