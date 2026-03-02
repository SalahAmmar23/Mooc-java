
public class Statistics {


    private int count;
    private int sum;
    
    public Statistics() {
        // initialize the variable numberCount here
        this.count = 0;
        this.sum = 0;
   }




    public void addNumber(int newNumber){
        this.sum += newNumber;
        this.count++;
    }

    public int getCount(){
        return this.count;
    }

    public int sum() {
        // write code here
        return this.sum;
    }

    public double average() {
        // write code here
        if(this.count>0){
            return 1.0*this.sum/this.count;
        }
        return 0;
    }
}
