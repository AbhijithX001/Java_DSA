package searching;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        int target = sc.nextInt();

        Arrays.sort(arr);   // array must be sorted first
        int index = binarySearch(arr, target);
        System.out.println(index == -1 ? "Not found" : "Found at index " + index);
        sc.close();
    }

    // Binary search — halves the search space each step. O(log n) time.
    // REQUIREMENT: array must be sorted before calling this method.
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;   // avoids overflow vs (left+right)/2
            if (arr[mid] == target) return mid;
            if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }
}
