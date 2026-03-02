
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        int i = 0;
        while(i < number){
            System.out.print("*");
            i++;
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        int i=0;
        while(i < number){
            System.out.print(" ");
            i++;
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise

        int lineCounter = 1;

        while( lineCounter <= size){
            printSpaces(size - lineCounter);
            printStars(lineCounter);
            lineCounter++;
        }    
    }

    public static void christmasTree(int height) {
         // part 3 of the exercise
        int i = 1;

        while(i <= height){
            printSpaces(height - i);
            printStars(2 *i - 1);
            i++;
        }

        int j = 0;
        while (j < 2) {
            printSpaces(height - 2);
            printStars(3);
            j++;
        }


    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

    
        printTriangle(4);
        System.out.println("---");
        christmasTree(4);
        // System.out.println("---");
        // christmasTree(10);
    }
}







/*
ididnt look at the answer i want hints again without answer this is the question : 
Printing a Christmas tree
Define a method called christmasTree(int height) that prints the correct Christmas tree. The Christmas tree consists of a triangle with the specified height as well as the base. The base is two stars high and three stars wide, and is placed at the center of the triangle's bottom. The tree is to be constructed by using the methods printSpaces and printStars.

For example, the call christmasTree(4) should print the following:

Sample output

   *
  ***
 *****
*******
  ***
  ***
The call christmasTree(10) should print:

Sample output

         *
        ***
       *****
      *******
     *********
    ***********
   *************
  ***************
 *****************
*******************
        ***
        ***
 */