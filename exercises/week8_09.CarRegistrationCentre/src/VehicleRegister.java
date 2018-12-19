/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sam
 */
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

public class VehicleRegister {
    private Map<RegistrationPlate, String> registry;
    
    public VehicleRegister() {
        this.registry = new HashMap<RegistrationPlate, String>();
    }
    
    public boolean add(RegistrationPlate plate, String owner) {
        if (!registry.containsKey(plate)) {
            registry.put(plate, owner);
            return true;
        } else {
            registry.put(plate, owner);
            return false;
        }
    }
    
    public String get(RegistrationPlate plate) {
        if (registry.containsKey(plate)) {
            return registry.get(plate);
        }
        return null;
        
    }
    public boolean delete(RegistrationPlate plate) {
        if (registry.containsKey(plate)) {
            registry.remove(plate);
            return true;
        } else {
            return false;
        }
        
    }
    public void printRegistrationPlates() {
        for (RegistrationPlate key : registry.keySet()) {
            System.out.println(key);
        }
    }
    public void printOwners() {
        List<String> toPrint = new ArrayList<String>();
        for (RegistrationPlate key : registry.keySet()) {
            if (!toPrint.contains(registry.get(key))) {
                toPrint.add(registry.get(key));
            }
        }
        for (String s : toPrint) {
            System.out.println(s);
        }
    
    }
    
}
