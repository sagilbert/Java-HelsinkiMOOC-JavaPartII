/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sam
 */
import java.util.Scanner;
public class AirportPanel {
    private Scanner reader;
    private Airport airport;
    
    public AirportPanel(Scanner reader, Airport airport) {
        this.reader = reader;
        this.airport = airport;
    }
    public AirportPanel() {
        this(new Scanner(System.in), new Airport());
    }
    public void start() {
        System.out.println("Airport panel\n" +
                            "--------------------");
        System.out.println("");
        String command;
        while (true) {
            System.out.println("Choose operation:\n" +
"[1] Add airplane\n" +
"[2] Add flight\n" +
"[x] Exit");
            command = this.readIn();
            if (command.equals("x")) {
                break;
            } else if (command.equals("1")) {
                this.addAirplane();
            } else if (command.equals("2")) {
                this.addFlight();
            }
        }
        System.out.println("");
        
        System.out.println("Flight service\n" +
"------------");
        System.out.println("");
        
        
        while (true) {
            System.out.println("Choose operation:\n"+ "[1] Print planes\n" +
"[2] Print flights\n" +
"[3] Print plane info\n" +
"[x] Quit");
            command = this.readIn();
            if (command.equals("x")) {
                break;
            } else if (command.equals("2")) {
                for (Flight f : this.airport.getFlights()) {
                    System.out.println(f);
                }
                System.out.println("");
            } else if (command.equals("1")) {
                for (Airplane a : this.airport.getPlanes()) {
                    System.out.println(a);
                }
            } else if (command.equals("3")) {
                System.out.print("Give plane ID: ");
                String ID = this.readIn();
                System.out.println(this.airport.getPlane(ID));
                System.out.println("");
            }
            
        }
    }
    
    public void addAirplane() {
        System.out.print("Give plane ID: ");
        String id = this.readIn();
        System.out.print("Give plane capacity: ");
        int cap = Integer.parseInt(this.readIn());
        this.airport.addPlane(new Airplane(id, cap));
    }
    
    public void addFlight() {
        System.out.print("Give plane ID: ");
        String id = this.readIn();
        System.out.print("Give departure airport code: ");
        String src = this.readIn();
        System.out.print("Give destination airport code: ");
        String dest = this.readIn();
        this.airport.addFlight(id, src, dest);
    }
    public String readIn() {
        return this.reader.nextLine();
    }
    
    
}
