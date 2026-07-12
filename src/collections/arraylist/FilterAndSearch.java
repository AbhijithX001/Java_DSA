package collections.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FilterAndSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        int target = sc.nextInt();

        System.out.println("Evens    : " + filterEvens(list));
        System.out.println("Positives: " + filterPositives(list));
        System.out.println("Found " + target + ": " + linearSearch(list, target));
        sc.close();
    }

    // Returns a new list containing only even numbers.
    public static ArrayList<Integer> filterEvens(ArrayList<Integer> list) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int num : list) {
            if (num % 2 == 0) result.add(num);
        }
        return result;
    }

    // Returns a new list containing only positive numbers.
    public static ArrayList<Integer> filterPositives(ArrayList<Integer> list) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int num : list) {
            if (num > 0) result.add(num);
        }
        return result;
    }

    // Returns true if target exists in list.
    public static boolean linearSearch(ArrayList<Integer> list, int target) {
        return list.contains(target);
    }
}
