# 12 — Mistakes To Avoid

> These are real mistakes commonly made in TCS IPA. Read this before every practice session.

---

## String Mistakes

### ❌ Using `==` to compare strings
```java
// WRONG
if (str == "") { }
if (str == "hello") { }

// CORRECT
if (str.isEmpty()) { }
if (str.equals("hello")) { }
```
`==` compares **reference**, not **content**. Always use `.equals()`.

---

### ❌ Not checking for null before calling methods
```java
// WRONG — throws NullPointerException if str is null
str.length()
str.charAt(0)
str.isEmpty()

// CORRECT
if (str == null || str.isEmpty()) return "";
```

---

### ❌ Returning StringBuilder instead of String
```java
// WRONG
public StringBuilder reverseString(String str) {
    return new StringBuilder(str).reverse();  // wrong return type
}

// CORRECT
public String reverseString(String str) {
    return new StringBuilder(str).reverse().toString();
}
```

---

### ❌ Using `str.equals("")` to check empty
```java
// Acceptable but verbose
if (str.equals("")) { }

// Better
if (str.isEmpty()) { }

// Best (also handles null)
if (str == null || str.isEmpty()) { }
```

---

### ❌ Forgetting `trim()` before `split()`
```java
// Input: "  hello world  "
str.split(" ")     // gives ["", "", "hello", "world", "", ""]  — wrong!
str.trim().split("\\s+")  // gives ["hello", "world"]  — correct!
```

---

### ❌ Using `substring(start, end)` thinking end is inclusive
```java
// "hello".substring(1, 4) → "ell"  (NOT "ello")
// end index is EXCLUSIVE
```

---

## Array Mistakes

### ❌ Initializing largest to 0 (breaks for all-negative arrays)
```java
// WRONG
int largest = 0;  // breaks if all elements are negative

// CORRECT
int largest = Integer.MIN_VALUE;
```

---

### ❌ Using `arr.length()` instead of `arr.length`
```java
// WRONG — arrays don't have parentheses
arr.length()

// CORRECT
arr.length
```
Strings → `str.length()` with parentheses  
Arrays → `arr.length` without parentheses

---

### ❌ Using `==` to compare arrays
```java
// WRONG
if (arr1 == arr2) { }

// CORRECT
if (Arrays.equals(arr1, arr2)) { }
```

---

## HashMap Mistakes

### ❌ Unboxing null from map.get()
```java
// WRONG — if key not found, map.get() returns null → NPE on int unboxing
int count = map.get(key);

// CORRECT
int count = map.getOrDefault(key, 0);
```

---

### ❌ Using `>=` in tie-breaking (keeps LAST max instead of FIRST)
```java
// WRONG — returns the last character with max count
if (count >= maxCount) {
    maxCount = count;
    result = ch;
}

// CORRECT — returns the FIRST character with max count
if (count > maxCount) {
    maxCount = count;
    result = ch;
}
```

---

### ❌ Comparing Integer objects with `==`
```java
// WRONG — may fail for values outside -128 to 127
if (map.get(ch) == 1) { }  // works for small values but unreliable

// SAFE — use .equals() for Integer comparison
if (map.get(ch).equals(1)) { }
```
In practice TCS IPA values are small, so `== 1` usually works, but `.equals(1)` is safer.

---

## OOP / TCS IPA Q2 Mistakes

### ❌ Forgetting required method signatures
TCS IPA Q1 specifies the exact method name, parameter type, and return type.  
If you rename or change the signature, your code won't score full marks.
```java
// Given: public static int countVowels(String str)
// Don't change to: public static int count(String s) — wrong name!
```

---

### ❌ Counting non-letter characters as consonants
```java
// WRONG — counts digits, spaces as consonants
if (vowels.indexOf(ch) == -1) count++;

// CORRECT — only count actual letters
if (Character.isLetter(ch) && vowels.indexOf(ch) == -1) count++;
```

---

### ❌ Forgetting edge cases for empty array
```java
// WRONG — crashes if arr.length == 0
int max = arr[0];

// CORRECT
if (arr == null || arr.length == 0) return -1;
int max = arr[0];
```

---

### ❌ Using `sc.nextInt()` then `sc.nextLine()` without consuming newline
```java
// WRONG — the nextLine() reads the leftover \n from nextInt()
int n = sc.nextInt();
String s = sc.nextLine();  // reads empty string!

// CORRECT
int n = sc.nextInt();
sc.nextLine();             // consume the leftover newline
String s = sc.nextLine();  // now reads actual next line
```

---

## General TCS IPA Reminders

| Mistake | Fix |
|---|---|
| `str == ""` | `str.isEmpty()` |
| `arr.length()` | `arr.length` |
| `a == b` for strings | `a.equals(b)` |
| `map.get(key)` unboxed directly | `map.getOrDefault(key, 0)` |
| `>=` for first max | `>` for first max |
| counting all chars as consonants | `Character.isLetter(ch)` check first |
| missing null check | `if (str == null \|\| str.isEmpty())` |
| `String +=` in loop | Use `StringBuilder.append()` |
| `largest = 0` init | `largest = Integer.MIN_VALUE` |
| Wrong method signature | Re-read the question carefully |
