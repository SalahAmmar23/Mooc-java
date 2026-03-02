import java.util.ArrayList;

public class Room {

    private ArrayList<Person> listOfPeople;

    public Room(){
        this.listOfPeople = new ArrayList<>();
    }

    public void add(Person person){
        this.listOfPeople.add(person);
    }

    public boolean isEmpty(){
        return this.listOfPeople.isEmpty();
    }

    public ArrayList<Person> getPersons(){
        return this.listOfPeople;
    }

    public Person shortest(){
        if(this.listOfPeople.isEmpty()){
            return null;
        }
        Person shortest = this.listOfPeople.get(0);


        
        for(int i = 0; i < this.listOfPeople.size(); i++){
            if(shortest.getHeight() > this.listOfPeople.get(i).getHeight()){
                shortest = this.listOfPeople.get(i);
            }
            
        }
        return shortest;
    }

    public Person take(){
        Person shortest = this.shortest();
        if(shortest == null){
            return null;
        }

        this.listOfPeople.remove(shortest);
        return shortest;
    }
    
}
