import java.util.ArrayList;

public class GradeRegister {

    private ArrayList<Integer> grades;

    public GradeRegister() {
        this.grades = new ArrayList<>();
    }
    public void addGradeBasedOnPoints(int points){
        this.grades.add(convertPointsToGrades(points));        
    }



    public int numberOfGrades(int grade){
        int count = 0;

        for(int score : this.grades){
            if(score == grade){
                count++;
            }
        }

        return count;
    }


    public int convertPointsToGrades(int points){
        int grade =0;
        if(points < 50){
            grade= 0;
        }else if (points < 60){
            grade = 1;  
        }else if (points < 70){
            grade = 2;  
        }else if (points < 80){
            grade = 3;  
        }else if (points < 90){
            grade = 4;  
        }else {
            grade = 5;  
        }
        return grade;
    }

    public ArrayList<Integer> getGrades(){
       return  this.grades;
    }
}
