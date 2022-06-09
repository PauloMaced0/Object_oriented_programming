package aula10;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class Wordpair {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> wordslist = new ArrayList<>();
        TreeMap<String, TreeMap<String, Integer>> wordspair = new TreeMap<String, TreeMap<String, Integer>>();
        Scanner sc = new Scanner(new FileReader("major.txt"));
        while (sc.hasNext()) {
            String word = sc.next();
            if (word.length() > 2) {
                String w = word.toLowerCase()
                        .replaceAll("[\\t\\n\\.\\,\\:\\'\\‘\\’\\;\\?\\!\\*\\{\\}\\=\\+\\&\\/\\(\\)\\[\\]\\”\\“\\\"\\']","");
                wordslist.add(w);
            }
        }
        int n = 1;
        for (int i = 0; i < wordslist.size() - 1; i++) {
            if (!wordspair.containsKey(wordslist.get(i))) {
                wordspair.put(wordslist.get(i), new TreeMap<>());
            }

            if (!wordspair.get(wordslist.get(i)).containsKey(wordslist.get(i + 1))) {
                wordspair.get(wordslist.get(i)).put(wordslist.get(i + 1), n);
            } else {
                wordspair.get(wordslist.get(i)).put(wordslist.get(i + 1), n + 1);
            }

        }
        Set<Map.Entry<String, TreeMap<String, Integer>>> x = wordspair.entrySet();
        x.forEach(elements -> {
            System.out.println(elements);
        });

    }

}