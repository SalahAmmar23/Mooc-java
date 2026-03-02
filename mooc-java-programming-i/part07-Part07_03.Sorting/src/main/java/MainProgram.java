import java.util.Arrays;


public class MainProgram {


    public static void main(String[] args){
    int[] numbers = {8, 3, 7, 9, 1, 2, 4};
MainProgram.sort(numbers);
    }

    public static int smallest(int[] array){
        int smallestElement = array[0];

        for(int i = 1; i< array.length; i++){
            if(array[i] < smallestElement){
                smallestElement = array[i];
            }
        }

        return smallestElement;
    }

    public static int indexOfSmallest(int[] array){
        int smallestElement = array[0];
        int indexOfSmallestElement = 0;

        for(int i=1; i < array.length; i++){
            if(array[i] < smallestElement){
                smallestElement = array[i];
                indexOfSmallestElement = i;
            }
        }

        return indexOfSmallestElement;
    }


    public static int indexOfSmallestFrom(int[] array, int startIndex){
        int smallestElement = array[startIndex];
        int indexOfSmallestElement = startIndex;

        for(int i =startIndex+1; i< array.length; i++){
            if(array[i] < smallestElement){
                smallestElement = array[i];
                indexOfSmallestElement = i;
            }
        }

        return indexOfSmallestElement;
    }

    public static void swap(int[] array, int index1, int index2){
        int helper = array[index1];
        array[index1] = array[index2];
        array[index2] = helper;
    }


    public static void sort(int[] array){
  
        for(int i =0; i < array.length; i++){
            swap(array, i, indexOfSmallestFrom(array, i));
            System.out.println(Arrays.toString(array));
        }        
    }
}