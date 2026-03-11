package application;

import java.util.Random;

public class TemperatureSensor implements Sensor {
    private boolean temp = false;

    
    public boolean isOn(){
        return this.temp;
    }
       
    public void setOn(){
        this.temp = true;
    }
    
          
    public void setOff(){
        this.temp = false;
    } 
        
    public int read(){
        if(temp){
            return new Random().nextInt(61) - 30;
        }
        throw new IllegalStateException("Failed to generate.");
    }        
}
