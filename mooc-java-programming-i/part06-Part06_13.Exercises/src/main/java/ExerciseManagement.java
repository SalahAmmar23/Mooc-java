import java.util.ArrayList;


public class ExerciseManagement {

    private ArrayList<Exercise> exercises;

    public ExerciseManagement(){
        this.exercises = new ArrayList<>();
    }

    public ArrayList<String> exerciseList(){    
        
        ArrayList<String> list = new ArrayList<>();
        for(Exercise exercise1 : this.exercises){
            list.add(exercise1.getName());
        }
        return list;
    }

    public void add(String exercise){
        this.exercises.add(new Exercise(exercise));
    }


    public void markAsCompleted(String exercise){
        for(Exercise exercise2 : this.exercises){
            if(exercise2.getName().equals(exercise)){
                exercise2.setCompleted(true);
            }
        }
    }

    public boolean isCompleted(String exercise){
        for(Exercise exercise3: this.exercises){
            if(exercise3.getName().equals(exercise)){
                return exercise3.isCompleted();
            }
        }
        return false;
    }





}
