# 05 — Collections

**Level:** 🟡 Intermediate  
**Prerequisites:** 03_Arrays  
**Estimated Study Time:** 4–6 hours

## Overview
This folder contains problems solved using Java's collection classes.
Problems are organized by the collection used.

```
05_Collections/
├── HashMap/
├── HashSet/
├── ArrayList/
├── Queue/         ← Placeholder (add later)
├── Stack/         ← Placeholder (add later)
└── PriorityQueue/ ← Placeholder (add later)
```

---

## HashMap/
Use HashMap when you need **fast key-value lookup** or **frequency counting**.

| File | Problem |
|------|---------|
| `WordFrequency.java` | Count word occurrences in a sentence |
| `TwoSum.java` | Find two indices summing to target |
| `CharacterFrequency.java` | Print all character frequencies sorted |

> Also see: `02_Strings/FirstUniqueCharacter.java` and `MostFrequentCharacter.java` — these use HashMap but live in Strings since that's their primary domain.

---

## HashSet/
Use HashSet when you need **fast lookup + uniqueness**.

| File | Problem |
|------|---------|
| `UniqueIntegers.java` | Remove duplicates preserving order |
| `SetIntersection.java` | Find common elements between two arrays |

---

## ArrayList/
Use ArrayList for **dynamic arrays with index access**.

| File | Problem |
|------|---------|
| `ArrayListBasics.java` | add, remove, sort, reverse, max, min |
| `FilterAndSearch.java` | filter evens, positives; linear search |

---

## TCS IPA Relevance
⭐ **VERY HIGH** — HashMap is used in almost every Q1 with frequency-based logic.
ArrayList and Comparator are core to Q2 OOP problems.

## Reference Notes
- [04_HashMap.md](../../notes/04_HashMap.md)
- [05_HashSet.md](../../notes/05_HashSet.md)
- [03_ArrayList.md](../../notes/03_ArrayList.md)
- [08_Collections.md](../../notes/08_Collections.md)
