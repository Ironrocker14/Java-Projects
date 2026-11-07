# Library Management System

**Java Programming – Assignment 1**  
**Deccan Education Society, Pune University**

## Project Overview

A console-based Library Management System developed using Java. The application allows users to manage library book records through a menu-driven interface.

It demonstrates fundamental Java programming concepts, including classes, objects, methods, arrays, loops, conditional statements and switch-case operations.

## Features

- **Add Book:** Add a new book with its ID, name, author and quantity.
- **Delete Book:** Remove a book using its ID.
- **Update Book:** Modify existing book details.
- **Search Book:** Find a book using its ID.
- **Return Book:** Increase the available quantity of a book.
- **Display Books:** View all available book records.
- **Exit:** Close the application.

## Technologies Used

- Java
- JDK
- Eclipse IDE
- Scanner class for user input

## Project Structure

```text
Library-Management-System/
│
├── Book.java
├── Libmanage.java
├── Main.java
│
└── README.md
```

## Class Description

### 1. Book.java
Defines the Book class with the following attributes:

- `bookId` – Unique identifier of a book.
- `bookName` – Name of the book.
- `authorName` – Name of the author.
- `quantity` – Available book quantity.

Includes the `displayBook()` method to display book information.

### 2. Libmanage.java
Handles the main library operations:

- `addBook()`
- `deleteBook()`
- `updateBook()`
- `searchBook()`
- `returnBook()`
- `displayBooks()`

Uses an array of Book objects to maintain book records.

### 3. Main.java
Contains the main method and provides a menu-driven interface using switch-case and a do-while loop.

## Java Concepts Implemented

- Classes and Objects
- Object Instantiation
- Methods and Method Calls
- Arrays of Objects
- For Loop
- Do-While Loop
- Switch-Case
- If Statements
- Scanner Class for Input Handling

## How to Run

### Using Eclipse IDE

1. Create a Java project in Eclipse.
2. Add `Book.java`, `Libmanage.java` and `Main.java` to the same source folder.
3. Ensure all three files are in the same package (default package if using the supplied source).
4. Run `Main.java` as a Java Application.
5. Use the displayed menu to perform library operations.

### Using Command Prompt

Compile the Java files:

```bash
javac Book.java Libmanage.java Main.java
```

Run the application:

```bash
java Main
```

## Sample Menu

```text
===== LIBRARY MANAGEMENT SYSTEM =====
1. Add Book
2. Delete Book
3. Update Book
4. Search Book
5. Return Book
6. Display Book
7. Exit

Enter your choice:
```

## Storage

The application uses an array of 100 Book objects for temporary in-memory storage. Book records are not persisted after the application terminates.

## Project Status

Completed – Functional academic assignment.

## Author

**Mirza Yaser Ali**  
B.Tech – Computer Science Engineering  
Deccan Education Society, Pune University

GitHub: https://github.com/Ironrocker14
