package aula09;

import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Words {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list_words = new ArrayList<>();
        Scanner sc = new Scanner(new FileReader("words.txt"));
        String specialCharactersString = "!@#$%&*()'+,-./:;<=>?[]^_`{|}";
        while (sc.hasNext()) {
            String word = sc.next();
            if (word.length() > 2) {
                list_words.add(word);
            }
            if (word.substring(word.length()-1).equals("s")) {
                System.out.println(word);

            }
        }
        // remoover palavras com ch especias!
        // for (Iterator<String> i = list_words.iterator(); i.hasNext();) {

        // }

        // System.out.println(list_words);
    }
}
