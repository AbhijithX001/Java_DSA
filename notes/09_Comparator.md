# 09 — Java Comparator Revision Notes

> Comparator is used to define custom sorting logic for objects.
> Essential for TCS IPA Question 2.

---

## Basics

```java
import java.util.Comparator;
import java.util.Collections;
```

A Comparator returns:
- **negative** if first argument should come **before** second
- **positive** if first argument should come **after** second
- **zero** if equal

---

## Lambda Comparator (Recommended Style)

### Sort integers ascending
```java
Collections.sort(list, (a, b) -> a - b);
```

### Sort integers descending
```java
Collections.sort(list, (a, b) -> b - a);
```

### Sort strings alphabetically
```java
Collections.sort(words, (a, b) -> a.compareTo(b));
```

### Sort strings by length (ascending)
```java
Collections.sort(words, (a, b) -> a.length() - b.length());
```

### Sort by salary descending
```java
Collections.sort(employees, (a, b) -> Double.compare(b.getSalary(), a.getSalary()));
```

---

## Multi-Level Sorting

```java
// Sort by salary descending, then by name ascending if salary is equal
Collections.sort(employees, (a, b) -> {
    if (b.getSalary() != a.getSalary()) {
        return Double.compare(b.getSalary(), a.getSalary());
    }
    return a.getName().compareTo(b.getName());
});
```

---

## Using `Comparator.comparing()` (cleaner syntax)

```java
// Sort by name
list.sort(Comparator.comparing(Employee::getName));

// Sort by salary descending
list.sort(Comparator.comparingDouble(Employee::getSalary).reversed());
```

---

## TCS IPA Common Comparator Patterns

### Sort employees: salary descending, name ascending on tie
```java
Collections.sort(list, (a, b) -> {
    int cmp = Double.compare(b.getSalary(), a.getSalary());
    if (cmp != 0) return cmp;
    return a.getName().compareTo(b.getName());
});
```

### Sort strings: by length, then alphabetically on tie
```java
Collections.sort(list, (a, b) -> {
    if (a.length() != b.length()) return a.length() - b.length();
    return a.compareTo(b);
});
```

---

## `Comparable` vs `Comparator`

| | `Comparable` | `Comparator` |
|---|---|---|
| Defined in | the class itself | separate class or lambda |
| Method | `compareTo(obj)` | `compare(a, b)` |
| Use when | single natural order | multiple / custom orders |
| Example | `String`, `Integer` | Custom sort of Employee |

### Implementing Comparable in a class
```java
class Student implements Comparable<Student> {
    int marks;

    @Override
    public int compareTo(Student other) {
        return this.marks - other.marks;  // ascending
    }
}
Collections.sort(students);  // uses compareTo
```

---

## Common Mistakes

- Using `<=` instead of `<` in tie-breaking (causes incorrect stable order)
- Using `a.getSalary() - b.getSalary()` for double comparison → precision loss
  - Always use `Double.compare(a, b)` for doubles
- Forgetting that `compareTo` is in the object, `compare` is in Comparator
