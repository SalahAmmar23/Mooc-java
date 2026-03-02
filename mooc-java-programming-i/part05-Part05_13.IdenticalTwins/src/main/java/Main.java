
public class Main {

    public static void main(String[] args) {
        // you can write code here to try out your program
        Bird red = new Bird("Red");
        System.out.println(red);

        Bird chuck = new Bird("Chuck");
        System.out.println(chuck);

        if (red.equals(chuck)) {
            System.out.println(red + " equals " + chuck);
        }else{
            System.out.println("Not equals");
        }

    }
}
