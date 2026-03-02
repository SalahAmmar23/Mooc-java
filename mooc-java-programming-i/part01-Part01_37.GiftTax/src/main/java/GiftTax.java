
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Value of the gift?");
        int value = Integer.valueOf(scan.nextLine());

        int taxLimit1 = 100;
        int taxmin1 = 5000;
        Double taxRate1 = 0.08;

        int taxLimit2 = 1700;
        int taxmin2 = 25000;
        Double taxRate2 = 0.10;

        int taxLimit3 = 4700;
        int taxmin3 = 55000;
        Double taxRate3 = 0.12;

        int taxLimit4 = 22100;
        int taxmin4 = 200000;
        Double taxRate4 = 0.15;

        int taxLimit5 = 142100;
        int taxmin5 = 1000000;
        Double taxRate5 = 0.17;

        
        
        if ( value >= 5000 && value <= 25000) {
            System.out.println("Tax: " +( taxLimit1 + (value - taxmin1) * taxRate1));
        }else if ( value >= 25000 && value <= 55000){
            System.out.println("Tax: " +( taxLimit2 + (value - taxmin2) * taxRate2));
        }else if ( value >= 55000 && value <= 200000){
            System.out.println("Tax: " +( taxLimit3 + (value - taxmin3) * taxRate3));
        }else if ( value >= 200000 && value <= 1000000){
            System.out.println("Tax: " +( taxLimit4 + (value - taxmin4) * taxRate4));
        }else if (value >= 1000000) {
            System.out.println("Tax: " +( taxLimit5 + (value - taxmin5) * taxRate5));
        }else {
            System.out.println("No tax!");
        }
    }
}
