# 10 — Common Patterns for TCS IPA

> Recurring code patterns you will use again and again.

---

## 1. Frequency Count (HashMap)

```java
HashMap<Character, Integer> freq = new HashMap<>();
for (char ch : str.toCharArray()) {
    freq.put(ch, freq.getOrDefault(ch, 0) + 1);
}
```

---

## 2. First Non-Repeating Character

```java
HashMap<Character, Integer> freq = new HashMap<>();
for (char ch : str.toCharArray()) {
    freq.put(ch, freq.getOrDefault(ch, 0) + 1);
}
for (char ch : str.toCharArray()) {
    if (freq.get(ch) == 1) return ch;
}
return ' ';
```

---

## 3. Two-Pointer Palindrome

```java
int i = 0, j = str.length() - 1;
while (i < j) {
    if (str.charAt(i) != str.charAt(j)) return false;
    i++; j--;
}
return true;
```

---

## 4. Word Count (handles multiple spaces)

```java
if (str == null || str.trim().isEmpty()) return 0;
return str.trim().split("\\s+").length;
```

---

## 5. Anagram Check

```java
char[] a = s1.toLowerCase().toCharArray();
char[] b = s2.toLowerCase().toCharArray();
Arrays.sort(a);
Arrays.sort(b);
return Arrays.equals(a, b);
```

---

## 6. Second Largest (single-pass)

```java
int largest = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
for (int num : arr) {
    if (num > largest) { second = largest; largest = num; }
    else if (num > second && num != largest) { second = num; }
}
```

---

## 7. Remove Duplicates (preserve order)

```java
StringBuilder result = new StringBuilder();
for (char ch : str.toCharArray()) {
    if (result.indexOf(String.valueOf(ch)) == -1) {
        result.append(ch);
    }
}
return result.toString();
```

---

## 8. Reverse Each Word

```java
String[] words = str.trim().split(" ");
StringBuilder res = new StringBuilder();
for (int i = 0; i < words.length; i++) {
    res.append(new StringBuilder(words[i]).reverse());
    if (i < words.length - 1) res.append(" ");
}
```

---

## 9. Run-Length Encoding

```java
StringBuilder res = new StringBuilder();
int count = 1;
for (int i = 1; i < str.length(); i++) {
    if (str.charAt(i) == str.charAt(i - 1)) count++;
    else { res.append(str.charAt(i-1)).append(count); count = 1; }
}
res.append(str.charAt(str.length()-1)).append(count);
```

---

## 10. Sort ArrayList of Objects by Field

```java
// Sort by salary descending
Collections.sort(list, (a, b) -> Double.compare(b.getSalary(), a.getSalary()));
```

---

## 11. Print without space after last element

```java
for (int i = 0; i < arr.length; i++) {
    System.out.print(arr[i]);
    if (i < arr.length - 1) System.out.print(" ");
}
System.out.println();
```

---

## 12. Reading N integers from Scanner

```java
int n = sc.nextInt();
int[] arr = new int[n];
for (int i = 0; i < n; i++) {
    arr[i] = sc.nextInt();
}
```

---

## 13. isPrime

```java
boolean isPrime(int n) {
    if (n < 2) return false;
    for (int i = 2; i * i <= n; i++) {
        if (n % i == 0) return false;
    }
    return true;
}
```

---

## 14. Null + Empty Guard Pattern

```java
if (str == null || str.isEmpty()) return "";
// or for methods returning int:
if (str == null || str.isEmpty()) return 0;
```
