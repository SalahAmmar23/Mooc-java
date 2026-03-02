
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter username: ");
        String username1 = scanner.nextLine();

        System.out.println("Enter password: ");
        String password1 = scanner.nextLine();

        if (username1.equals("alex") && password1.equals("sunshine")  || username1.equals("emma") && password1.equals("haskell") ){
            System.out.println("You have successfully logged in!");
        }else {
            System.out.println("Incorrect username or password!");
        }
    }
}
