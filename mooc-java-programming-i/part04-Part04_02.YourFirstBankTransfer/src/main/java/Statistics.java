public class Statistics {

    private int count;
    private int sum;


    public Statistics(){

    }

    public void addNumber(int number){  
        this.sum+= number;
        this.count++;
    }


    public int getCount(){
        return this.count;
    }

    public int getSum(){
        return this.sum;
    }

    public double average(){
        if(count ==0){
            return 0;
        }else {
            return 1.0* sum/count;
        }
    }

}
