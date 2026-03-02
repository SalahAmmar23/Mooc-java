public class SimpleDate {
    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return this.day;
    }

    public int getMonth() {
        return this.month;
    }

    public int getYear() {
        return this.year;
    }

    public boolean equals(Object compared) {
        // first compare years
        if(this == compared){
            return true;
        }
        if(!(compared instanceof SimpleDate)){
            return false;
        }

        SimpleDate comparedSimpleDate = (SimpleDate) compared;

        if(this.year == comparedSimpleDate.year && this.month == comparedSimpleDate.month && this.day == comparedSimpleDate.day){
            return true;
        }



        return false;
    } 



    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }
}




// The equals method first compares if the addresses are equal: if so, the objects are equal.
//  After this, we examine if the types of the objects are the same: if not, the objects are not equal.
//   Next,
//   the Object-type object passed as the parameter is converted to the type of the object 
//   that is being examined by using a type cast, so that the values of the object variables can be compared.
//    Below the equality comparison has been implemented for the SimpleDate class.