package templates;

import java.util.Scanner;

// General-purpose Scanner input template.
// Copy this for any new Java problem.
public class ScannerTemplate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read a string (full line with spaces)
        String s = sc.nextLine();

        // Read an integer
        // int n = sc.nextInt();

        // Read a double
        // double d = sc.nextDouble();

        // IMPORTANT: After nextInt(), add sc.nextLine() before reading a string
        // int n = sc.nextInt();
        // sc.nextLine();           // consume leftover newline
        // String str = sc.nextLine();

        // Read N integers
        // int n = sc.nextInt();
        // int[] arr = new int[n];
        // for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        // Always close Scanner at the end
        sc.close();
    }
}
