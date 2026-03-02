import java.util.ArrayList;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Calculator test = new Calculator();

        test.add(5);
        test.subtract(2);
        System.out.println(test.getValue());
    }
}
