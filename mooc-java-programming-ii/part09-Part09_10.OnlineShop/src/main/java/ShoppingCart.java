import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private Map<String, Item> carts;

    public ShoppingCart() {
        carts  = new HashMap<String,Item>();
            
    
    }

    public void add(String product, int price){
        if(carts.containsKey(product)){
            carts.get(product).increaseQuantity();
        }else{
           carts.putIfAbsent(product, new Item(product, 1, price));
        }
    }

    public int price(){

        int sum = 0;
        for(Item s : this.carts.values() ){
            sum += s.price();
        }

        return sum; 
    }

    public void print(){
        for(Item s : this.carts.values()){
            System.out.println(s);
        }
    }   


}
