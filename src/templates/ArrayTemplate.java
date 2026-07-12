package templates;

import java.util.Arrays;

// Array operations quick-reference template.
public class ArrayTemplate {
    public static void main(String[] args) {

        // --- Declare and initialize ---
        int[] arr = {5, 3, 1, 4, 2};
        int[][] matrix = {{1, 2}, {3, 4}};

        // --- Sort ---
        Arrays.sort(arr);                          // [1, 2, 3, 4, 5]

        // --- Print ---
        System.out.println(Arrays.toString(arr));  // [1, 2, 3, 4, 5]

        // --- Copy ---
        int[] copy = Arrays.copyOf(arr, 3);        // [1, 2, 3]

        // --- Fill ---
        Arrays.fill(arr, 0);                       // [0, 0, 0, 0, 0]

        // --- Compare ---
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};
        System.out.println(Arrays.equals(a, b));   // true

        // --- Find max (manual) ---
        int[] nums = {4, 2, 9, 1};
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;

        // --- Second largest ---
        int largest = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int n : nums) {
            if (n > largest) { second = largest; largest = n; }
            else if (n > second && n != largest) { second = n; }
        }

        // --- 2D matrix traversal ---
        int[][] m = {{1, 2, 3}, {4, 5, 6}};
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
}
