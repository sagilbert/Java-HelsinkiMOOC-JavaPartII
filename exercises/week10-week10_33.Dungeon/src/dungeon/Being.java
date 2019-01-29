/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon;

/**
 *
 * @author sam
 */
public interface Being {
    Position getPosition();
    String getMark();
    void move(String command, int length, int height);
}
