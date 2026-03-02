import java.util.ArrayList;

public class TodoList{

    private ArrayList<String> tasks;


    public TodoList(){
        tasks = new ArrayList<>();
    }

    public void add(String task){
        tasks.add(task);
    }

    public void print(){
        int counter = 1;
        for(String s : tasks){
            System.out.println( counter+": " + s );
            counter++;
        }
    }

    public void remove(int number){
        tasks.remove(number-1);
    }

}