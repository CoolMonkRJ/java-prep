# Exercise 05 - Sorting Algorithms

## Problem Statement

Implement sorting algorithms without using Java's built-in sorting methods.

Algorithms implemented:

* Bubble Sort
* Selection Sort

The goal of this exercise is to understand how sorting works internally before using production-ready sorting methods.

---

## Concepts Covered

* Arrays
* Nested Loops
* Swapping
* Algorithm Design
* Time Complexity Analysis
* Object-Oriented Programming (OOP)
* Single Responsibility Principle

---

## Project Structure

```text
Exercise05-SortingAlgorithms
│
├── BubbleSort.java
├── SelectionSort.java
└── Main.java
```

---

## Bubble Sort

### Idea

Compare adjacent elements.

If left element is greater than right element, swap them.

After every pass, the largest element moves to its correct position at the end of the array.

### Example

Input:

```text
64 34 25 12
```

Pass 1:

```text
34 25 12 64
```

Largest element (64) reaches its final position.

---

### Time Complexity

| Case    | Complexity |
| ------- | ---------- |
| Best    | O(n²)      |
| Average | O(n²)      |
| Worst   | O(n²)      |

### Space Complexity

```text
O(1)
```

---

## Selection Sort

### Idea

Find the smallest element from the unsorted portion.

Place it at the correct position.

Repeat for the remaining elements.

### Example

Input:

```text
64 34 25 12
```

Step 1:

Smallest = 12

Swap with first position.

```text
12 34 25 64
```

---

### Time Complexity

| Case    | Complexity |
| ------- | ---------- |
| Best    | O(n²)      |
| Average | O(n²)      |
| Worst   | O(n²)      |

### Space Complexity

```text
O(1)
```

---

## OOP Design

### BubbleSort Class

Responsible only for Bubble Sort logic.

```java
BubbleSort bubbleSort =
        new BubbleSort();
```

---

### SelectionSort Class

Responsible only for Selection Sort logic.

```java
SelectionSort selectionSort =
        new SelectionSort();
```

---

### Main Class

Responsible only for execution and testing.

This follows the Single Responsibility Principle.

---

## Sample Output

```text
Original Array : [64, 34, 25, 12, 22, 11, 90]

Bubble Sorted : [11, 12, 22, 25, 34, 64, 90]

Selection Sorted : [11, 12, 22, 25, 34, 64, 90]
```

---

## Interview Questions

### Why is Bubble Sort called Bubble Sort?

Because the largest element "bubbles up" to the end after each pass.

---

### Which performs fewer swaps?

Selection Sort.

---

### Is Bubble Sort stable?

Yes.

---

### Is Selection Sort stable?

No.

---

### Why learn these algorithms if Java already has Arrays.sort()?

To understand:

* Swapping
* Comparisons
* Time Complexity
* Fundamentals behind advanced sorting algorithms

---

## Learning Outcome

After completing this exercise, I learned:

* How sorting works internally
* How swapping changes array state
* Difference between Bubble Sort and Selection Sort
* Time and Space Complexity analysis
* Organizing code using OOP principles
