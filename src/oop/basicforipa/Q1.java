package oop.basicforipa;

import java.util.*;

public class Q1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine(); // consume newline,

        Employee[] arr = new Employee[n];

        for (int i = 0; i < n; i++) {

            int id = sc.nextInt();
            sc.nextLine();

            String name = sc.nextLine();

            String department = sc.nextLine();

            double salary = sc.nextDouble();
            sc.nextLine();

            arr[i] = new Employee(id, name, department, salary);
        }

        double minSalary = sc.nextDouble();

        Employee[] result = findEmployees(arr, minSalary);

        if (result == null) {
            System.out.println("No Employee Found");
        } else {
            for (Employee e : result) {
                System.out.println(e.getId());
                System.out.println(e.getName());
                System.out.println(e.getDepartment());
                System.out.println(e.getSalary());
            }
        }

        sc.close();
    }

    public static Employee[] findEmployees(Employee[] employees, double minimumSalary) {

        if (employees == null || employees.length == 0) {
            return null;
        }

        Employee[] temp = new Employee[employees.length];
        int count = 0;

        for (Employee e : employees) {
            if (e.getSalary() >= minimumSalary) {
                temp[count] = e;
                count++;
            }
        }

        if (count == 0) {
            return null;
        }

        Employee[] result = new Employee[count];

        for (int i = 0; i < count; i++) {
            result[i] = temp[i];
        }

        return result;
    }
}

class Employee {

    private int id;
    private String name;
    private String department;
    private double salary;

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }
}