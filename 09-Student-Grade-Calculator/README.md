# Exercise 09 - Student Grade Calculator

## Overview

This project is a Student Grade Calculator built using Core Java and Object-Oriented Programming (OOP).

The application manages students, calculates grades based on marks, generates reports, calculates average marks, and identifies the topper.

This project helps strengthen OOP fundamentals and introduces business logic implementation similar to real-world backend applications.

---

## Features

✅ Add Student

✅ Calculate Grade

✅ Display Student Report

✅ Calculate Average Marks

✅ Find Topper

---

## Concepts Covered

### Core Java

- Classes & Objects
- Constructors
- Methods
- Loops
- Conditional Statements
- Return Values

### Collections Framework

- ArrayList

### OOP Concepts

- Encapsulation
- Aggregation
- Separation of Concerns
- Single Responsibility Principle

### Backend Development Concepts

- Business Logic Layer
- Report Generation
- Data Processing

---

## Project Structure

```text
09-Student-Grade-Calculator
│
├── src
│   ├── Students.java
│   ├── GradeService.java
│   └── GradeCalculator.java
│
├── README.md
└── Screenshot 2026-06-25 132125.png
```

---

## Class Responsibilities

### Students.java

Represents a student entity.

Stores:

```java
id
name
marks
```

Responsibilities:

- Store student information
- Provide getters
- Display student details

---

### GradeService.java

Contains all business logic.

Responsibilities:

- Add Students
- Calculate Grades
- Display Reports
- Calculate Average Marks
- Find Topper

Stores students using:

```java
ArrayList<Students>
```

---

### GradeCalculator.java

Application entry point.

Responsibilities:

- Create students
- Add students to service
- Generate reports
- Display average marks
- Display topper

---

## Grade Rules

| Marks Range | Grade |
|------------|--------|
| 90+ | A |
| 80-89 | B |
| 70-79 | C |
| 60-69 | D |
| Below 60 | F |

---

## Example Students

```java
new Students(101, "Rahul", 95);
new Students(102, "Priya", 88);
new Students(103, "Aman", 72);
new Students(104, "Neha", 61);
```

---

## Sample Output

```text
Rahul Added Successfully
Priya Added Successfully
Aman Added Successfully
Neha Added Successfully

---------STUDENT REPORT-------

ID :101 Name : Rahul Marks :95 Grade :A
ID :102 Name : Priya Marks :88 Grade :B
ID :103 Name : Aman Marks :72 Grade :C
ID :104 Name : Neha Marks :61 Grade :D

Average Marks : 79.0

----- TOPPER -----

ID :101
Name : Rahul
Marks :95
```

---

## Output Screenshot

![Student Grade Calculator Output](Screenshot%202026-06-25%20132125.png)

---

## OOP Concepts Used

### Encapsulation

Student data is hidden using private variables.

```java
private int id;
private String name;
private double marks;
```

Access is provided through getters.

---

### Aggregation

One GradeService contains multiple students.

```java
ArrayList<Students>
```

Relationship:

```text
GradeService
      has many
      Students
```

---

### Separation of Concerns

| Class | Responsibility |
|---------|--------------|
| Students | Store Student Data |
| GradeService | Business Logic |
| GradeCalculator | Start Application |

---

## Business Logic Flow

### Add Student

```java
students.add(student);
```

Stores student object inside ArrayList.

---

### Calculate Grade

```java
if(marks >= 90)
```

Returns:

```text
A
```

Based on grading rules.

---

### Calculate Average

Formula:

```text
Total Marks / Number Of Students
```

---

### Find Topper

Logic:

```java
if(student.getMarks() > topper.getMarks())
```

Keeps track of highest scoring student.

---

## Time Complexity Analysis

### Add Student

```text
O(1)
```

---

### Calculate Grade

```text
O(1)
```

---

### Display Report

```text
O(n)
```

---

### Calculate Average

```text
O(n)
```

---

### Find Topper

```text
O(n)
```

Where:

```text
n = total students
```

---

## Real World Mapping

Current Project:

```java
ArrayList<Students>
```

Real Backend:

```java
StudentRepository
```

connected to:

- MySQL
- PostgreSQL
- MongoDB

---

Current:

```java
calculateGrade()
```

Real Backend:

```java
StudentService
```

that applies grading policies.

---

## Learning Outcomes

After completing this exercise, I learned:

- OOP Design
- Encapsulation
- Aggregation
- ArrayList Operations
- Business Logic Separation
- Grade Calculation Systems
- Average Calculation
- Finding Maximum Elements
- Backend Style Coding Structure

---

## Future Improvements

Possible enhancements:

- Search Student By ID
- Update Marks
- Remove Student
- Grade Distribution
- Failed Students Count
- Subject Wise Marks
- GPA Calculator
- Database Integration
- Spring Boot REST APIs

---

## Author

Part of my Java SDE-1 Preparation Journey.

Exercise 09 focuses on OOP, Collections, Business Logic, and Report Generation using Core Java.
