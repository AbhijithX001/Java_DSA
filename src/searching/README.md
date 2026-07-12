# 07 — Searching

**Level:** 🟡 Intermediate  
**Prerequisites:** 03_Arrays  
**Estimated Study Time:** 1–2 hours

## Learning Objectives
- Implement linear search (unsorted data)
- Implement binary search (sorted data)
- Know when to use each

## Files

| # | File | Time | Requires Sorting? |
|---|------|------|-------------------|
| 1 | `LinearSearch.java` | O(n) | No |
| 2 | `BinarySearch.java` | O(log n) | **Yes** |

## Key Rule
Binary search only works on **sorted arrays**.  
Always sort first: `Arrays.sort(arr);`

## Safe Mid Calculation
```java
int mid = left + (right - left) / 2;  // avoids integer overflow
// NOT: (left + right) / 2            // can overflow for large values
```
