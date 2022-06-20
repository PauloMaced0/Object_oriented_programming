package aula11;

import java.io.*;
import java.util.*;

public class Total_DifWords {
    public static int num_keys = 0;
    public static int total_words = 0;

    public static void main(String[] args) throws FileNotFoundException {
        HashMap<String, Integer> words = new HashMap<>();
        Scanner sc = new Scanner(new FileReader("words.txt"));
        while (sc.hasNext()) {
            String word = sc.next().toLowerCase().replaceAll("[^a-zA-Z]", "");
            if (!words.containsKey(word)) {
                words.put(word, 1);
            } else {
                words.put(word, words.get(word) + 1);
            }
        }

        words.forEach((key, values) -> {
            num_keys += 1;
            total_words += values;
        });
        System.out.println("Número Total de Palavras: " + total_words);
        System.out.println("Número de Palavras Diferentes: " + num_keys);
    }
}
