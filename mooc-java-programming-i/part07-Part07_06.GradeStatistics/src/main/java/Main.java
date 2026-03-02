import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> grades = new ArrayList<>();
        
        // Write your program here -- consider breaking the program into 
        // multiple classes.
        System.out.println("Enter points totals, -1 stops:");
        
        int sum =0;
        int count =0;
        int sumOfAbove50 = 0;
        int counterAbove50 = 0;

        while(true){
            int input = Integer.parseInt(scanner.nextLine());

            if(input == -1){
                break;
            }
            if(input > 100 || input < 0){
                continue;
            }

            if(input >= 50 && input <= 100){
                sumOfAbove50 += input;
                counterAbove50++;
            }

            
            sum += input;
            count++;
            int grade = pointsToGrade(input);
            grades.add(grade);
        }

        System.out.println("Point average (all): " + 1.0 *sum/count);

        if(counterAbove50 == 0){
            System.out.println("Point average (passing): -");

        }else {
           System.out.println("Point average (passing): " + 1.0* sumOfAbove50/counterAbove50);
        }
        if(count == 0){
           System.out.println("Pass percentage: 0.0");
        }else{
           System.out.println("Pass percentage: " + 100* (1.0*counterAbove50 / count));
        }
        
        System.out.println("Grade distribution: ");
        for(int i =5; i >=0; i--){

            System.out.print(i+":");
            int countForThisGrade = 0;

            for(int grad : grades){
                if(grad == i){
                    countForThisGrade++;
                }
            }
            printStars(countForThisGrade);
            System.out.println();
        }


        

    }


    public static int pointsToGrade(int points) {
        int grade;

        if (points >= 90) {
            grade = 5;
        } else if (points >= 80) {
            grade = 4;
        } else if (points >= 70) {
            grade = 3;
        } else if (points >= 60) {
            grade = 2;
        } else if (points >= 50) {
            grade = 1;
        } else {
            grade = 0;
        }

        return grade;
    }

    public static void printStars(int amount){
        for(int i=0; i< amount; i++){
            System.out.print("*");
        }
    }
}
