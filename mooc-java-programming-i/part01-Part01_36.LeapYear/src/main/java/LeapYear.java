
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a year:");
        int year = Integer.valueOf(scan.nextLine());

        if (year % 400 == 0){
            System.out.println("The year is a leap year");
        }else if ((year % 4) == 0 && (year % 100) != 0){
            System.out.println("The year is a leap year.");
        }else {
            System.out.println("The year is not a leap year.");
        }

    }
}


/* 
to be able to do this u need to understand leap year conditions
- if a year is divisible by  400  >> leap year
- if a year is divisible by 4 and not divisible by 100 >> leap year
- otherwise it's not a leap year 
*/ 