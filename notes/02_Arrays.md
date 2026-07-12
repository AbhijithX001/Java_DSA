# 02 — Java Arrays Revision Notes

> TCS IPA commonly tests: second largest, sort, search, sum of evens, reverse array.

---

## Array Declaration & Initialization

```java
int[] arr = new int[5];              // default values: 0
int[] arr = {1, 2, 3, 4, 5};        // inline initialization
int[][] matrix = new int[3][3];      // 2D array
int[][] matrix = {{1,2},{3,4}};      // 2D inline
```

---

## Traversal Patterns

### Classic for loop
```java
for (int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);
}
```

### Enhanced for loop (read-only)
```java
for (int num : arr) {
    System.out.println(num);
}
```

### 2D array traversal
```java
for (int i = 0; i < matrix.length; i++) {
    for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " ");
    }
    System.out.println();
}
```

---

## Arrays Class (java.util.Arrays)

### `Arrays.sort(arr)` — O(n log n)
```java
int[] arr = {3, 1, 4, 1, 5};
Arrays.sort(arr);  // [1, 1, 3, 4, 5]
```

### `Arrays.sort` with range
```java
Arrays.sort(arr, 0, 3);  // sorts only indices 0..2
```

### `Arrays.equals(a, b)`
```java
int[] a = {1, 2, 3};
int[] b = {1, 2, 3};
Arrays.equals(a, b);  // true
```
⚠️ `a == b` compares references — always use `Arrays.equals()`.

### `Arrays.fill(arr, value)`
```java
int[] arr = new int[5];
Arrays.fill(arr, 7);  // [7, 7, 7, 7, 7]
```

### `Arrays.copyOf(arr, newLength)`
```java
int[] copy = Arrays.copyOf(arr, 3);  // first 3 elements
```

### `Arrays.binarySearch(arr, key)` — array MUST be sorted first
```java
int[] arr = {1, 3, 5, 7};
Arrays.binarySearch(arr, 5);  // returns index 2
```

### `Arrays.toString(arr)` — for printing
```java
System.out.println(Arrays.toString(arr));  // [1, 2, 3]
```

---

## Common Patterns

### Find maximum
```java
int max = arr[0];
for (int num : arr) {
    if (num > max) max = num;
}
```

### Find minimum
```java
int min = arr[0];
for (int num : arr) {
    if (num < min) min = num;
}
```

### Second largest (single-pass, TCS IPA style)
```java
int largest = Integer.MIN_VALUE;
int second = Integer.MIN_VALUE;
for (int num : arr) {
    if (num > largest) {
        second = largest;
        largest = num;
    } else if (num > second && num != largest) {
        second = num;
    }
}
```
⚠️ The `num != largest` check ensures distinct values.

### Remove duplicates using boolean array (for known range)
```java
boolean[] seen = new boolean[101];
for (int num : arr) {
    if (!seen[num]) {
        seen[num] = true;
        // process num
    }
}
```

### Frequency count
```java
HashMap<Integer, Integer> freq = new HashMap<>();
for (int num : arr) {
    freq.put(num, freq.getOrDefault(num, 0) + 1);
}
```

### Two-pointer technique
```java
int left = 0, right = arr.length - 1;
while (left < right) {
    // swap or check
    left++;
    right--;
}
```

---

## Complexity Reference

| Operation | Time |
|---|---|
| Access `arr[i]` | O(1) |
| Linear search | O(n) |
| Binary search (sorted) | O(log n) |
| `Arrays.sort()` | O(n log n) |
| Finding max/min | O(n) |
| Finding second largest | O(n) |

---

## Common Mistakes

- Using `arr.length()` instead of `arr.length` (no parentheses for arrays)
- Comparing arrays with `==` instead of `Arrays.equals()`
- Off-by-one errors in loop bounds
- Forgetting to sort before `Arrays.binarySearch()`
- Initializing `largest = 0` — breaks for all-negative arrays; use `Integer.MIN_VALUE`
- Assuming array is non-empty — always check `arr.length >= 2` before finding second largest
