# Exercise 07 - ATM Simulation System

## Overview

This project is a console-based ATM Simulation System built using Core Java and Object-Oriented Programming principles.

The application simulates basic ATM functionalities such as:

- PIN Authentication
- Balance Inquiry
- Deposit Money
- Withdraw Money
- Transaction History
- Exit System

The goal of this exercise is to understand how real-world systems manage user authentication, account operations, and transaction tracking.

---

## Concepts Covered

### Core Java

- Classes & Objects
- Constructors
- Methods
- Loops
- Switch Case
- User Input using Scanner

### OOP Principles

- Encapsulation
- Aggregation
- Single Responsibility Principle
- Separation of Concerns

### Collections Framework

- ArrayList
- Dynamic Data Storage

### Backend Concepts

- Authentication
- State Management
- Transaction Logging
- Service Layer Design

---

## Project Structure

```text
07-ATM-Simulation
│
├── BankAccount.java
├── ATMService.java
├── ATMApplication.java
└── README.md
```

---

## Class Design

### BankAccount.java

Represents a user's bank account.

Stores:

```java
accountNumber
accountHolder
pin
balance
transactionHistory
```

Responsibilities:

- Maintain account details
- Deposit money
- Withdraw money
- Track transactions
- Display transaction history

---

### ATMService.java

Acts as the service layer.

Responsibilities:

- Authenticate user
- Display ATM menu
- Handle user operations
- Coordinate account activities

---

### ATMApplication.java

Application entry point.

Responsibilities:

- Create account object
- Initialize ATM service
- Handle login flow
- Start ATM system

---

## Features Implemented

### PIN Authentication

User must enter the correct PIN before accessing the ATM.

Example:

```text
Enter PIN: 1234

Login Successful
```

---

### Check Balance

Displays current account balance.

Example:

```text
Balance: ₹12000
```

---

### Deposit Money

Adds money to account balance.

Example:

```text
Amount: 5000

Deposit Successful
```

---

### Withdraw Money

Withdraws money if sufficient balance is available.

Example:

```text
Amount: 3000

Withdrawal Successful
```

Insufficient balance:

```text
Insufficient Balance
```

---

### Transaction History

Stores all transactions using:

```java
ArrayList<String>
```

Example:

```text
Account Created with ₹10000
Deposited ₹5000
Withdrawn ₹3000
Failed Withdrawal ₹50000
```

---

## Sample Flow

```text
Enter PIN: 1234

Login Successful

===== ATM MENU =====

1. Check Balance
2. Deposit
3. Withdraw
4. Transaction History
5. Exit
```

---

## OOP Concepts Used

### Encapsulation

Sensitive data is protected using private fields.

Example:

```java
private double balance;
private int pin;
```

Users cannot directly modify account data.

---

### Aggregation

ATMService uses a BankAccount object.

```java
private BankAccount account;
```

Relationship:

```text
ATMService
    has-a
BankAccount
```

---

### Single Responsibility Principle

Each class has only one responsibility.

| Class | Responsibility |
|---------|--------------|
| BankAccount | Account Management |
| ATMService | ATM Operations |
| ATMApplication | Application Startup |

---

## Time Complexity Analysis

### Deposit

```text
O(1)
```

---

### Withdraw

```text
O(1)
```

---

### Check Balance

```text
O(1)
```

---

### Authentication

```text
O(1)
```

---

### Transaction History

```text
O(n)
```

where:

```text
n = total transactions
```

---

## Real-World Backend Mapping

Current Implementation:

```java
ArrayList<String> transactionHistory
```

In a real banking system:

```java
TransactionRepository
```

would store transactions inside a database.

Example:

```java
transactionRepository.save(transaction);
```

Similarly:

Current:

```java
BankAccount
```

Real System:

```java
Account Entity
```

stored inside:

- MySQL
- PostgreSQL
- Oracle Database

---

## Learning Outcomes

After completing this exercise, I learned:

- How ATM systems work internally
- How authentication is implemented
- How account state changes over time
- How transaction history is maintained
- How service classes separate business logic
- How OOP principles improve maintainability
- How backend systems manage account operations

---

## Future Improvements

Possible enhancements:

- Change PIN
- Mini Statement (Last 5 Transactions)
- Transfer Money
- Multiple Accounts using HashMap
- Account Lock after Multiple Failed Attempts
- File Storage
- Database Integration
- Spring Boot REST APIs

---

## Author

Part of my Java SDE-1 Preparation Journey.

Exercise 07 focuses on building an ATM Simulation System using Java, OOP, Authentication, Transaction Tracking, and Service Layer Design.
