package collections.hashset;

import java.util.HashSet;
import java.util.Scanner;

public class UniqueIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] result = removeDuplicates(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) System.out.print(" ");
        }
        System.out.println();
        sc.close();
    }

    // Remove duplicates from integer array while preserving insertion order.
    // Uses HashSet for O(1) lookup. Overall O(n) time.
    public static int[] removeDuplicates(int[] arr) {
        HashSet<Integer> seen = new HashSet<>();
        int[] temp = new int[arr.length];
        int count = 0;
        for (int num : arr) {
            if (seen.add(num)) {     // add() returns false if already present
                temp[count] = num;
                count++;
            }
        }
        int[] result = new int[count];
        for (int i = 0; i < count; i++) {
            result[i] = temp[i];
        }
        return result;
    }
}
