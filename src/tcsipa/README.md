# 10 — TCS IPA Preparation

**This folder is self-contained. Everything you need for TCS IPA exam is here.**

```
10_TCS_IPA/
├── Question1/    ← 15-mark programming questions
├── Question2/    ← OOP questions
├── MockTests/    ← Full practice tests (add as you go)
└── Templates/    ← Exam-ready boilerplate code
```

---

## Question1/ — 15-mark Programming Questions

These are study copies finalized for exam revision. Do not edit them during revision.

| File | Problem | Key Concept |
|------|---------|-------------|
| `CountWords.java` | Count words in a string | split("\\s+"), trim() |
| `ReverseString.java` | Reverse a string | StringBuilder.reverse() |
| `IsPalindrome.java` | Check palindrome | Two-pointer, null safe |
| `CountVowels.java` | Count vowels | indexOf("aeiou") |
| `CountConsonants.java` | Count consonants | isLetter() + not vowel |
| `CountDigitsInString.java` | Count digits | Character.isDigit() |
| `ReverseEachWord.java` | Reverse each word | split + reverse |
| `MostFrequentCharacter.java` | Most frequent char | HashMap + first-occurrence |
| `FirstUniqueCharacter.java` | First unique char | HashMap two-pass |
| `LongestWord.java` | Longest word | split + length compare |
| `RemoveDuplicateCharacters.java` | Remove char duplicates | StringBuilder.indexOf |

---

## Question2/ — OOP Questions

| File | Problem |
|------|---------|
| `EmployeeManagement.java` | Employee list, sort by salary, Comparator |

---

## Templates/ — Use These During Exam

| File | When to Use |
|------|-------------|
| `ScannerTemplate.java` | Start of every Q1 — copy this first |
| `OOPTemplate.java` | Start of Q2 — rename class and fields |
| `ComparatorTemplate.java` | When sorting by multiple fields |

---

## 📋 Exam-Day Checklist

```
□ Read the method signature carefully — match it exactly
□ Check return type (String, int, char, boolean)
□ Add null/empty guard at the start
□ Use toLowerCase() if case-insensitive is needed
□ Use trim() before split()
□ Use > not >= for tie-breaking (first occurrence)
□ Use Character.isLetter() before counting consonants
□ Return StringBuilder.toString(), not StringBuilder
□ Close Scanner at the end
```
