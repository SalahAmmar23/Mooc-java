
import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int beginning = 1;
        int end = 5;

        printStars(beginning, end);

        reader.close(); 

        

    }


    public static int sum(int num1, int num2, int num3, int num4){
        return num1+num2+num3+num4;
    }
    public static int smallest(int num1, int num2){
        if(num1 < num2){
            return num1;
        }else if (num1 > num2) {
            return num2;
        }else{
            return num1;
        }

    }

    public static int greatest(int num1, int num2, int num3){
        if(num1 > num2){
            if(num1>num3){
                return num1;
            }else{
                return num3;
            }
        }else if (num2 > num3){
                return num2;
        }else{
            return num3;
        }
        
    }

    public static Double average(int num1, int num2, int num3, int num4){
        int sum = sum(num1, num2, num3, num4);
        return 1.0 *sum / 4;
    }   


    public static void printStars(int beginning, int end) {
        while (beginning < end) {
            System.out.print("*");
            beginning++; // same as beginning = beginning + 1
    }
        

    }


}
