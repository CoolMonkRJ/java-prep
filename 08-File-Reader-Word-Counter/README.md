# Exercise 08 - File Reader & Word Counter

## Overview

This project is a File Reader and Word Counter application built using Core Java and Object-Oriented Programming principles.

The application reads a text file, processes its content, counts the frequency of each word, and identifies the most frequently occurring word.

This exercise simulates real-world backend tasks such as:

- Log Processing
- Text Analysis
- File Parsing
- Data Aggregation

---

## Concepts Covered

### Core Java

- Classes & Objects
- Methods
- Loops
- Arrays
- Strings

### File Handling

- FileReader
- BufferedReader
- Reading Text Files
- Resource Management

### Collections Framework

- HashMap
- Map.Entry

### Exception Handling

- try-catch
- IOException

### OOP Principles

- Encapsulation
- Separation of Concerns
- Single Responsibility Principle

---

## Project Structure

```text
08-File-Reader-Word-Counter
│
├── src
│   ├── FileProcessor.java
│   ├── WordCounterService.java
│   └── FRWC.java
│
├── sample.txt
├── README.md
└── Screenshot 2026-06-24 144550.png
```

---

## Class Design

### FileProcessor.java

Responsible for reading file content.

Main Responsibilities:

- Open file
- Read file line by line
- Return complete content as String
- Handle file reading exceptions

Example:

```java
String content =
        fileProcessor.readFile(
                "sample.txt");
```

---

### WordCounterService.java

Responsible for text processing.

Main Responsibilities:

- Split text into words
- Count word frequency
- Store frequency in HashMap
- Find most frequent word
- Print results

Example:

```java
HashMap<String, Integer>
```

Stores:

```text
apple  -> 4
banana -> 3
mango  -> 2
```

---

### FRWC.java

Application Entry Point.

Responsibilities:

- Read file
- Pass content to service
- Display results

---

## Sample Input File

```text
apple banana apple mango banana apple
orange mango apple banana
```

---

## Processing Flow

### Step 1

Read complete file.

```java
BufferedReader
```

---

### Step 2

Split text into words.

```java
split("\\s+")
```

Result:

```text
apple
banana
apple
mango
banana
apple
orange
mango
apple
banana
```

---

### Step 3

Store frequencies.

```java
HashMap<String, Integer>
```

Result:

```text
apple -> 4
banana -> 3
mango -> 2
orange -> 1
```

---

### Step 4

Find highest frequency.

Output:

```text
Most Frequent Word: apple
Frequency: 4
```

---

## Output Screenshot

![File Reader Word Counter Output](Screenshot%202026-06-24%20144550.png)

---

## Why BufferedReader?

Instead of:

```java
Scanner
```

we use:

```java
BufferedReader
```

because:

- Faster for large files
- Efficient memory usage
- Commonly used in backend systems

---

## Why StringBuilder?

Bad:

```java
content += line;
```

Creates a new String object every time.

Complexity:

```text
O(n²)
```

---

Good:

```java
StringBuilder
```

Complexity:

```text
O(n)
```

---

## Why HashMap?

Need:

```text
word -> frequency
```

mapping.

Example:

```text
apple -> 4
banana -> 3
```

HashMap provides:

```text
O(1)
```

average lookup time.

---

## Time Complexity Analysis

### Read File

```text
O(n)
```

where:

```text
n = file size
```

---

### Count Word Frequency

```text
O(n)
```

where:

```text
n = total words
```

---

### Find Most Frequent Word

```text
O(k)
```

where:

```text
k = unique words
```

---

### Overall Complexity

```text
O(n)
```

---

## Exception Handling

The application safely handles:

```java
IOException
```

Example:

```text
File Not Found
Permission Issues
Read Errors
```

Without crashing the application.

---

## Real-World Backend Mapping

Current Project:

```java
Read Text File
```

Real Systems:

```text
Application Logs
Server Logs
CSV Files
Configuration Files
Reports
```

---

Current:

```java
HashMap<String, Integer>
```

Real Systems:

```text
Analytics Engines
Search Engines
Monitoring Systems
```

---

## Learning Outcomes

After completing this exercise, I learned:

- File handling in Java
- BufferedReader usage
- Exception handling
- HashMap frequency counting pattern
- Finding most frequent elements
- Text processing techniques
- OOP-based project structure
- Backend-style data processing

---

## Future Improvements

Possible enhancements:

- Count Characters
- Count Lines
- Ignore Punctuation
- Ignore Stop Words
- Top 3 Most Frequent Words
- Export Results To File
- CSV File Support
- Spring Boot API Integration

---

## Author

Part of my Java SDE-1 Preparation Journey.

Exercise 08 focuses on File Handling, HashMap, Exception Handling, and Text Processing using Core Java.
