# 03 — Java ArrayList Revision Notes

> ArrayList is a dynamic array. Size can grow/shrink automatically.

---

## Import & Declaration

```java
import java.util.ArrayList;
import java.util.Collections;

ArrayList<Integer> list = new ArrayList<>();
ArrayList<String> names = new ArrayList<>();
```

---

## Core Methods

### `add(element)` / `add(index, element)`
```java
list.add(10);           // adds at end
list.add(1, 99);        // inserts 99 at index 1
```

### `get(index)` — O(1)
```java
int val = list.get(0);
```

### `set(index, value)` — O(1)
```java
list.set(0, 100);  // replace element at index 0
```

### `remove(int index)` vs `remove(Object obj)`
```java
list.remove(0);                  // removes by INDEX
list.remove(Integer.valueOf(5)); // removes by VALUE (first occurrence)
```
⚠️ For `ArrayList<Integer>`, always use `Integer.valueOf(x)` when removing by value.

### `size()` — O(1)
```java
int n = list.size();
```

### `contains(element)` — O(n)
```java
list.contains(10);  // true or false
```

### `indexOf(element)` / `lastIndexOf(element)` — O(n)
```java
list.indexOf(10);      // first occurrence index, or -1
list.lastIndexOf(10);  // last occurrence index, or -1
```

### `clear()`
```java
list.clear();  // removes all elements
```

### `isEmpty()`
```java
list.isEmpty();  // true if size == 0
```

---

## Sorting

```java
Collections.sort(list);                      // ascending
Collections.sort(list, Collections.reverseOrder()); // descending
```

Custom sort (Comparator):
```java
Collections.sort(list, (a, b) -> b - a);  // descending
```

---

## Other Collections Methods

```java
Collections.reverse(list);       // reverses in place
Collections.max(list);           // returns max element
Collections.min(list);           // returns min element
Collections.frequency(list, 3); // count of element 3
Collections.shuffle(list);       // randomize
```

---

## Iteration

### for loop
```java
for (int i = 0; i < list.size(); i++) {
    System.out.println(list.get(i));
}
```

### enhanced for
```java
for (int num : list) {
    System.out.println(num);
}
```

---

## Convert Between Array and ArrayList

```java
// Array → ArrayList
Integer[] arr = {1, 2, 3};
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));

// ArrayList → Array
Integer[] result = list.toArray(new Integer[0]);
```

---

## Common Mistakes

- Using `list.remove(5)` when you want to remove by value (removes index 5 instead)
- Using `list.length` instead of `list.size()`
- Forgetting to import `java.util.Collections` for sort/reverse/max/min
- Modifying a list while iterating over it (ConcurrentModificationException)
