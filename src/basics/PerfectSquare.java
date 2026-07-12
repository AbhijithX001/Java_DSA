package basics;

import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int root = (int) Math.sqrt(num);
        if (root * root == num) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        sc.close();
    }
}
