package templates;

import java.util.ArrayList;
import java.util.Collections;

// Comparator and sorting quick-reference template.
public class ComparatorTemplate {
    public static void main(String[] args) {

        ArrayList<int[]> list = new ArrayList<>();
        list.add(new int[]{1, 50});
        list.add(new int[]{2, 30});
        list.add(new int[]{3, 50});

        // --- Sort by second element descending ---
        Collections.sort(list, (a, b) -> b[1] - a[1]);

        // --- Sort by second element descending, first ascending on tie ---
        Collections.sort(list, (a, b) -> {
            if (b[1] != a[1]) return b[1] - a[1];
            return a[0] - b[0];
        });

        // --- For double fields: always use Double.compare() ---
        // Collections.sort(employees, (a, b) -> Double.compare(b.getSalary(), a.getSalary()));

        // --- For String fields ---
        // Collections.sort(list, (a, b) -> a.getName().compareTo(b.getName()));

        // --- Sort strings by length, then alphabetically ---
        ArrayList<String> words = new ArrayList<>();
        Collections.sort(words, (a, b) -> {
            if (a.length() != b.length()) return a.length() - b.length();
            return a.compareTo(b);
        });
    }
}
