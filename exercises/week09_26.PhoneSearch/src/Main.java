import PhoneSearch.Person;
import PhoneSearch.PhoneBook;
public class Main {

    public static void main(String[] args) {
        // Start your program here
        // ATTENTION: In your program, you can create only one instance of class Scanner!
        String tester = "1\n" + "pekka\n" + "040-123456\n" +
                "2\n" + "jukka\n" + 
                "2\n" + "pekka\n" + 
                "1\n" + "pekka\n" + "09-222333\n" + 
                "2\n" + "pekka\n" +
                "x";
        PhoneBook book = new PhoneBook();
        book.start();
    }
}
