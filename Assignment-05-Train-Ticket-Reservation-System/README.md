# Train Ticket Reservation System

**Java Programming – Assignment 5**  
**Deccan Education Society, Pune University**

## Project Overview

A Java-based Train Ticket Reservation System developed using Object-Oriented Programming concepts and multiple user-defined packages.

The project demonstrates how different classes can be organized into packages to manage train details, passenger information, tickets, and reservation operations.

## Project Structure

```text
Assignment-05-Train-Ticket-Reservation-System/
│
├── Main.java
├── README.md
│
├── pkgPassenger/
│   └── Passenger.java
│
├── pkgReservation/
│   └── Reservation.java
│
├── pkgTicket/
│   └── Tickets.java
│
└── pkgTrain/
    └── Train.java
```

## Packages and Classes

### 1. pkgPassenger
- **Passenger.java:** Stores passenger information such as Passenger ID, Name, Age, and Seat Number.
- Includes a constructor, getter methods, and a method to display passenger details.

### 2. pkgReservation
- **Reservation.java:** Contains an abstract Reservation class.
- Declares abstract methods `bookTickets()` and `displayTickets()`.

### 3. pkgTicket
- **Tickets.java:** Stores Ticket ID and maintains references to Train and Passenger objects.
- Includes a method to display ticket-related information.

### 4. pkgTrain
- **Train.java:** Stores Train Number, Train Name, Source, and Destination.
- Includes a constructor and a method to display train details.

### 5. Main.java
- Contains the main method and serves as the entry point of the application.

## Technologies Used

- Java Programming Language
- Object-Oriented Programming (OOP)
- User-Defined Packages
- Abstract Classes and Methods
- Constructors and Encapsulation
- Eclipse IDE

## Concepts Demonstrated

1. Creating and using user-defined packages.
2. Importing classes from different packages.
3. Encapsulation using private data members.
4. Constructors for initializing objects.
5. Abstraction using abstract classes and methods.
6. Object composition by connecting Train and Passenger objects with Tickets.

## Author

**Mirza Yaser Ali**  
Computer Science Engineering  
Deccan Education Society, Pune University

---

*Java Programming – Assignment 5*
