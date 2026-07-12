# 04 — Java HashMap Revision Notes

> HashMap stores key-value pairs. Keys are unique. Order is NOT guaranteed.
> Most common in TCS IPA for frequency counting and lookup.

---

## Import & Declaration

```java
import java.util.HashMap;
import java.util.Map;

HashMap<String, Integer> map = new HashMap<>();
HashMap<Character, Integer> freq = new HashMap<>();
```

---

## Core Methods

### `put(key, value)` — O(1) avg
```java
map.put("apple", 3);
map.put("apple", 5);  // overwrites previous value
```

### `get(key)` — O(1) avg
```java
map.get("apple");  // returns 5, or null if key absent
```

### `getOrDefault(key, defaultValue)` ✅ Preferred
```java
map.getOrDefault("apple", 0);  // returns value or 0 if not found
```
💡 Use this for frequency counting to avoid null checks.

### `containsKey(key)` / `containsValue(value)` — O(1) / O(n)
```java
map.containsKey("apple");   // true
map.containsValue(5);       // true
```

### `remove(key)` — O(1) avg
```java
map.remove("apple");  // removes the entry
```

### `replace(key, newValue)`
```java
map.replace("apple", 10);
```

### `size()` / `isEmpty()`
```java
map.size();     // number of entries
map.isEmpty();  // true if empty
```

### `clear()`
```java
map.clear();
```

---

## Iteration

### Iterate keys
```java
for (String key : map.keySet()) {
    System.out.println(key + " -> " + map.get(key));
}
```

### Iterate values
```java
for (int val : map.values()) {
    System.out.println(val);
}
```

### Iterate entries (most complete)
```java
for (Map.Entry<String, Integer> entry : map.entrySet()) {
    System.out.println(entry.getKey() + " = " + entry.getValue());
}
```

---

## Frequency Counting (TCS IPA Pattern)

```java
HashMap<Character, Integer> freq = new HashMap<>();
for (int i = 0; i < str.length(); i++) {
    char ch = str.charAt(i);
    freq.put(ch, freq.getOrDefault(ch, 0) + 1);
}
```

---

## Find Max Frequency Character

```java
int maxCount = Collections.max(map.values());
for (int i = 0; i < str.length(); i++) {
    if (map.get(str.charAt(i)) == maxCount) {
        return str.charAt(i);  // returns FIRST character with max count
    }
}
```
⚠️ Traverse the **original string**, not the map — to preserve insertion order.

---

## Tie-Breaking Pattern (by frequency, then by first occurrence)

```java
char result = ' ';
int maxCount = 0;
for (int i = 0; i < str.length(); i++) {
    int count = freq.get(str.charAt(i));
    if (count > maxCount) {   // use > not >= to keep FIRST occurrence
        maxCount = count;
        result = str.charAt(i);
    }
}
```
⚠️ Use `>` not `>=` when you want the **first** occurrence among ties.

---

## Complexity Table

| Operation | Average | Worst |
|---|---|---|
| `put()` | O(1) | O(n) |
| `get()` | O(1) | O(n) |
| `containsKey()` | O(1) | O(n) |
| `remove()` | O(1) | O(n) |
| Iterate all entries | O(n) | O(n) |

---

## Common Mistakes

- Using `map.get(key)` without null check (returns null if key absent → NPE on unboxing)
- Using `>=` in tie-breaking when you want the first max character
- Forgetting `import java.util.Collections` when using `Collections.max(map.values())`
- Confusing `keySet()`, `values()`, and `entrySet()`
- Not using `getOrDefault()` — leads to verbose null-check patterns
