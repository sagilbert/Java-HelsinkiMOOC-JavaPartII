/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sam
 */
public class Calculator {
    private Reader reader;
    private int calcs;
    public Calculator() {
        this.reader = new Reader();
        this.calcs = 0;
    }
    public void start() {
        while (true) {
            System.out.print("command: ");
            String command = reader.readString();
            if (command.equals("end")) {
                break;
            }

            if (command.equals("sum")) {
                sum();
            } else if (command.equals("difference")) {
                difference();
            } else if (command.equals("product")) {
                product();
            }
        }

        statistics();
    }
    private void sum() {
       int[] values = getValues();
       System.out.println("sum of the values " + (values[0]+values[1]));
       this.calcs++;
        System.out.println("");
    }
    
    private void difference() {
        int[] values = getValues();
       // print the value according to the example above
        System.out.println("difference of the values " + (values[0] - values[2]));
        this.calcs++;
        System.out.println("");
    }
    
    private void product() {
        int[] values = getValues();
        System.out.println("product of the values " + values[0]*values[1]);    
        this.calcs++;
        System.out.println("");
    }
    private void statistics() {
        System.out.println("Calculations done " + this.calcs);
        
    }
    
    private int[] getValues() {
        int[] values = new int[2];
        System.out.print("value1: ");
        values[0] = this.reader.readInteger();
        System.out.print("value2: ");
        values[1] = this.reader.readInteger();
        return values;
    }
    
}
