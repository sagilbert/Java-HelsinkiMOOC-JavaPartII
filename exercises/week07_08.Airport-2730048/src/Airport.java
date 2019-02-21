/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sam
 */
import java.util.ArrayList;
import java.util.List;
public class Airport {
    private List<Airplane> airplanes;
    private List<Flight> flights;
    public Airport() {
        this.airplanes = new ArrayList<Airplane>();
        this.flights = new ArrayList<Flight>();
    }
    public void addPlane(Airplane airplane) {
        this.airplanes.add(airplane);
    }

    public void addFlight(String id, String src, String dest) {
        Airplane flightPlane = this.getPlane(id);
        if (flightPlane != null) {       
            this.flights.add(new Flight(flightPlane, src, dest));
        }
    }
    public Airplane getPlane(String id) {
        for (Airplane a : airplanes) {
            if (a.getID().equals(id)) {
                return a;
            }
        }
        return null;
    }
    public List<Flight> getFlights() {
        return this.flights;
    }
    public List<Airplane> getPlanes() {
        return this.airplanes;
    }
    @Override
    public String toString() {
        return "Planes: " + this.airplanes + ", Flights:  " + this.flights;
    }
    
}
