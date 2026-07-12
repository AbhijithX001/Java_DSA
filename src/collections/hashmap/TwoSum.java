package collections.hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int[] result = twoSum(arr, target);
        if (result[0] == -1) {
            System.out.println("No pair found");
        } else {
            System.out.println(result[0] + " " + result[1]);
        }
        sc.close();
    }

    // Finds indices of two numbers that add up to the target.
    // HashMap approach: O(n) time, O(n) space.
    public static int[] twoSum(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(arr[i], i);
        }
        return new int[]{-1, -1};
    }
}
