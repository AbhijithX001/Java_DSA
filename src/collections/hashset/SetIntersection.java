package collections.hashset;

import java.util.HashSet;
import java.util.Scanner;

public class SetIntersection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) arr1[i] = sc.nextInt();

        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) arr2[i] = sc.nextInt();

        printIntersection(arr1, arr2);
        sc.close();
    }

    // Print elements common to both arrays (intersection), without duplicates.
    // O(n + m) time using two HashSets.
    public static void printIntersection(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();

        for (int num : arr1) {
            set.add(num);
        }
        for (int num : arr2) {
            if (set.contains(num)) {
                result.add(num);
            }
        }
        if (result.isEmpty()) {
            System.out.println("No common elements");
        } else {
            for (int num : result) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
