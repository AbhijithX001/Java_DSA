package collections.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        System.out.println("Original : " + list);
        System.out.println("Max      : " + Collections.max(list));
        System.out.println("Min      : " + Collections.min(list));

        Collections.sort(list);
        System.out.println("Sorted   : " + list);

        Collections.reverse(list);
        System.out.println("Reversed : " + list);

        // Remove value 0 if present
        list.remove(Integer.valueOf(0));

        System.out.println("Size     : " + list.size());
        sc.close();
    }
}
