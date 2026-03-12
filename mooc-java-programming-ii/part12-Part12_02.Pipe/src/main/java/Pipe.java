import java.util.ArrayList;

public class Pipe<T> {
    private ArrayList<T> list;

    public Pipe() {
        list = new ArrayList<>();
    }


    public void putIntoPipe(T value) {
        list.add(value);
    }

    public T takeFromPipe(){
        if(list.size() == 0) return null;
        T helpervar = list.get(0);
        list.remove(0);
        return helpervar;
    }

    public boolean isInPipe(){
        if(list.size() == 0) return false;
        return true;
    }

}
