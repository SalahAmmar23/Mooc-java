import java.util.ArrayList;

public class ChangeHistory   {
    private ArrayList<Double> history;

    public ChangeHistory() {
        history = new ArrayList<>();
    }

    public void add(double status) {
        history.add(status);
    }

    public void clear() {
        history.clear();
    }

    public double maxValue() {
        if(history.isEmpty()){
            return 0;
        }else{
            double largest = Double.MIN_VALUE;
            for(double s : history){
                if(s > largest){
                    largest = s;
                }
            }
            return largest;
        }
    }

    public double minValue() {
        if(history.isEmpty()) return 0;
        
        double smallest = Double.MAX_VALUE;

        for(double l : history){   
            if(l < smallest){
                smallest = l;
            }
        }
        return smallest;
    }

    public double average() {
        if(history.isEmpty()) return 0;

        double count = history.size();
        double sum = 0.0;

        for(double a : history){
            sum += a;
        }

        return sum/count;
    
    }

    @Override
    public String toString() {
        return history.toString();
    }
}
