public class Timer {
   private ClockHand seconds;
   private ClockHand hunderedOfSeconds;

    public Timer() {
        this.hunderedOfSeconds = new ClockHand(100);
        this.seconds = new ClockHand(60);
    }

    public void advance(){
        this.hunderedOfSeconds.advance();

        if(this.hunderedOfSeconds.value() == 0){
            this.seconds.advance();
        }
    }

    public String toString(){
        return this.seconds + ":" + this.hunderedOfSeconds;
    }


}
