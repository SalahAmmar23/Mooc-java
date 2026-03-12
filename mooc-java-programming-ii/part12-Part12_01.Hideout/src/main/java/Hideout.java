import java.util.ArrayList;

public class Hideout<T> {
    private T hideObject;

    public Hideout() {
    }

    public void putIntoHideout(T toHide){
        hideObject = toHide;
    }

    public T takeFromHideout(){
        if(hideObject == null) return null;
        T helperVar = hideObject;
        hideObject = null;
        return helperVar;
    }

    public boolean isInHideout(){
        if(hideObject == null) return false;
        return true;
    }


}
