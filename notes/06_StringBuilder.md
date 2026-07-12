# 06 — Java StringBuilder Revision Notes

> Use StringBuilder when building strings in loops. Much faster than `String +=`.

---

## Why StringBuilder?

```java
// BAD — creates a new String object on every iteration — O(n²)
String result = "";
for (int i = 0; i < 1000; i++) {
    result += "a";
}

// GOOD — O(n)
StringBuilder sb = new StringBuilder();
for (int i = 0; i < 1000; i++) {
    sb.append("a");
}
String result = sb.toString();
```

---

## Declaration

```java
StringBuilder sb = new StringBuilder();           // empty
StringBuilder sb = new StringBuilder("hello");    // with initial value
StringBuilder sb = new StringBuilder(100);        // with initial capacity
```

---

## Core Methods

### `append(value)` — adds to end
```java
sb.append("hello");
sb.append(' ');
sb.append(42);
sb.append(true);
```

### `insert(index, value)` — inserts at position
```java
sb.insert(0, "start: ");  // inserts at beginning
```

### `delete(start, end)` — removes characters (end exclusive)
```java
sb.delete(1, 3);  // removes characters at index 1 and 2
```

### `deleteCharAt(index)`
```java
sb.deleteCharAt(0);  // removes first character
```

### `setCharAt(index, char)`
```java
sb.setCharAt(0, 'H');  // change character at index 0
```

### `charAt(index)` / `length()`
```java
sb.charAt(0);   // get character
sb.length();    // current length
```

### `reverse()` — ⭐ Most used in TCS IPA
```java
sb.reverse();  // reverses in place, returns same StringBuilder
```

### `toString()` — convert to String
```java
String result = sb.toString();
```

### `indexOf(str)` / `lastIndexOf(str)`
```java
sb.indexOf("lo");      // first occurrence
sb.lastIndexOf("lo");  // last occurrence
```

---

## TCS IPA Patterns

### Fastest Reverse
```java
String reversed = new StringBuilder(str).reverse().toString();
```

### Reverse each word in sentence
```java
String[] words = str.split(" ");
StringBuilder result = new StringBuilder();
for (int i = 0; i < words.length; i++) {
    result.append(new StringBuilder(words[i]).reverse());
    if (i < words.length - 1) result.append(" ");
}
```

### Build result string in loop
```java
StringBuilder res = new StringBuilder();
for (int i = 0; i < str.length(); i++) {
    if (condition) {
        res.append(str.charAt(i));
    }
}
return res.toString();
```

---

## Common Mistakes

- Returning `StringBuilder` instead of calling `.toString()`
- Using `String result = ""` with `+=` inside a loop (very slow for large inputs)
- Forgetting that `delete(start, end)` end is exclusive
- Not calling `toString()` before printing or comparing
