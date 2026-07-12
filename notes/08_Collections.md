# 08 — Java Collections Revision Notes

> java.util.Collections is a utility class with static methods for List operations.

---

## Import

```java
import java.util.Collections;
import java.util.ArrayList;
```

---

## Sorting

```java
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3, 1, 4, 1, 5));

Collections.sort(list);                              // ascending:  [1, 1, 3, 4, 5]
Collections.sort(list, Collections.reverseOrder()); // descending: [5, 4, 3, 1, 1]
```

### Sort with custom Comparator (lambda)
```java
// Sort strings by length
Collections.sort(words, (a, b) -> a.length() - b.length());

// Sort by salary descending
Collections.sort(employees, (a, b) -> Double.compare(b.getSalary(), a.getSalary()));
```

---

## Reverse

```java
Collections.reverse(list);  // reverses in place
```

---

## Max / Min

```java
Collections.max(list);  // returns max value
Collections.min(list);  // returns min value
```

Works on any `List` of `Comparable` elements.

---

## Frequency

```java
Collections.frequency(list, 5);  // count occurrences of 5
```

---

## Shuffle

```java
Collections.shuffle(list);  // randomizes order
```

---

## Fill

```java
Collections.fill(list, 0);  // sets all elements to 0
```

---

## unmodifiableList

```java
List<Integer> immutable = Collections.unmodifiableList(list);
// immutable.add(1) will throw UnsupportedOperationException
```

---

## Quick Reference Table

| Method | What it does |
|---|---|
| `sort(list)` | Sort ascending |
| `sort(list, comparator)` | Sort with custom order |
| `reverse(list)` | Reverse the list |
| `max(collection)` | Find max |
| `min(collection)` | Find min |
| `frequency(list, obj)` | Count occurrences |
| `shuffle(list)` | Randomize |
| `fill(list, val)` | Fill all with value |

---

## Common Mistakes

- Calling `Collections.sort()` on an array (use `Arrays.sort()` for arrays)
- Calling `Collections.max()` on an empty collection → NoSuchElementException
- Forgetting that `reverse()` modifies the list in-place (does not return a new list)
