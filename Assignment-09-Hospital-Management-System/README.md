# Hospital Management System

**Java Programming – Assignment 9**  
**Deccan Education Society, Pune University**

## Project Overview

A console-based Hospital Management System developed using Java, JDBC and MySQL.

The application allows users to manage patient records and appointments through a menu-driven interface connected to a MySQL database.

## Features

- Establish connection with MySQL database using JDBC.
- Add new patient records.
- View all registered patients.
- Update patient disease information.
- Delete patient records.
- Book patient appointments.
- Handle database connection and execution errors.

## Technologies Used

- Java
- JDBC (Java Database Connectivity)
- MySQL
- MySQL Connector/J
- Eclipse IDE

## Concepts Implemented

- JDBC Architecture
- DriverManager and Connection
- Statement and PreparedStatement
- CRUD Operations
- SQL Queries
- DAO (Data Access Object) Design Pattern
- Exception Handling
- Database Connectivity

## Project Structure

```text
Assignment-09-Hospital-Management-System/
│
├── HospitalDAO.java
├── Patient.java
├── TestApp.java
└── README.md
```

## Database Configuration

Create a MySQL database named `hospital_db`.

Create the patient table using the following SQL query:

```sql
CREATE DATABASE hospital_db;

USE hospital_db;

CREATE TABLE patient (
    id INT PRIMARY KEY,
    name VARCHAR(100),
    age INT,
    gender VARCHAR(20),
    disease VARCHAR(100),
    appointment VARCHAR(50)
);
```

Configure your local MySQL username and password in the Java database connection settings. Do not upload database passwords or other credentials to GitHub.

## How to Run

1. Install Java and Eclipse IDE.
2. Install MySQL Server.
3. Create the `hospital_db` database and `patient` table.
4. Add MySQL Connector/J to the Eclipse project's build path.
5. Configure database connection credentials locally.
6. Run `TestApp.java`.
7. Select the required operation from the menu.

## Author

**Mirza Yaser Ali**  
B.Tech – Computer Science and Engineering  
Deccan Education Society, Pune University
