package tcsipa.question1;

import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class MostFrequentCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(mostFrequentChar(s));
        sc.close();
    }

    public static char mostFrequentChar(String str) {
        if (str == null || str.trim().isEmpty()) {
            return ' ';
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        int maxCount = Collections.max(map.values());
        for (int i = 0; i < str.length(); i++) {
            if (map.get(str.charAt(i)) == maxCount) {
                return str.charAt(i);
            }
        }
        return ' ';
    }
}
