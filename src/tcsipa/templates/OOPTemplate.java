package tcsipa.templates;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// ============================================================
// TCS IPA Question 2 — OOP Template
// Copy and modify the class names and fields for each problem.
// ============================================================
public class OOPTemplate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        ArrayList<Item> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int id = sc.nextInt();
            String name = sc.next();
            double value = sc.nextDouble();
            list.add(new Item(id, name, value));
        }

        // Sort by value descending
        Collections.sort(list, (a, b) -> Double.compare(b.getValue(), a.getValue()));

        for (Item item : list) {
            System.out.println(item);
        }

        sc.close();
    }
}

class Item {
    private int id;
    private String name;
    private double value;

    Item(int id, String name, double value) {
        this.id = id;
        this.name = name;
        this.value = value;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getValue() { return value; }

    @Override
    public String toString() {
        return id + " " + name + " " + value;
    }
}
