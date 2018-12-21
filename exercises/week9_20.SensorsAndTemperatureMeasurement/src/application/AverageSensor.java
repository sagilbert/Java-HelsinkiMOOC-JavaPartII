/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author sam
 */
import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {
    private List<Sensor> sensors;
    private List<Integer> readings;
    
    public AverageSensor() {
        this.sensors = new ArrayList<Sensor>();
        this.readings = new ArrayList<Integer>();
    }
    
    public void addSensor(Sensor additional) {
        this.sensors.add(additional);
    }
    
    public boolean updateStatus() {
        boolean flag = true;
        for (Sensor s : this.sensors) {
            if (!s.isOn()) {
                flag = false;
            }
        }
        return flag;
        
    }

    @Override
    public boolean isOn() {
        return this.updateStatus();
    }

    @Override
    public void on() {
        for (Sensor s : this.sensors) {
            s.on();
        }
    }

    @Override
    public void off() {
        for (Sensor s : this.sensors) {
            s.off();
        }
    }

    @Override
    public int measure() {
        int sum = 0;
        for (Sensor s : this.sensors) {
            int toAdd = s.measure();
            sum += toAdd;
        }
        int toReturn = sum / this.sensors.size();
        this.readings.add(toReturn);
        return toReturn;
    }
    public List<Integer> readings() {
        return this.readings;
    }
    
    
}
