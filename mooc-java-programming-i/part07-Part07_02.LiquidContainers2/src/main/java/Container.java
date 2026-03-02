public class Container {

    private int liquidStorage;

    public Container() {
        this.liquidStorage = 0;
    }

    public int contains(){
        return this.liquidStorage;
    }

    public void add(int amount){
        
        if(amount > 100 || amount + this.liquidStorage > 100){
            this.liquidStorage = 100;
        }
        if(amount > 0 && amount < 101){

            if((amount + this.liquidStorage)  < 101){
               this.liquidStorage += amount;
            }else if ((amount + this.liquidStorage) > 100){
                this.liquidStorage = 100;
            }
        }
    }

    public void remove(int amount){
        if(amount > 0 && amount < 101){
            if((this.liquidStorage - amount) < 0){
                this.liquidStorage = 0;
            }
            if((this.liquidStorage - amount) > 0){
                this.liquidStorage -= amount;
            }
        }
    }

    public boolean isEmpty(){
        return this.liquidStorage == 0;
    }

    public void clear(){
        this.liquidStorage = 0;
    }

    public String toString(){
        return this.contains() +"/100";
    }
}
