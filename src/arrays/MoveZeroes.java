package arrays;

import java.util.Scanner;

public class MoveZeroes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        moveZeroes(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(" ");
        }
        System.out.println();
        sc.close();
    }

    // Move all zeroes to the end while preserving order of non-zero elements.
    // Uses two-pointer technique — O(n) time, O(1) space.
    public static void moveZeroes(int[] arr) {
        int insertPos = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[insertPos] = arr[i];
                insertPos++;
            }
        }
        while (insertPos < arr.length) {
            arr[insertPos] = 0;
            insertPos++;
        }
    }
}
