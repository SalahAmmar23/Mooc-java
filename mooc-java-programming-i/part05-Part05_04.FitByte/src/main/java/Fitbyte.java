public class Fitbyte {
    private int age;
    private int restingHR;

    public Fitbyte(int age, int restingHR){//30, 60
        this.age= age;
        this.restingHR = restingHR;
    }

    public double maxHR(){
       return  206.3 - (0.711 * age);
    }

    public double targetHeartRate(double percentageOfMaximum){
        return ((maxHR() - this.restingHR) * (percentageOfMaximum) + this.restingHR);
    }


}
