/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sam
 */
public class Change {
    private char fromCharacter;
    private char toCharacter;
    public Change(char fromCharacter, char toCharacter) {
        this.fromCharacter = fromCharacter;
        this.toCharacter = toCharacter;
    }
    public String change(String characterString) {
        String newString = "";
        for (int i = 0; i < characterString.length(); i++) {
            if (characterString.charAt(i) == this.fromCharacter) {
            newString += this.toCharacter;
            } else {
                    newString += characterString.charAt(i);
                    }
                
            }
        return newString;
        }
    public char getFromChar() {
        return this.fromCharacter;
    }
    public char getToChar() {
        return this.toCharacter;
    }

    
    
}
