# 03 — Arrays

**Level:** 🟡 Easy → Intermediate  
**Prerequisites:** 01_Basics, 02_Strings  
**Estimated Study Time:** 3–4 hours

## Learning Objectives
- Traverse and manipulate arrays
- Find min, max, second largest
- Classic array manipulation problems

## Files

| # | File | Key Concept |
|---|------|-------------|
| 1 | `SumOfEvenNumbers.java` | Loop + condition |
| 2 | `SecondLargestElement.java` | Single-pass, Integer.MIN_VALUE |
| 3 | `MissingNumber.java` | Sum formula trick |
| 4 | `MoveZeroes.java` | Two-pointer in-place |

## Key Algorithms
- **Second Largest:** single pass using `Integer.MIN_VALUE` as initial value
- **Missing Number:** `expectedSum - actualSum = missing`
- **Move Zeroes:** `insertPos` pointer + fill remaining with 0

## TCS IPA Relevance
🟡 Medium — Array problems appear in both Q1 (as part of logic) and Q2 (sorting via Comparator).

## Common Mistakes
- Initializing `max = 0` — breaks for all-negative arrays
- `arr.length()` — should be `arr.length` (no parentheses)
- `Arrays.equals()` vs `==` for comparing arrays
