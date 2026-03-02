public class Film {


    private String filmName;
    private int filmAgeRating;


    public Film(String initialFilmName, int initialFilamAgeRate){
        this.filmName = initialFilmName;
        this.filmAgeRating = initialFilamAgeRate;
    }


    public String name(){
        return this.filmName;
    }

    public int ageRating(){
        return this.filmAgeRating;
    }




}
