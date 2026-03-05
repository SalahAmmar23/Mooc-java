import java.util.ArrayList;

public class Herd implements Movable {
    private ArrayList<Movable> memebers;

    public Herd() {
       memebers = new ArrayList<>();
    }

    public void move(int dx, int dy) {
       for(Movable s : memebers){
            s.move(dx, dy);
       }
    }


    public void addToHerd(Movable movable){
        memebers.add(movable);
    }


    @Override
    public String toString() {
        // TODO Auto-generated method stub
        String result = "";
        for(Movable s : memebers){ 
            result += s + "\n";

        }
        return result;
    }

}
