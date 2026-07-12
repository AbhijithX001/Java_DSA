# 11 — TCS IPA Cheat Sheet

> Your single-page reference before the exam. Revise this on the day of the test.

---

## Scanner Template

```java
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        // process
        sc.close();
    }
}
```

⚠️ **Input Pitfalls:**
- After `nextInt()`, call `sc.nextLine()` to consume the leftover newline before reading a string
- Use `sc.nextLine()` for strings with spaces

---

## Most Common String Methods

```java
str.length()
str.charAt(i)
str.substring(i, j)        // j is exclusive
str.indexOf(ch)            // -1 if not found
str.toLowerCase()
str.toUpperCase()
str.trim()
str.replace(old, new)
str.split("\\s+")          // split on any whitespace
str.isEmpty()              // true if length == 0
str.equals(other)
str.equalsIgnoreCase(other)
str.toCharArray()
new StringBuilder(str).reverse().toString()  // fastest reverse
```

---

## Most Common Array Methods

```java
Arrays.sort(arr)
Arrays.equals(a, b)
Arrays.fill(arr, value)
Arrays.copyOf(arr, n)
Arrays.toString(arr)       // "[1, 2, 3]"
arr.length                 // no parentheses!
```

---

## HashMap Template

```java
HashMap<Character, Integer> map = new HashMap<>();
map.put(ch, map.getOrDefault(ch, 0) + 1);  // frequency count
map.get(key);
map.containsKey(key);
map.entrySet();            // iterate all pairs
```

---

## HashSet Template

```java
HashSet<Character> set = new HashSet<>();
set.add(ch);               // returns false if duplicate
set.contains(ch);
set.size();
```

---

## ArrayList Template

```java
ArrayList<String> list = new ArrayList<>();
list.add("item");
list.get(0);
list.size();
list.remove(Integer.valueOf(x));   // remove by value
list.remove(0);                    // remove by index
Collections.sort(list);
```

---

## Sorting Template

```java
// Ascending (integers)
Collections.sort(list);

// Descending
Collections.sort(list, Collections.reverseOrder());

// Custom (by object field)
Collections.sort(list, (a, b) -> Double.compare(b.getSalary(), a.getSalary()));
```

---

## Comparator Template (multi-field)

```java
Collections.sort(list, (a, b) -> {
    int cmp = Double.compare(b.getSalary(), a.getSalary());
    if (cmp != 0) return cmp;
    return a.getName().compareTo(b.getName());
});
```

---

## Common String Questions

| Problem | Key Approach |
|---|---|
| Reverse string | `new StringBuilder(s).reverse().toString()` |
| Palindrome | Two-pointer or StringBuilder reverse |
| Count vowels | `"aeiou".indexOf(ch) != -1` |
| Anagram | Sort both → `Arrays.equals()` |
| First unique char | HashMap frequency → traverse again |
| Longest word | `split("\\s+")` → compare lengths |
| Remove duplicates | `StringBuilder.indexOf()` check |
| Most frequent char | HashMap + `Collections.max(values)` |

---

## Common Array Questions

| Problem | Key Approach |
|---|---|
| Second largest | Single-pass with distinct check |
| Sort | `Arrays.sort()` or `Collections.sort()` |
| Sum of even | Loop with `num % 2 == 0` |
| Reverse number | `StringBuilder` + `append(num % 10)` |
| Prime check | Loop `i*i <= n`, return false if divisible |

---

## Common OOP Template (Q2 style)

```java
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
}
```

---

## Null Handling Checklist

```
□ Check: if (str == null || str.isEmpty()) before using str
□ Check: if (arr == null || arr.length == 0) before using arr
□ Check: if (list == null || list.isEmpty()) before using list
□ Never call .length() or .charAt() on a null string
□ Never call map.get(key) and unbox if key might be absent
```

---

## Edge Case Checklist

```
□ Empty string input
□ String with only spaces
□ Single character string
□ All elements identical in array
□ Array with one element (second largest = -1 or undefined)
□ Negative numbers in array
□ Case sensitivity — always toLowerCase() where needed
□ Leading/trailing spaces — always trim() where needed
```

---

## Complexity Cheatsheet

| Algorithm / Operation | Time |
|---|---|
| `String +=` in loop | O(n²) — avoid |
| `StringBuilder.append()` | O(1) amortized |
| HashMap `get/put/contains` | O(1) avg |
| HashSet `add/contains` | O(1) avg |
| `Arrays.sort()` | O(n log n) |
| `Collections.sort()` | O(n log n) |
| Linear search | O(n) |
| Binary search | O(log n) |
| Anagram check (sort) | O(n log n) |
| Frequency count (HashMap) | O(n) |
