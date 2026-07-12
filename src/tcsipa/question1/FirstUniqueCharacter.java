package tcsipa.question1;

import java.util.HashMap;
import java.util.Scanner;

public class FirstUniqueCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char result = firstUniqueCharacter(s);
        System.out.println(result == ' ' ? "No unique character" : result);
        sc.close();
    }

    public static char firstUniqueCharacter(String str) {
        if (str == null || str.isEmpty()) {
            return ' ';
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < str.length(); i++) {
            if (map.get(str.charAt(i)) == 1) {
                return str.charAt(i);
            }
        }
        return ' ';
    }
}
