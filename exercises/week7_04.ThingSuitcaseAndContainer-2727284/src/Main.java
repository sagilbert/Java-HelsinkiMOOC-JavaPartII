
public class Main {

    public static void main(String[] args) {
        // use this main class to test your program!
        Container container = new Container(1000);
        addSuitcasesFullOfBricks(container);
        System.out.println(container);
    }
    public static void addSuitcasesFullOfBricks(Container container) {
        for (int i = 0; i < 100; i++) {
            Suitcase toAdd = new Suitcase(1000);
            toAdd.addThing(new Thing("brick", i+1));
            container.addSuitcase(toAdd);
        }
    }

}
