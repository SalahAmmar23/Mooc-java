public class DecreasingCounter {

    private int value;

    public DecreasingCounter(int value){
        this.value = value;
    }

    public int printValue(){
        return this.value;
    }

    public int decrement(){
        if(this.value - 1 < 0){
            return 0;
        }else{
            return this.value--;

        }  
    }


    public void reset(){
        this.value = 0;
    }


}
