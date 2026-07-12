# 08 — Sorting

**Level:** 🟠 Intermediate  
**Prerequisites:** 03_Arrays  
**Estimated Study Time:** 2–3 hours

## Learning Objectives
- Implement basic sorting algorithms
- Understand time and space complexity of each
- Know when `Arrays.sort()` is preferred

## Files

| # | File | Time (worst) | Space | Stable? |
|---|------|-------------|-------|---------|
| 1 | `BubbleSort.java` | O(n²) | O(1) | Yes |
| 2 | `SelectionSort.java` | O(n²) | O(1) | No |
| 3 | `InsertionSort.java` | O(n²) | O(1) | Yes |

## When to Use What
- `Arrays.sort()` → **always use in TCS IPA** (it's O(n log n) internally)
- Manual sorting algorithms → learn for understanding, not for exam code

## Bubble Sort Key Idea
Swap adjacent elements if out of order. Repeat n-1 times.  
**Optimization:** stop early if no swap happened in a pass.

## Insertion Sort Key Idea
Pick each element and insert it into its correct position in the already-sorted left portion.  
Best case O(n) — great for nearly-sorted arrays.
