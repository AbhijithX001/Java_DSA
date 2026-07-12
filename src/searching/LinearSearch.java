package searching;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        int target = sc.nextInt();
        int index = linearSearch(arr, target);
        System.out.println(index == -1 ? "Not found" : "Found at index " + index);
        sc.close();
    }

    // Search for target by checking every element. O(n) time, O(1) space.
    // Works on unsorted arrays.
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;
        }
        return -1;
    }
}
