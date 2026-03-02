public class Book {

    private String title;
    private int pages;
    private int publicationyear;


    public Book(String initialTitle, int initialPages, int initialPublicationYear){
        this.title = initialTitle;
        this.pages = initialPages;
        this.publicationyear = initialPublicationYear;
    }


    public String getName(){
        return this.title;
    }


    public String toString(){
        return this.title + ", " + this.pages + " pages " + ", " + this.publicationyear; 
    }


}
