package oop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EmployeeInheritance {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Manager(1, "Alice", 90000, "Engineering"));
        employees.add(new Developer(2, "Bob", 70000, "Java"));
        employees.add(new Manager(3, "Carol", 95000, "HR"));
        employees.add(new Developer(4, "Dave", 80000, "Python"));

        // Polymorphism: each object calls its own display()
        System.out.println("--- All Employees ---");
        for (Employee e : employees) {
            e.display();
        }

        // Sort by salary descending using Comparator
        Collections.sort(employees, (a, b) -> Double.compare(b.getSalary(), a.getSalary()));
        System.out.println("\n--- Sorted by Salary (High to Low) ---");
        for (Employee e : employees) {
            System.out.println(e.getName() + " -> " + e.getSalary());
        }
    }
}

// Base class — Encapsulation + shared behaviour
class Employee {
    private int id;
    private String name;
    private double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getSalary() { return salary; }

    // Overrideable display method
    public void display() {
        System.out.println("Employee [" + id + "] " + name + " | Salary: " + salary);
    }
}

// Inheritance + Method Overriding
class Manager extends Employee {
    private String department;

    Manager(int id, String name, double salary, String department) {
        super(id, name, salary);
        this.department = department;
    }

    @Override
    public void display() {
        System.out.println("Manager  [" + getId() + "] " + getName()
                + " | Dept: " + department + " | Salary: " + getSalary());
    }
}

class Developer extends Employee {
    private String language;

    Developer(int id, String name, double salary, String language) {
        super(id, name, salary);
        this.language = language;
    }

    @Override
    public void display() {
        System.out.println("Developer[" + getId() + "] " + getName()
                + " | Lang: " + language + " | Salary: " + getSalary());
    }
}
