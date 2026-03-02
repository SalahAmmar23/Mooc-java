
import java.util.Scanner;
import java.util.ArrayList;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> firstStorage = new ArrayList<>();
        ArrayList<Integer> secondStorage = new ArrayList<>();



        while (true) {
             int sum1 = 0;
            for(int content : firstStorage){
                sum1 += content;
            }

            int sum2 = 0;
            for(int content : secondStorage){
                sum2 += content;
            }

            System.out.println("First: " + sum1 + "/100");
            System.out.println("Second: " + sum2 + "/100");
            String input = scan.nextLine();
            
            if (input.equals("quit")) {
                break;
            }  
           
            String[] parts = input.split(" ");
            String command = parts[0];
            

            if(input.contains("add")){
                int adding = Integer.parseInt(parts[1]);

                if(adding <0){
                    System.out.println("");
                    continue;
                }

                if(sum1 + adding > 100){
                    firstStorage.clear();
                    firstStorage.add(100);
                    System.out.println("");
                }


                if(sum1 + adding < 100 && sum1 + adding > 0){
                    firstStorage.add(adding);
                    System.out.println("");
                }
            }


            if(command.equals("move")){
                int moving = Integer.parseInt(parts[1]);

                if(firstStorage.isEmpty()){
                    System.out.println("");
                    continue;
                }

                if(moving < 0){
                    System.out.println("");
                    continue;
                }


                if(moving + sum2 > 100){
                    firstStorage.clear();
                    secondStorage.clear();
                    firstStorage.add(0);
                    secondStorage.add(100);
                    System.out.println("");
                }

                if(moving > sum1){
                    firstStorage.clear();
                    secondStorage.add(sum1);
                }

                if(sum2 + moving < 100 && sum2 + moving >0){
                    if(moving > sum1){
                        System.out.println("");
                        continue;
                    }
                    if(sum1 >= moving){
                        sum1 -= moving;
                        secondStorage.add(moving); 
                        firstStorage.clear();
                        firstStorage.add(sum1);
                        System.out.println("");
                    }
                    
                }
                
            }


            if(command.equals("remove")){
                int removeAmount = Integer.parseInt(parts[1]);

                
                if(removeAmount > sum2){
                    secondStorage.clear();
                    secondStorage.add(0);
                    System.out.println("");
                    continue;
                }
                
                if(sum2 - removeAmount < 0 || removeAmount < 0){
                    System.out.println("");
                    continue;
                }


                sum2 -= removeAmount;
                secondStorage.clear();
                secondStorage.add(sum2);
                System.out.println("");
            }

        }
    }

}
