
# File Handling System in Java

**Java Programming – Assignment 8**  
**Deccan Education Society, Pune University**  
**B.Tech – Computer Science and Engineering**  
**Semester III | Academic Year 2026-27**

## Project Overview

A console-based File Handling System developed using Java. The application demonstrates file creation, reading, writing and appending data using Java I/O classes.

It implements both Byte Streams and Character Streams to perform file operations and retrieve file information.

## Aim

To develop a Java program to read from and write to files using FileReader, FileWriter, BufferedReader and BufferedWriter, applicable to systems requiring data storage and retrieval.

## Objectives

- Understand Java File Handling concepts.
- Create files using the File class.
- Perform file reading using Byte Streams.
- Perform file writing using Byte Streams.
- Perform file reading using Character Streams.
- Perform file writing using Character Streams.
- Append additional information to existing files.
- Retrieve file properties and information.
- Implement appropriate exception handling.

## Technologies Used

- Java
- JDK
- Eclipse IDE
- Java I/O Package

## Classes Implemented

### 1. FileOperations.java

Implements the following methods:

- createNewFile()
- readByteFile()
- writeByteFile()
- readCharacterFile()
- writeCharacterFile()
- appendDataFile()
- DisplayFileInfo()

### 2. TestFileHandling.java

Contains the main method and a menu-driven interface for performing different file operations.

## Features

1. Create a new file.
2. Read file using Byte Stream.
3. Write file using Byte Stream.
4. Read file using Character Stream.
5. Write file using Character Stream.
6. Display file information.
7. Append data to an existing file.
8. Handle file-related exceptions.

## Java Concepts Demonstrated

- File Class
- FileInputStream
- FileOutputStream
- FileReader
- FileWriter
- BufferedReader
- BufferedWriter
- Exception Handling
- Scanner Class
- Menu-driven Programming

## Project Structure

```text
Assignment-08-File-Handling-System/
│
├── README.md
│
└── src/
    ├── FileOperations.java
    └── TestFileHandling.java
```

## How to Run

1. Open Eclipse IDE.
2. Create a Java project named FileHandlingSystem.
3. Create FileOperations.java and TestFileHandling.java.
4. Add the respective source code.
5. Run TestFileHandling.java as a Java Application.
6. Enter a filename when prompted.
7. Select the required operation from the menu.

## Sample File Operations

| Operation | Description |
|---|---|
| Create | Creates a new file |
| Byte Read | Reads data using FileInputStream |
| Byte Write | Writes data using FileOutputStream |
| Character Read | Reads data using FileReader and BufferedReader |
| Character Write | Writes data using FileWriter and BufferedWriter |
| File Info | Displays file properties |
| Append | Adds data without deleting existing content |

## Conclusion

The File Handling System demonstrates the implementation of Java I/O operations using Byte Streams and Character Streams. It provides practical understanding of file creation, reading, writing, appending and retrieving file information with appropriate exception handling.
