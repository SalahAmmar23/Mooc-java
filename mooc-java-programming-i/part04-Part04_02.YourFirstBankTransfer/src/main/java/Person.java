public class Person {

    private String name;
    private int age;
    private int weight;
    private int height;


    public Person(String initialName){
        this.name = initialName;
        this.age = 0;
        this.weight = 0;
        this.height = 0;
    }

    public Person(String initalName, int initialAge){
        this.name = initalName;
        this.age = initialAge;
        this.weight = 0;
        this.height = 0;
    }

    public void growAge(){
        this.age++;
    }

    public boolean adult(){
        return this.age >= 18;
    }



    public int getAge(){
        return this.age;
    }

    public String getName(){
        return this.name;
    }

    public void setHeight(int height){
        this.height = height;
    }

    public double bodyMassIndex(){
        double heightByHundred = this.height /100.0;
        return this.weight / (heightByHundred * heightByHundred);
    }


    
    public String toString(){
        return this.name + " , age " + this.age + " years";
    }
}
