# 06 — Recursion

**Level:** 🟡 Intermediate  
**Prerequisites:** 01_Basics  
**Estimated Study Time:** 2–3 hours

## Learning Objectives
- Understand base case and recursive case
- Trace through call stacks mentally
- Know when recursion is less efficient than iteration

## Files

| # | File | Base Case |
|---|------|-----------|
| 1 | `Factorial.java` | n == 0 or n == 1 → return 1 |
| 2 | `SumOfDigits.java` | n < 10 → return n |
| 3 | `Power.java` | exp == 0 → return 1 |
| 4 | `FibonacciRecursive.java` | n <= 1 → return n |

> ⚠️ `FibonacciRecursive.java` is O(2^n) — intentionally slow to demonstrate recursion.  
> See `01_Basics/FibonacciSeries.java` for the efficient O(n) iterative version.

## TCS IPA Relevance
🟡 Low-Medium — Recursion may appear in interview rounds but rarely in TCS IPA exam.
