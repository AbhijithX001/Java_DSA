# 07 — Java OOP Revision Notes

> TCS IPA Question 2 always involves OOP concepts: classes, objects, inheritance, sorting, filtering.

---

## Class & Object

```java
class Student {
    // fields (attributes)
    int id;
    String name;
}

// Create object
Student s = new Student();
s.id = 1;
s.name = "Abhijith";
```

---

## Constructor

```java
class Student {
    int id;
    String name;

    // Default constructor
    Student() {
        id = 0;
        name = "Unknown";
    }

    // Parameterized constructor
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

Student s = new Student(1, "Abhijith");
```

---

## `this` keyword

```java
class Student {
    int id;
    Student(int id) {
        this.id = id;  // 'this.id' = field, 'id' = parameter
    }
}
```

---

## Encapsulation (Getters & Setters)

```java
class Employee {
    private int salary;      // private — not directly accessible

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if (salary > 0) {    // validation in setter
            this.salary = salary;
        }
    }
}
```

---

## Inheritance

```java
class Animal {
    void eat() {
        System.out.println("eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("barking");
    }
}

Dog d = new Dog();
d.eat();   // inherited
d.bark();  // own method
```

### `super` keyword
```java
class Dog extends Animal {
    Dog() {
        super();       // calls parent constructor
    }
    void display() {
        super.eat();   // calls parent method
    }
}
```

---

## Method Overriding (Runtime Polymorphism)

```java
class Animal {
    void sound() {
        System.out.println("generic sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("woof");
    }
}
```

---

## Method Overloading (Compile-time Polymorphism)

```java
class Calculator {
    int add(int a, int b) { return a + b; }
    double add(double a, double b) { return a + b; }
    int add(int a, int b, int c) { return a + b + c; }
}
```

---

## Abstract Class

```java
abstract class Shape {
    abstract double area();    // must be implemented by subclass

    void display() {
        System.out.println("Area: " + area());
    }
}

class Circle extends Shape {
    double radius;
    Circle(double r) { this.radius = r; }

    @Override
    double area() { return Math.PI * radius * radius; }
}
```

---

## Interface

```java
interface Printable {
    void print();             // implicitly public abstract
}

interface Saveable {
    void save();
}

class Document implements Printable, Saveable {
    public void print() { System.out.println("printing"); }
    public void save() { System.out.println("saving"); }
}
```
💡 A class can implement **multiple** interfaces but extend only one class.

---

## `static` keyword

```java
class Counter {
    static int count = 0;     // shared across all objects

    Counter() {
        count++;
    }

    static void showCount() {
        System.out.println("Count: " + count);
    }
}
Counter.showCount();  // call without object
```

---

## `final` keyword

```java
final int MAX = 100;          // constant — cannot reassign
final class Lock {}           // cannot be extended
final void method() {}        // cannot be overridden
```

---

## Relationships

| Relationship | Meaning | Example |
|---|---|---|
| Inheritance (`extends`) | IS-A | Dog IS-A Animal |
| Composition | HAS-A (strong) | Car HAS-A Engine (Engine can't exist without Car) |
| Aggregation | HAS-A (weak) | Department HAS-A Teacher (Teacher can exist independently) |
| Association | USES-A | Student USES-A Library |

---

## TCS IPA Question 2 Template

```java
import java.util.*;

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

    @Override
    public String toString() {
        return id + " " + name + " " + salary;
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();
        list.add(new Employee(1, "Alice", 50000));
        list.add(new Employee(2, "Bob", 70000));

        // Sort by salary descending
        Collections.sort(list, (a, b) -> Double.compare(b.getSalary(), a.getSalary()));

        for (Employee e : list) {
            System.out.println(e);
        }
    }
}
```
