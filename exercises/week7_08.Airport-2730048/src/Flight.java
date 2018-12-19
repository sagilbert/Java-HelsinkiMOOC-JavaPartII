/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sam
 */
public class Flight {
    private Airplane airplane;
    private String src;
    private String dest;
    
    public Flight(Airplane airplane, String src, String dest) {
        this.airplane = airplane;
        this.src = src;
        this.dest = dest;
    }
    @Override
    public String toString() {
        return this.airplane.getID() + " (" + this.airplane.getCap() + " ppl) ("
                + this.src + "-" + this.dest + ")";
    }
    
}
