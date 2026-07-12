package templates;

import java.util.HashMap;
import java.util.Map;

// HashMap quick-reference template.
public class HashMapTemplate {
    public static void main(String[] args) {

        // --- Declare ---
        HashMap<String, Integer> map = new HashMap<>();

        // --- Put ---
        map.put("apple", 3);
        map.put("banana", 1);

        // --- Get (safe) ---
        int count = map.getOrDefault("apple", 0);

        // --- Check key ---
        if (map.containsKey("apple")) {
            System.out.println("Found apple: " + map.get("apple"));
        }

        // --- Frequency pattern ---
        String str = "hello world";
        HashMap<Character, Integer> freq = new HashMap<>();
        for (char ch : str.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

        // --- Iterate all entries ---
        for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // --- Iterate keys only ---
        for (String key : map.keySet()) {
            System.out.println(key);
        }

        // --- Size, remove, clear ---
        System.out.println(map.size());
        map.remove("banana");
        map.clear();
    }
}
