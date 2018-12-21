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
//import application.*;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Sensor kumpula = new Thermometer();
    Sensor kaisaniemi = new Thermometer();
    Sensor helsinkiVantaa = new Thermometer();

    AverageSensor helsinkiArea = new AverageSensor();
    helsinkiArea.addSensor(kumpula);
    helsinkiArea.addSensor(kaisaniemi);
    helsinkiArea.addSensor(helsinkiVantaa);

    helsinkiArea.on();
    System.out.println("the temperature in Helsinki area is "+helsinkiArea.measure() + " degrees");
    System.out.println("the temperature in Helsinki area is "+helsinkiArea.measure() + " degrees");
    System.out.println("the temperature in Helsinki area is "+helsinkiArea.measure() + " degrees");

    System.out.println("readings: "+helsinkiArea.readings());
}
    }
