package collections.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        wordFrequency(sentence);
        sc.close();
    }

    // Counts how often each word appears in a sentence and prints the result.
    public static void wordFrequency(String sentence) {
        if (sentence == null || sentence.trim().isEmpty()) {
            System.out.println("Empty input");
            return;
        }
        String[] words = sentence.trim().split("\\s+");
        HashMap<String, Integer> freq = new HashMap<>();
        for (String word : words) {
            freq.put(word.toLowerCase(), freq.getOrDefault(word.toLowerCase(), 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : freq.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
