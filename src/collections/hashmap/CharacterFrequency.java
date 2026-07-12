package collections.hashmap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        printFrequency(s);
        sc.close();
    }

    // Counts frequency of each character and prints in descending order of count.
    public static void printFrequency(String str) {
        if (str == null || str.isEmpty()) {
            System.out.println("Empty input");
            return;
        }
        HashMap<Character, Integer> freq = new HashMap<>();
        for (char ch : str.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }
        // Collect entries into a list and sort by frequency descending
        ArrayList<Map.Entry<Character, Integer>> entries = new ArrayList<>(freq.entrySet());
        Collections.sort(entries, (a, b) -> b.getValue() - a.getValue());
        for (Map.Entry<Character, Integer> entry : entries) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
