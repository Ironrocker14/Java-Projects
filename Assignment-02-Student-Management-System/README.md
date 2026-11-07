# Student Management System

**Java Programming – Assignment 2**  
**Deccan Education Society, Pune University**

## Project Overview

A console-based Student Management System developed using Java to demonstrate constructor overloading and object creation.

The program stores and displays student information using different types of constructors.

## Technologies Used

- Java
- JDK
- Eclipse IDE

## Class Structure

### 1. Student.java

Defines the `Student` class with the following attributes:

- PRN
- Name
- Year
- Department
- Division
- Mobile
- Percentage

**Constructors implemented:**

- Default Constructor
- Parameterized Constructor (PRN and Name)
- Parameterized Constructor (All Attributes)

Also implements the `toString()` method to display student details.

### 2. Test.java

Contains the main method and demonstrates constructor overloading by creating three Student objects.

- `s1`: Created using the default constructor.
- `s2`: Created using the two-parameter constructor.
- `s3`: Created using the full parameterized constructor.

The program accepts user input through the Scanner class and displays the details of all three objects.

## Java Concepts Demonstrated

- Constructor Overloading
- Default and Parameterized Constructors
- Object Creation
- `this` Keyword
- `toString()` Method
- Scanner Class for User Input

## How to Run

Compile:

```bash
javac Student.java Test.java
```

Execute:

```bash
java Test
```

## Author

**Mirza Yaser Ali**  
B.Tech – Computer Science Engineering  
Deccan Education Society, Pune University
