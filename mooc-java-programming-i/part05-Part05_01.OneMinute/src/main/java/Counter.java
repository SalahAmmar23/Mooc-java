

public class Counter {
    private int value;


    public Counter(int initialValue){
        this.value = initialValue;
    }

    public Counter(){
        this(0);
    }

    public int getVlaue(){
        return this.value;
    }
    public void increase(){
        this.value++;
    }
    public void increase(int increaseBy){
        if(increaseBy > 0){
            this.value += increaseBy;
       } 
    }

    public void decrease(){
        this.value--;
    }

    public void decrease(int decreaseBy){
       if(decreaseBy > 0){
            this.value -= decreaseBy;
       }
    }
}
