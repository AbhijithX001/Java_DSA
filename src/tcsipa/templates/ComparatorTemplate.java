package tcsipa.templates;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// ============================================================
// Comparator Patterns — TCS IPA Reference
// ============================================================
public class ComparatorTemplate {

    // ---- Single field sort ----

    // Sort by salary descending
    // Collections.sort(list, (a, b) -> Double.compare(b.getSalary(), a.getSalary()));

    // Sort by name ascending
    // Collections.sort(list, (a, b) -> a.getName().compareTo(b.getName()));

    // Sort by id ascending
    // Collections.sort(list, (a, b) -> a.getId() - b.getId());

    // ---- Multi-field sort ----
    // Sort by salary descending; if tie, by name ascending
    // Collections.sort(list, (a, b) -> {
    //     int cmp = Double.compare(b.getSalary(), a.getSalary());
    //     if (cmp != 0) return cmp;
    //     return a.getName().compareTo(b.getName());
    // });

    // ---- Key rule for tie-breaking ----
    // Use >  (not >=) to keep the FIRST occurrence when frequency is equal.

    // ---- Sorting primitives ----
    // Arrays.sort(arr);                          ascending
    // Arrays.sort(arr, Collections.reverseOrder()); -- does NOT work on int[]
    //   → use Integer[] instead of int[] for reverse sort

    public static void main(String[] args) {
        ArrayList<int[]> pairs = new ArrayList<>();
        pairs.add(new int[]{3, 10});
        pairs.add(new int[]{1, 20});
        pairs.add(new int[]{2, 10});

        // Sort by second element descending; ties broken by first element ascending
        Collections.sort(pairs, (a, b) -> {
            if (b[1] != a[1]) return b[1] - a[1];
            return a[0] - b[0];
        });

        for (int[] pair : pairs) {
            System.out.println(pair[0] + " " + pair[1]);
        }
    }
}
