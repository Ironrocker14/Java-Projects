
# Inventory Management System

**Java Programming – Assignment 7**  
**Deccan Education Society, Pune University**  
**B.Tech – Computer Science and Engineering**

## Project Overview

A console-based Inventory Management System developed using Java. The application manages product records and demonstrates the use of Java Collection Framework interfaces and classes.

Users can add, remove, update, check duplicate products and display inventory records using different collection structures.

## Objectives

- Understand and implement the Java Collection Framework.
- Perform inventory operations using ArrayList and LinkedList.
- Implement HashSet and TreeSet for managing unique products.
- Demonstrate adding, removing and updating elements.
- Use Iterator to traverse collection elements.
- Understand Comparable and Comparator interfaces.
- Implement duplicate checking using product IDs.

## Technologies Used

- Java
- JDK
- Eclipse IDE
- Java Collection Framework

## Collection Structures Implemented

| Collection | Description |
|---|---|
| ArrayList | Maintains insertion order and allows duplicates |
| LinkedList | Implements a doubly linked list |
| HashSet | Stores unique elements without guaranteed order |
| TreeSet | Stores unique elements in sorted order |

## Project Structure

```text
Assignment-07-Inventory-Management-System/
│
├── README.md
│
└── src/
    ├── Product.java
    ├── InventoryOperations.java
    └── InventoryManagement.java
```

## Features

1. Add new products to inventory.
2. Remove products using Product ID.
3. Update existing product details.
4. Check whether a Product ID exists.
5. Display all inventory records.
6. Display records using Iterator.
7. Select between four collection structures.

## Product Attributes

- Product ID
- Category
- Product Name
- Price
- Quantity

## Sample Products

| ID | Category | Name |
|---|---|---|
| 101 | Electronics | Laptop |
| 102 | Groceries | Biscuits |
| 103 | Clothing | Shirts |

## Concepts Demonstrated

- Java Collection Framework
- ArrayList and LinkedList
- HashSet and TreeSet
- Collection Interface
- Iterator Interface
- Comparable Interface
- Comparator Interface
- equals() and hashCode()
- Object-Oriented Programming
- Menu-driven programming

## How to Run

1. Open Eclipse IDE.
2. Import or create the Java project.
3. Add all three source files inside the src folder.
4. Run `InventoryManagement.java`.
5. Select a collection structure.
6. Perform inventory operations using the menu.

## Conclusion

The Inventory Management System demonstrates the practical implementation of Java Collection Framework concepts. It provides experience in managing objects using different collection structures and performing operations such as insertion, deletion, updating, duplicate checking and iteration.
