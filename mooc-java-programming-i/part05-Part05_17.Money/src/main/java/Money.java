
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public Money plus(Money addition){
        int updatedE = this.euros + addition.euros;
        int updatedC = this.cents + addition.cents;

        if(updatedC > 99){
            updatedE = updatedE+ updatedC /100;
            updatedC = updatedC % 100;
        }

        Money newMoney = new Money(updatedE, updatedC);

        return newMoney;
    }

    public boolean lessThan(Money compared){
        return this.euros < compared.euros || (this.euros == compared.euros && this.cents < compared.cents);
    }
    public Money minus(Money decreaser){
        if(this.lessThan(decreaser)){
            return new Money(0, 0);
        }
        int updatedE = this.euros - decreaser.euros;
        int updatedC = this.cents - decreaser.cents;

        if(updatedC < 0){
            updatedE -= 1;
            updatedC += 100;
        }

        return new Money(updatedE, updatedC);
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
