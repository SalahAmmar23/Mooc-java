
public class ArrayPrinter {

    public static void main(String[] args) {
        // You can test your method here
        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);
    }

    public static void printNeatly(int[] array) {
        // Write some code in here
        /*
         * to make it print the numbers of the array it receives more neatly.
         *  There should be a whitespace and a comma between each number.
         *  don't put a comma after the last number
         */


        for(int i = 0; i< array.length; i++){
            int indexContent = array[i];
 
            System.out.print( indexContent);

            if(i < array.length -1 ){
               System.out.print(", ");
            }
        }
    }
}
