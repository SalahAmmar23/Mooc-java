import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse {
    private Map<String, Integer> products;
    private Map<String, Integer> productsStock;

    public Warehouse() {
        products = new HashMap<>();
        productsStock = new HashMap<>();
    }






    public void addProduct(String product ,int price ,int stock ) {
        products.put(product, price);
        productsStock.put(product, stock);

    }

    public int price(String product){
        if(this.products.containsKey(product)){
            return this.products.get(product);
        }else {
            return -99;
        }
    }

    public int stock(String product){
        if(this.products.containsKey(product)){
            return this.productsStock.get(product);
        }else {
            return 0;
        }
    }

    public boolean take(String product){
        if(!(this.productsStock.containsKey(product)) || this.productsStock.get(product) <= 0 ){
            return false;
        }else{
            this.productsStock.put(product, this.productsStock.get(product) - 1); 
            return true;
        }
    }

    public Set<String> products(){
            return  this.products.keySet();
    }


}
