public class Container {
    private int amount;
    

    public Container(){
        amount = 0;
    }


    public int contains(){
        return amount;
    }

    public void add(int amount){
        if(amount < 0){
            return;
        }else if((this.amount + amount) > 100){
            this.amount = 100;
        }else{
            this.amount += amount;
        }
    }

    public void remove(int amount){
         if(amount < 0){
            return;
        }else if(amount > this.amount){
            this.amount = 0;
        }else{
            this.amount -= amount;
        }
    }

    @Override 
    public String toString(){
        return amount+"/100";
    }

}









          
 