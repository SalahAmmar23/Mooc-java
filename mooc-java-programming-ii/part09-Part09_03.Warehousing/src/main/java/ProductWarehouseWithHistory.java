
public class ProductWarehouseWithHistory extends ProductWarehouse {
    private ChangeHistory initialBalance= new ChangeHistory();


    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        super.addToWarehouse(initialBalance);
        this.initialBalance.add(initialBalance);

    }

    @Override
    public void addToWarehouse(double amount) {
       super.addToWarehouse(amount);
       initialBalance.add(getBalance());
    
    }


    @Override
    public double takeFromWarehouse(double amount) {
        double taken = super.takeFromWarehouse(amount);
        initialBalance.add(getBalance());
        return taken;
    }



    public void printAnalysis(){
        System.out.println("Product: " + getName());
        System.out.println("History: " +   initialBalance);
        System.out.println("Largest amount of product: " + initialBalance.maxValue());
        System.out.println("Smallest amount of product: " + initialBalance.minValue());
        System.out.println("Average: " + initialBalance.average());
    }

    public String history() {
        return initialBalance.toString();
    }
}
