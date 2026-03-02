
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        



        christmasTree(10);


        reader.close();
    }





    public static void printStars(int number){
        for(int i =0; i< number; i++){
            System.out.print("*");
        }
        System.out.println("");
    }


    public static void printSquare(int size){
        for(int i = 1; i<= size; i++){
            printStars(size);
        }
    }


    public static void printRectangle(int width, int height){
        for(int i = 1; i <= height; i++){
            printStars(width);
        }
    }

    public static void printTriangle(int size){
        for(int i = 1; i<=size; i++){
            printStars(i);
        }
        
    }


    public static void printSpaces(int number){
        for(int i =1; i<= number; i++){
            System.out.print(" ");
        }
    }

    public static void rightAlignedTriangle(int size){ 
        int incrementation = 1;

        for(int i =size; i>= 1; i--){
            printSpaces(i); printStars(incrementation);
            incrementation= incrementation +1;
        }

    }


    public static void christmasTree(int height){
        for(int i = 1; i <= height; i++){
            printSpaces(height - i);
            
           
            printStars(2 * i-1);
        }

        for(int j = 1; j <=2; j++){
            printSpaces((height * 2 -1-3) / 2);
            printStars(3);
        }


    }   


}
