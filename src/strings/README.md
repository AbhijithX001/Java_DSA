# 02 — Strings

**Level:** 🟢 Beginner → 🟡 Intermediate  
**Prerequisites:** 01_Basics  
**Estimated Study Time:** 4–6 hours

## Learning Objectives
- Use String methods: charAt, length, indexOf, substring, split
- Use StringBuilder for efficient string building
- Solve frequency and uniqueness problems using loops and HashMap

## Files (study in this order — easiest to hardest)

| # | File | Key Concept |
|---|------|-------------|
| 1 | `LowerAndUpperCase.java` | toLowerCase(), toUpperCase() |
| 2 | `CountUppercaseLetters.java` | Character.isUpperCase() |
| 3 | `ReverseString.java` | StringBuilder.reverse() |
| 4 | `CountWords.java` | split("\\s+"), trim() |
| 5 | `PalindromeCheck.java` | Two-pointer technique |
| 6 | `CountVowelsConsonants.java` | Character classification |
| 7 | `CountDigitsInString.java` | Character.isDigit() |
| 8 | `SmallestVowel.java` | Character comparison |
| 9 | `ExtractOddPositionChars.java` | Index manipulation |
| 10 | `LastLetterOfEachWord.java` | Word traversal |
| 11 | `ReverseEachWord.java` | split + reverse |
| 12 | `LongestWord.java` | split + length comparison |
| 13 | `CheckAnagram.java` | Arrays.sort + equals |
| 14 | `MostFrequentCharacter.java` | HashMap frequency |
| 15 | `FirstUniqueCharacter.java` | HashMap + second pass |
| 16 | `RemoveDuplicateCharacters.java` | StringBuilder tracking |
| 17 | `RunLengthEncode.java` | Compression |
| 18 | `RunLengthDecode.java` | Decompression |

## TCS IPA Relevance
⭐ **HIGH** — This is the most tested area.  
Files 3–16 are all direct TCS IPA Question 1 candidates.  
See also: [10_TCS_IPA/Question1/](../10_TCS_IPA/Question1/)

## Common Mistakes
- Using `==` instead of `.equals()` for string comparison
- Using `String +=` in loops (use StringBuilder instead)
- Forgetting `.trim()` before `.split()`
- Missing null check before calling methods on a string
