package aula09;

import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Words {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list_words = new ArrayList<>();
        Scanner sc = new Scanner(new FileReader("words.txt"));

        while (sc.hasNext()) {
            String word = sc.next();
            if (word.length() > 2) {
                list_words.add(word);
            }
        }
        System.out.println("Palavras que terminam em S\n");
        for (String word : list_words) {
            if (word.substring(word.length() - 1).equals("s")) {
                System.out.println(word);

            }
        }
        for (int i = 0; i < list_words.size(); i++) {
            if (!list_words.get(i).matches("[a-zA-Z]+")) {
                list_words.remove(i);
            }
        }

        System.out.println("\nLista Final\n");
        System.out.println(list_words);
    }

}
