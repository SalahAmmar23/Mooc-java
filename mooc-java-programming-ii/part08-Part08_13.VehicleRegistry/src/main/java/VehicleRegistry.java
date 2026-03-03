import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {
    private HashMap<LicensePlate, String> car;


    public VehicleRegistry() {
        car = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        if(car.containsKey(licensePlate)){
           return false;
        }else{
            car.put(licensePlate, owner);
            return true;
        }
    }

    public String get(LicensePlate licensePlate) {
        return car.get(licensePlate);
    }

    public boolean remove(LicensePlate licensePlate) {
        if (car.containsKey(licensePlate)) {
            car.remove(licensePlate);
            return true;
        }
        return false;
    }

    public void printLicensePlates() {
        for(LicensePlate s : car.keySet()){
            System.out.println(s);
        }
    }

    public void printOwners() {
        ArrayList<String> owners = new ArrayList<>();
        for(String s : car.values()){
            if(owners.contains(s)){
                continue;
            }else{
                owners.add(s);
                System.out.println(s);
            }
        }
    }
    


}
