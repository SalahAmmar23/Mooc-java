
public class MainProgram {

    public static void main(String[] args) {
        // you can create test code here. Call the methods that you'll implement
        // during the course of this exercise

            String name = "20:59:59";
            if(name.matches("(([01][0-9])|(2[0-3])):[0-5][0-9]:[0-5][0-9]")){
                System.out.println("right digits");
            }else{
                System.out.println("Not right");
            }
        
    }
}
