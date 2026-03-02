import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // Test your class here
        Scanner scanner = new Scanner(System.in);
        WordSet wordStorage = new WordSet();
        UserInterface UserInterface = new UserInterface(wordStorage, scanner);

        UserInterface.start();
        
    }



     int end = word.length() - 1;

        int i = 0;
        while (i < word.length() / 2) {
            // method charAt returns the character at given index
            // as a simple variable
            if(word.charAt(i) != word.charAt(end - i)) {
                return false;
            }

            i++;
        }

        return true;
}

