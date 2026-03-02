
public class Main {

    public static void main(String[] args) {
        // Test your Debt class here
        Debt v = new Debt(1500.0, 2.0);
        v.waitOneYear();
        v.waitOneYear();
        v.printBalance();
    }
}
