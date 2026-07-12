package oop.basicforipa;

import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Product[] arr = new Product[n];
        for (int i = 0; i < arr.length; i++) {
            int id = sc.nextInt();
            sc.nextLine();

            String name = sc.nextLine();

            String category = sc.nextLine();

            double price = sc.nextDouble();
            sc.nextLine();
            arr[i] = new Product(id, name, category, price);
        }
        String searchCategory = sc.nextLine();
        Product result = findCostliestProduct(arr, searchCategory);
        if (result != null) {
            System.out.println(result.getId());
            System.out.println(result.getName());
            System.out.println(result.getCategory());
            System.out.println(result.getPrice());
        } else {
            System.out.println("No Product Found");
        }
        sc.close();
    }

    public static Product findCostliestProduct(Product[] products, String category) {
        if (products == null || products.length == 0) {
            return null;
        }
        Product ans = null;
        double max = 0;
        for (Product p : products) {

            if (p.getPrice() > max && p.getCategory().equalsIgnoreCase(category)) {
                max = p.getPrice();
                ans = p;
            }
        }
        if (ans != null) {
            return ans;
        } else {
            return null;
        }

    }
}

class Product {
    private int id;
    private String name;
    private String category;
    private double price;

    public Product(int id, String name, String category, double price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

}
