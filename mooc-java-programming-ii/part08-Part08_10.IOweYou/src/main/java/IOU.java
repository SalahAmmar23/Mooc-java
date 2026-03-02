import java.util.HashMap;

public class IOU {
    private HashMap<String, Double> owe; 

    public IOU(){
        owe = new HashMap<>();
    }


    public void setSum(String toWhom, double amount){
        owe.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String toWhom){
         return owe.getOrDefault(toWhom, 0.0);
    }
}
