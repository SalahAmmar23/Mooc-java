package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {
    private List<Sensor> sensors;
    private List<Integer> listOfReadings;
    // private boolean averagesensorcondition;

    public AverageSensor() {
        sensors = new ArrayList<>();
        listOfReadings = new ArrayList<>();
    }

    public void addSensor(Sensor toAdd){
            sensors.add(toAdd);
    }

    public boolean isOn(){
        for(Sensor s : sensors){
            if(!s.isOn()){
                return false;
            }
        }
        return true;
    }   
    
    public void setOn(){
        for(Sensor s : sensors){
            s.setOn();
        }
    }     
    
    public void setOff(){
        for(Sensor s : sensors){
            s.setOff();
        }
    }    
    
    public int read(){
        if(!isOn() || sensors.size() == 0){
           throw new IllegalStateException();
        }

        int sum = 0;
        for(Sensor s : sensors){
            sum += s.read();
        }

        int helper = sum/this.sensors.size();
        listOfReadings.add(helper);
        return helper;
    }

    public List<Integer> readings(){
        return this.listOfReadings;
    }   
}