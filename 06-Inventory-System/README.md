# Exercise 06 - Inventory Management System

## Overview

This project is a simple Inventory Management System built using Core Java and Object-Oriented Programming principles.

The application allows users to:

- Add Products
- Search Products
- Update Product Quantity
- Remove Products
- Display All Products

This exercise is designed to simulate how a backend service manages inventory data and perform CRUD operations using a HashMap.

---

## Concepts Covered

### Core Java

- Classes & Objects
- Constructors
- Encapsulation
- Methods
- Arrays & Collections

### Collections Framework

- HashMap
- Key-Value Storage
- Fast Lookup Operations

### OOP Principles

- Encapsulation
- Single Responsibility Principle
- Separation of Concerns

### Backend Concepts

- CRUD Operations
- Service Layer Design
- Data Management

---

## Project Structure

```text
06-Inventory-System
│
├── src
│   ├── Product.java
│   ├── InventoryManager.java
│   └── InventorySystem.java
│
├── README.md
└── Screenshot 2026-06-23 184130.png
```

---

## Class Design

### Product.java

Represents a product stored in inventory.

Attributes:

```java
private int productId;
private String productName;
private int quantity;
```

Responsibilities:

- Store product information
- Provide getters/setters
- Display product details

---

### InventoryManager.java

Acts as the service layer.

Responsibilities:

- Add Product
- Find Product
- Update Quantity
- Remove Product
- Display Inventory

Uses:

```java
HashMap<Integer, Product>
```

where:

```text
Key   -> Product ID
Value -> Product Object
```

Example:

```text
101 -> Laptop
102 -> Mouse
103 -> Keyboard
```

---

### InventorySystem.java

Application entry point.

Responsibilities:

- Create products
- Call inventory operations
- Display results

---

## CRUD Operations Implemented

| Operation | Method |
|------------|------------|
| Create | addProduct() |
| Read | findProduct() |
| Update | updateQuantity() |
| Delete | removeProduct() |

---

## Why HashMap?

Instead of using:

```java
ArrayList<Product>
```

we use:

```java
HashMap<Integer, Product>
```

because product lookup becomes significantly faster.

### ArrayList Search

```text
O(n)
```

### HashMap Search

```text
O(1)
```

Average Case

---

## Sample Execution

The application performs:

1. Add Products
2. Display Inventory
3. Search Product
4. Update Quantity
5. Remove Product
6. Display Final Inventory

---

## Output Screenshot

![Inventory System Output](Screenshot%202026-06-23%20184130.png)

---

## Time Complexity Analysis

### Add Product

```text
O(1)
```

---

### Find Product

```text
O(1)
```

---

### Update Product

```text
O(1)
```

---

### Remove Product

```text
O(1)
```

---

### Display All Products

```text
O(n)
```

where:

```text
n = total products
```

---

## Real-World Backend Mapping

Current Implementation:

```java
HashMap<Integer, Product>
```

acts like a temporary database.

In Spring Boot applications, this would typically become:

```java
ProductRepository
```

connected to:

- MySQL
- PostgreSQL
- MongoDB

Example:

```java
productRepository.save(product);
```

The CRUD concepts remain exactly the same.

---

## Learning Outcomes

After completing this exercise, I learned:

- How to model real-world entities using classes
- How CRUD operations work
- How HashMap provides efficient data access
- How service classes separate business logic
- How backend applications manage inventory-like data
- How OOP principles improve code organization

---

## Future Improvements

Possible enhancements:

- Transaction History
- Product Categories
- Low Stock Alerts
- File Storage
- Database Integration
- Spring Boot REST APIs
- Inventory Reports

---

## Author

Part of my Java SDE-1 Preparation Journey.

Exercise 06 focuses on building a real-world Inventory Management System using Java, OOP, and HashMap.
