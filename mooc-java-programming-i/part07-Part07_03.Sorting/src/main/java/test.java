import java.util.Scanner;

public class test {
    
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = Integer.valueOf(reader.nextLine());

        if(age < 18) {
            System.out.println("You are a minor.");
        }else if(age >= 65){
            System.out.println("You are a senior citizen.");
        }else if (age >= 18){
            System.out.println("Your are an adult.");
        }
        
    }
}
