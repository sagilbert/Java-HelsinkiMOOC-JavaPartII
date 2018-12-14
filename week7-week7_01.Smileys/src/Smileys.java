
public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
         //printWithSmileys("Method");
         //printWithSmileys("Beerbottle");
         //printWithSmileys("Interface");
    }
    private static void printWithSmileys(String characterString) {
        int numChars;
        String middleString;
        if (characterString.length() % 2 == 0) {//if even
            numChars = characterString.length() + 6;
            middleString = characterString;
        } else {//if odd
            numChars = characterString.length() + 7;
            middleString = characterString + " ";
        }
        
        printEntireLine(numChars);
        
        printMiddleLine(middleString, numChars);
        
        printEntireLine(numChars);
        
    }
    private static void printEntireLine(int numChars) {
        for (int i = 0; i < numChars; i += 2) { //print topline
            System.out.print(":)");
        }
        System.out.println("");
    }
    private static void printMiddleLine(String middleString, int numChars) {
        int charsBefore = (numChars - middleString.length())/4;
        
        for (int i = 0; i < charsBefore; i += 2) { // first half of middle
            System.out.print(":)");
        }
        
        System.out.print(" " + middleString + " ");
        
        for (int i = 0; i < charsBefore; i += 2) { //second half of middle
            System.out.print(":)");
        }
        
        System.out.println("");
    }
}