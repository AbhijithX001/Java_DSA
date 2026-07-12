# 05 — Java HashSet Revision Notes

> HashSet stores unique elements only. No duplicates. Order is NOT guaranteed.
> Use when you need fast lookup and uniqueness.

---

## Import & Declaration

```java
import java.util.HashSet;

HashSet<Integer> set = new HashSet<>();
HashSet<Character> vowelSet = new HashSet<>();
```

---

## Core Methods

### `add(element)` — O(1) avg
```java
set.add(5);     // adds 5
set.add(5);     // ignored — already present
set.add(10);    // adds 10
```
Returns `true` if added, `false` if already present.

### `contains(element)` — O(1) avg
```java
set.contains(5);   // true
set.contains(99);  // false
```
💡 This is much faster than `ArrayList.contains()` which is O(n).

### `remove(element)` — O(1) avg
```java
set.remove(5);  // removes 5
```

### `size()` / `isEmpty()`
```java
set.size();     // number of elements
set.isEmpty();  // true if no elements
```

### `clear()`
```java
set.clear();  // removes all elements
```

---

## Iteration

```java
for (int num : set) {
    System.out.println(num);
}
```
⚠️ Order is NOT guaranteed in HashSet.

---

## Common Use Cases

### Remove duplicate characters from a string (preserving order)
```java
HashSet<Character> seen = new HashSet<>();
StringBuilder result = new StringBuilder();
for (int i = 0; i < str.length(); i++) {
    char ch = str.charAt(i);
    if (seen.add(ch)) {   // add() returns false if already present
        result.append(ch);
    }
}
```

### Count distinct vowels
```java
HashSet<Character> vowels = new HashSet<>();
for (int i = 0; i < str.length(); i++) {
    char ch = Character.toLowerCase(str.charAt(i));
    if ("aeiou".indexOf(ch) != -1) {
        vowels.add(ch);
    }
}
System.out.println(vowels.size());
```

### Check if array has duplicates
```java
HashSet<Integer> seen = new HashSet<>();
for (int num : arr) {
    if (!seen.add(num)) {
        System.out.println("Duplicate found: " + num);
    }
}
```

---

## Complexity Table

| Operation | Average | Worst |
|---|---|---|
| `add()` | O(1) | O(n) |
| `contains()` | O(1) | O(n) |
| `remove()` | O(1) | O(n) |
| Iterate | O(n) | O(n) |

---

## HashSet vs ArrayList for Contains

| Check | ArrayList | HashSet |
|---|---|---|
| `contains()` | O(n) | O(1) |
| Insertion order | Preserved | NOT preserved |
| Duplicates | Allowed | NOT allowed |

---

## Common Mistakes

- Expecting order to be preserved (use `LinkedHashSet` if you need insertion order)
- Forgetting that `add()` returns `false` for duplicates (useful for detecting dups)
- Using `HashSet` when you need index-based access (use `ArrayList` instead)
