package strings;

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(isPalindrome(s));
        sc.close();
    }

    public static boolean isPalindrome(String str) {
        if (str == null) {
            return false;
        }
        str = str.trim().toLowerCase().replace(" ", "");
        if (str.isEmpty()) {
            return false;
        }
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
