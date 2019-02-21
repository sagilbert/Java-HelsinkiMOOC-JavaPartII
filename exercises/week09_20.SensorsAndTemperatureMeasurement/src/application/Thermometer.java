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
import java.util.Random;
public class Thermometer implements Sensor {
    
    private boolean status;
    private Random random;

    public Thermometer() {
        this.status = false;
        this.random = new Random();

    }

    @Override
    public boolean isOn() {
        return this.status;
    }

    @Override
    public void on() {
        this.status = true;
    }

    @Override
    public void off() {
        this.status = false;
    }

    @Override
    public int measure() {
        int toAdd;
        if (isOn()) {
            toAdd = this.random.nextInt(61) - 30;
            return toAdd;
        } else {
            throw new IllegalStateException();
        }
    }
    
}
