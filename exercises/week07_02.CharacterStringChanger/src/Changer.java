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
public class Changer {
    private ArrayList<Change> list;
     public Changer() {
         this.list= new ArrayList<Change>();
         
     }
     public void addChange(Change change) {
         this.list.add(change);
     }
     public String change(String characterString) {
         String newString = "";
         boolean flag;
         for (int i = 0; i < characterString.length(); i++) {
             flag = false;
             for (Change c : this.list) {
                 if (characterString.charAt(i) == c.getFromChar()) {
                     newString += c.getToChar();
                     flag = true;
                 }                                      
             }
             if (!flag) {
                 newString += characterString.charAt(i);
             }
             
         }
         return newString;
     }
}
