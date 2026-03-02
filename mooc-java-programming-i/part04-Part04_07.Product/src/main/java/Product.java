public class Product {
    private double price;
    private int quantity;
    private String name;

    public Product(String initialName, double initialPrice, int intitalQuantity){
        this.name = initialName;
        this.quantity = intitalQuantity;
        this.price = initialPrice;
    }

    public void printProduct(){
        System.out.println(this.name+", price "+ this.price + ", "+ this.quantity + " pcs");
    }
}
