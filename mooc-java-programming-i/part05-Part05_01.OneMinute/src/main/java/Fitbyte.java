public class Fitbyte {

    private int age;
    private int resetingHeartRate;


    public Fitbyte(int initialAge, int initialResetingHeartRate){
        this.age= initialAge;
        this.resetingHeartRate= initialResetingHeartRate;
    }

    public double maxHeartRate(){
        return 206.3 - (.711* this.age);
    }

    public double targetHeartRate(double percentageOfMaximum){
        return (maxHeartRate() - this.resetingHeartRate) * (percentageOfMaximum) + this.resetingHeartRate;
    } 
}
