package tcsipa.templates;

import java.util.Scanner;

// ============================================================
// TCS IPA Scanner Input Template
// Copy this structure for every Question 1 problem.
// ============================================================
public class ScannerTemplate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // --- Reading a single line string ---
        String str = sc.nextLine();

        // --- Reading an integer ---
        // int n = sc.nextInt();

        // --- IMPORTANT: reading int then string ---
        // int n = sc.nextInt();
        // sc.nextLine();          // flush leftover newline after nextInt()
        // String s = sc.nextLine();

        // --- Reading N integers into array ---
        // int n = sc.nextInt();
        // int[] arr = new int[n];
        // for (int i = 0; i < n; i++) {
        //     arr[i] = sc.nextInt();
        // }

        System.out.println(solve(str));

        sc.close();
    }

    // Replace this with the actual method specified in the TCS IPA question.
    // The method name, parameters, and return type must exactly match.
    public static String solve(String str) {
        if (str == null || str.isEmpty()) return "";
        return str;
    }
}
