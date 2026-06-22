# Exercise 03 - Frequency Counter

## Problem Statement

Given a string, count the frequency of each character and display the result.

### Example

Input:

```text
apple
```

Output:

```text
a -> 1
p -> 2
l -> 1
e -> 1
```

---

## Concepts Covered

- HashMap
- Key-Value Pairs
- String Traversal
- Character Processing
- Frequency Counting Pattern
- Loops
- getOrDefault()
- Time Complexity Analysis

---

## Approach

1. Create a HashMap where:
   - Key = Character
   - Value = Frequency

2. Traverse the string character by character.

3. For each character:
   - Check current frequency using `getOrDefault()`
   - Increase frequency by 1
   - Store updated value back in HashMap

4. Print all entries from the HashMap.

---

## Code Pattern Used

```java
map.put(
    ch,
    map.getOrDefault(ch, 0) + 1
);
```

This is a common frequency counting pattern used in many coding interview problems.

---

## Sample Execution

Input:

```text
apple
```

Output:

```text
a -> 1
p -> 2
l -> 1
e -> 1
```

---

## Time Complexity

### Building Frequency Map

```text
O(n)
```

where `n` is the length of the string.

### Printing Frequencies

```text
O(k)
```

where `k` is the number of unique characters.

### Overall

```text
O(n)
```

---

## Space Complexity

```text
O(k)
```

where `k` is the number of unique characters.

---

## Interview Questions

### Why use HashMap?

HashMap provides average O(1) insertion and lookup, making frequency counting efficient.

### Why not ArrayList?

ArrayList stores values using indexes, while frequency counting requires key-value mapping.

### What does getOrDefault() do?

Returns:
- Existing value if key is present
- Default value if key is absent

Example:

```java
map.getOrDefault('a', 0);
```

### What is the frequency counting pattern?

```java
map.put(ch, map.getOrDefault(ch, 0) + 1);
```

This pattern is commonly used in:

- Character Frequency
- Word Frequency
- Majority Element
- Top K Frequent Elements
- Anagram Problems
- Group Anagrams

---

## Learning Outcome

After completing this exercise, I learned:

- How HashMap works
- How to count occurrences efficiently
- How key-value storage differs from arrays/lists
- A common interview pattern used in many coding problems
