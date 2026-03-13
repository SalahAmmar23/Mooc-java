public class List<Type> { // Type is a placeholder for what the caller gonna add to it
    private Type[] values;
    private int firstFreeIndex;

    public List() {
        this.values = (Type[]) new Object[10];
        firstFreeIndex = 0;
    }

    public void add(Type value){
        if(this.firstFreeIndex == this.values.length) grow();
        values[firstFreeIndex] = value;
        firstFreeIndex++;
    }

    private void grow(){
        int newSize = this.values.length + this.values.length/2;
        Type[] newArray = (Type[]) new Object[newSize];

        for(int i = 0; i< this.values.length; i++){
            this.values[i] = newArray[i];
        }

        this.values = newArray;
    }

    public boolean contains(Type value){
        return indexOfValue(value) >= 0;
    }

    public void remove(Type value) {
       int index = indexOfValue(value);
       if(index < 0){
           return;
       }
       moveToTheLeft(index);
       firstFreeIndex--;
    }

    public int indexOfValue(Type value){
        for(int i = 0; i < firstFreeIndex; i++){
            if(this.values[i].equals(value)){
                return i;
            }
        }
        return -1;
    }

    private void moveToTheLeft(int fromIndex){
        for(int i = fromIndex; i < firstFreeIndex -1; i++){
            this.values[i] = this.values[i+1];
        }
    }

    public Type value(int index){
        if(index < 0 || index >= firstFreeIndex){
              throw new ArrayIndexOutOfBoundsException("Index " + index + " outside of [0, " + this.firstFreeIndex + "]");
        }
        return this.values[index];
    }

    public int size() {
        return this.firstFreeIndex;
    }


}