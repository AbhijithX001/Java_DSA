# 01 — Java Strings Revision Notes

> TCS IPA commonly tests: reverse, palindrome, anagram, vowels, first unique, longest word, remove duplicates.

---

## String Basics

```java
String s = "Hello World";
s.length()           // 11
s.charAt(0)          // 'H'
s.charAt(s.length()-1) // 'd'
```

---

## Most Used Methods (with examples)

### `length()`
```java
"hello".length()  // 5
```
⚠️ Strings use `.length()`, arrays use `.length` (no parentheses)

---

### `charAt(int index)` — 0-indexed
```java
"hello".charAt(1)  // 'e'
```

---

### `substring(start)` and `substring(start, end)`
```java
"hello".substring(2)      // "llo"
"hello".substring(1, 4)   // "ell"  (end is exclusive)
```
⚠️ End index is **exclusive** — a common mistake.

---

### `indexOf(char)` / `lastIndexOf(char)`
```java
"hello".indexOf('l')      // 2 (first occurrence)
"hello".lastIndexOf('l')  // 3 (last occurrence)
"hello".indexOf('z')      // -1 (not found)
```
💡 Use `indexOf(ch) != -1` to check if a character exists.

---

### `contains(String)`
```java
"hello world".contains("world")  // true
```

---

### `startsWith(String)` / `endsWith(String)`
```java
"hello".startsWith("hel")  // true
"hello".endsWith("lo")     // true
```

---

### `equals(String)` / `equalsIgnoreCase(String)`
```java
"hello".equals("Hello")           // false
"hello".equalsIgnoreCase("Hello") // true
```
⚠️ Never use `==` to compare strings. Always use `.equals()`.

---

### `compareTo(String)` — lexicographic comparison
```java
"apple".compareTo("banana")  // negative (apple < banana)
"banana".compareTo("apple")  // positive
"apple".compareTo("apple")   // 0
```

---

### `replace(old, new)`
```java
"hello world".replace("world", "Java")  // "hello Java"
"aaa".replace('a', 'b')                 // "bbb"
```

### `replaceAll(regex, replacement)`
```java
"a1b2c3".replaceAll("[0-9]", "")  // "abc"
"  hi  ".replaceAll("\\s+", " ")  // " hi "
```

### `replaceFirst(regex, replacement)`
```java
"a1b2c3".replaceFirst("[0-9]", "X")  // "aXb2c3"
```

---

### `split(String regex)`
```java
"a b c".split(" ")     // ["a", "b", "c"]
"a  b".split("\\s+")  // ["a", "b"] — handles multiple spaces
```
💡 Use `split("\\s+")` for robust word splitting.

---

### `trim()` vs `strip()`
```java
"  hello  ".trim()   // "hello"  (removes ASCII whitespace)
"  hello  ".strip()  // "hello"  (handles Unicode whitespace too)
```

---

### `toLowerCase()` / `toUpperCase()`
```java
"Hello".toLowerCase()  // "hello"
"hello".toUpperCase()  // "HELLO"
```

---

### `isEmpty()` / `isBlank()`
```java
"".isEmpty()        // true
"  ".isEmpty()      // false
"  ".isBlank()      // true  (Java 11+)
```
⚠️ Don't use `str == ""` — use `str.isEmpty()`.

---

### `toCharArray()`
```java
char[] arr = "hello".toCharArray();  // ['h','e','l','l','o']
```

---

## StringBuilder (for building strings in loops)

Prefer `StringBuilder` over `String +=` in loops (avoids creating many objects).

```java
StringBuilder sb = new StringBuilder();
sb.append("hello");        // "hello"
sb.append(' ');            // "hello "
sb.insert(0, "say: ");    // "say: hello "
sb.delete(0, 5);          // "hello "
sb.deleteCharAt(5);       // "hello"
sb.setCharAt(0, 'H');     // "Hello"
sb.reverse();              // "olleH"
sb.toString();             // convert to String
sb.length();               // current length
sb.capacity();             // internal buffer size
```

💡 **Fastest reverse:** `new StringBuilder(str).reverse().toString()`

---

## Common TCS IPA Patterns

### Check if a character is a vowel
```java
"aeiou".indexOf(Character.toLowerCase(ch)) != -1
```

### Count frequency with HashMap
```java
HashMap<Character, Integer> map = new HashMap<>();
map.put(ch, map.getOrDefault(ch, 0) + 1);
```

### Two-pointer palindrome
```java
int i = 0, j = str.length() - 1;
while (i < j) {
    if (str.charAt(i) != str.charAt(j)) return false;
    i++; j--;
}
return true;
```

---

## Complexity Reference

| Operation | Time |
|---|---|
| `charAt(i)` | O(1) |
| `substring(i, j)` | O(n) |
| `indexOf(ch)` | O(n) |
| `split()` | O(n) |
| `+= string` in loop | O(n²) — avoid! |
| `StringBuilder.append()` | O(1) amortized |
| `StringBuilder.reverse()` | O(n) |
| Sort-based anagram check | O(n log n) |

---

## Common Mistakes

- Using `str == ""` instead of `str.isEmpty()`
- Forgetting `.trim()` before `.split(" ")`
- Using `str.length()` on a null string → NullPointerException
- Returning `StringBuilder` instead of calling `.toString()`
- Using `substring(start, end)` thinking end is inclusive (it is NOT)
- Using `==` to compare String values (compares reference, not content)
