


public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;
    private int totalPrice;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
        this.totalPrice = this.princePerSquare * this.squares;
    }

    public boolean largerThan(Apartment compared){
        return this.squares > compared.squares;
    }

    public int priceDifference(Apartment compared){
       int ComparedTotalPrice = compared.princePerSquare * compared.squares; //159600
       if(this.largerThan(compared)){
            return this.totalPrice - ComparedTotalPrice;
       }
       return ComparedTotalPrice - totalPrice;
    }

    public boolean  moreExpensiveThan(Apartment compared){
        int comparedTotalPrice = compared.princePerSquare * compared.squares;
        if(this.totalPrice > comparedTotalPrice){
            return true;
        }
        return false;
    }

    
}
