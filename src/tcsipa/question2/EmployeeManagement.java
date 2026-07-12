package tcsipa.question2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// TCS IPA Question 2 Style — OOP with sorting and filtering
// Problem: Manage a list of employees, sort by salary, filter by department.

public class EmployeeManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        ArrayList<Employee2> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int id = sc.nextInt();
            String name = sc.next();
            String dept = sc.next();
            double salary = sc.nextDouble();
            list.add(new Employee2(id, name, dept, salary));
        }

        // Sort by salary descending
        Collections.sort(list, (a, b) -> Double.compare(b.getSalary(), a.getSalary()));

        System.out.println("Sorted by salary:");
        for (Employee2 e : list) {
            System.out.println(e);
        }

        sc.close();
    }
}

class Employee2 {
    private int id;
    private String name;
    private String department;
    private double salary;

    Employee2(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getDepartment() { return department; }
    public double getSalary() { return salary; }

    @Override
    public String toString() {
        return id + " " + name + " " + department + " " + salary;
    }
}
