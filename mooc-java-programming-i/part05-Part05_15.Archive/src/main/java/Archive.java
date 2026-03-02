public class Archive {
    private String id;
    private String name;

    public Archive(String initialID, String initialName) {
        this.id = initialID;
        this.name = initialName;
    }

    @Override
    public String toString(){
        return this.id + ": "+ this.name;
    }

    @Override
    public boolean equals(Object compared){
        if(this == compared){
            return true;
        }

        if(!(compared instanceof Archive)){
            return false;
        }

        Archive comparedConversion = (Archive) compared;

        if(this.id.equals(comparedConversion.id)){
            return true;
        }
        return false;
    }
    

    
}
