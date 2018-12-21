package wordinspection;

import java.io.File;

public class Main {

    public static void main(String[] args) throws Exception{
        // test your code here

        File file = new File("src/shortList.txt");
        WordInspection test = new WordInspection(file);
        System.out.println(test.wordsContainingZ());
        System.out.println(test.wordsEndingInL());
        System.out.println(test.palindromes());
        System.out.println(test.wordsWhichContainAllVowels());

    }
}
