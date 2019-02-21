
public class Main {

    public static void main(String[] args) {
        int[] t = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(build(t));
    }

    public static String build(int[] t) {
        StringBuilder string = new StringBuilder();
        string.append("{\n ");
        for (int i = 0; i < t.length; i++) {
            string.append(t[i]);
            if (i != t.length - 1) {
                string.append(",");
                if ((i + 1) % 4 == 0) {
                    string.append("\n ");
                } else {
                    string.append(" ");
                }
            }
        }
        string.append("\n}");
        return string.toString();
    }
}
