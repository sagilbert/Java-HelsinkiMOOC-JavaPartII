import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // write test code here
        System.out.println(clockTime("33:33:33"));
    }
    public static boolean isAWeekDay(String string) {
        if (string.matches("mon|tue|wed|thu|fri|sat|sun")) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean allVowels(String string) {
        if (string.matches(("([a|e|i|o|u|ä|ö])+"))) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean clockTime(String string) {
        if (string.matches("([0-1][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9]")) {
            return true;
        } else {
            return false;
    }
}
}
