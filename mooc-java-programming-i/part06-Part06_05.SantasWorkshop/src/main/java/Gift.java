public class Gift {
    private String name;
    private int weight;

    public Gift(String initialName, int initialWeight) {
        this.name = initialName;
        this.weight = initialWeight;
    }

    public String getName(){
        return this.name;
    }

    public int getWeight(){
        return this.weight;
    }


    public String toString(){
        return this.name + " (" + this.weight + " kg)";
    }
    
}
