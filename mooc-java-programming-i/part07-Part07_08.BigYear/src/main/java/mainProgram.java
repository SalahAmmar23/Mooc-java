
import java.util.ArrayList;
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);
        ArrayList<Bird> birds = new ArrayList<>();

        while(true){
            System.out.print("? ");
            String command = scan.nextLine();

            if(command.toLowerCase().equals("add")){
                System.out.print("Name: ");
                String name = scan.nextLine();
                System.out.print("Name in Latin: ");
                String nameInLatin = scan.nextLine();

                birds.add(new Bird(name, nameInLatin));
                
            }else if(command.toLowerCase().equals("observation")){
                System.out.print("Bird? ");
                String birdName = scan.nextLine();
                boolean found = false;

                for(Bird check : birds){
                    if(birdName.equals(check.getName())){
                        check.addObservation();
                        found = true;
                    }
                }
                if(!found){
                    System.out.println("Not a bird!");
                }

            }else if(command.toLowerCase().equals("all")){
                birds.sort((a, b) -> b.getObservationCount() - a.getObservationCount());
                for(Bird all : birds){
                    System.out.println(all);
                }
            }else if(command.toLowerCase().equals("one")){
                System.out.print("Bird? ");
                String onebirdPrinting = scan.nextLine();

                for(Bird checking : birds){
                    if(checking.getName().equals(onebirdPrinting)){
                        System.out.println(checking);
                    }
                }

            }else if(command.toLowerCase().equals("quit")){
                break;
            }


        }

    }

}
