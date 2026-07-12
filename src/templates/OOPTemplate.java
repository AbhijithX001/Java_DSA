package templates;

import java.util.ArrayList;
import java.util.Collections;

// OOP quick-reference template.
// Encapsulation + Inheritance + Comparator sorting — the TCS IPA Q2 pattern.
public class OOPTemplate {
    public static void main(String[] args) {

        ArrayList<Vehicle> list = new ArrayList<>();
        list.add(new Car(1, "Sedan", 500000));
        list.add(new Truck(2, "Heavy", 2000000));
        list.add(new Car(3, "Hatchback", 400000));

        // Polymorphic display
        for (Vehicle v : list) {
            v.display();
        }

        // Sort by price descending
        Collections.sort(list, (a, b) -> Double.compare(b.getPrice(), a.getPrice()));
        System.out.println("\nSorted by price:");
        for (Vehicle v : list) {
            System.out.println(v.getName() + " -> " + v.getPrice());
        }
    }
}

class Vehicle {
    private int id;
    private String name;
    private double price;

    Vehicle(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getPrice() { return price; }

    public void display() {
        System.out.println("Vehicle [" + id + "] " + name + " | Price: " + price);
    }
}

class Car extends Vehicle {
    Car(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public void display() {
        System.out.println("Car     [" + getId() + "] " + getName() + " | Price: " + getPrice());
    }
}

class Truck extends Vehicle {
    Truck(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public void display() {
        System.out.println("Truck   [" + getId() + "] " + getName() + " | Price: " + getPrice());
    }
}
