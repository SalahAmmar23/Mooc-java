import java.util.Scanner;


public class UserInterface {

    private Scanner scanner;
    private GradeRegister register;
    
    
    public UserInterface(GradeRegister register, Scanner scanner) {
            this.register = register;
            this.scanner = scanner;        
    }

    public void start(){
        readPoints();
        System.out.println("");
        printGradeDistribution();
    }

    public void readPoints(){
        while(true){

                
            System.out.print("Points: ");
            String points = this.scanner.nextLine();

            if(points.equals("")){
                break;
            }

            int pointsToInt = Integer.parseInt(points);

            if(pointsToInt < 0 || pointsToInt > 100){
                System.out.print("Impossible Input.");
                continue;
            }

            this.register.addGradeBasedOnPoints(pointsToInt);
        }
    }

    public void printGradeDistribution(){
        for(int i = 5; i> 0; i--){
            int stars = register.numberOfGrades(i);
            System.out.print(i + ": ");
            printStars(stars);
            System.out.println("");
        }
    }

    public void printStars(int stars){
        for(int i =stars; i > 0; i--){
            System.out.print("*");
        }
    }








}
