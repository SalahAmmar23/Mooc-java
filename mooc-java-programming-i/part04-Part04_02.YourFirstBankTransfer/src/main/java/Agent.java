public class Agent {
    private String name;
    private String lastname;

    public Agent(String initialFirstName, String initialSecondName){
        this.name = initialFirstName;
        this.lastname = initialSecondName;
    }

    public String toString(){
        return "My name is " + this.lastname + ", "+ this.name+ " " + this.lastname;
    }

    
}
