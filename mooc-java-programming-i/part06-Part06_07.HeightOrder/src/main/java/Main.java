import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // Test your class here
        Scanner scanner = new Scanner(System.in);
        WordSet wordStorage = new WordSet();
        UserInterface UserInterface = new UserInterface(wordStorage, scanner);

        UserInterface.start();
        
    }
}

