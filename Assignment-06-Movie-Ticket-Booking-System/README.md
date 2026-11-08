# Movie Ticket Booking System

**Java Programming – Assignment 6**  
**DES Pune University, Pune**  
**School of Engineering and Technology**

## Project Overview

A Java-based Movie Ticket Booking System developed to demonstrate multithreading and exception handling using Object-Oriented Programming concepts.

The application simulates three users attempting to book movie tickets simultaneously. It uses the Thread class and Runnable interface to create multiple threads and manages seat availability through a shared BookingSystem object.

## Project Structure

```text
Assignment-06-Movie-Ticket-Booking-System/
│
├── Test.java
├── BookingSystem.java
├── BookingThread.java
├── Booking.java
├── SeatBookingException.java
└── README.md
```

## Classes and Their Responsibilities

### 1. Test.java
- Main class and entry point of the application.
- Accepts the number of tickets required by three users.
- Creates three thread objects.
- Starts the execution of all three threads.

### 2. BookingSystem.java
- Maintains the available seats.
- Provides the `bookTickets()` method to process bookings.
- Calculates the ticket payment amount.
- Displays ticket details and remaining seats.
- Uses synchronization to prevent multiple threads from booking the same seats.

### 3. BookingThread.java
- Extends the Java Thread class.
- Stores user information and the required number of seats.
- Overrides the `run()` method to execute the booking operation.

### 4. Booking.java
- Implements the Runnable interface.
- Stores user information and the required number of seats.
- Implements the `run()` method to execute the booking operation.

### 5. SeatBookingException.java
- Implements a user-defined exception by extending the Exception class.
- Displays an appropriate error message when the requested seats are unavailable.

## Technologies Used

- Java Programming Language
- Eclipse IDE
- JDK
- Object-Oriented Programming

## Concepts Demonstrated

1. Multithreading in Java.
2. Creating threads by extending the Thread class.
3. Creating threads by implementing the Runnable interface.
4. Overriding the `run()` method.
5. Starting threads using the `start()` method.
6. Synchronization in multithreading.
7. User-defined exception handling.
8. Exception handling using try-catch and throw.
9. Shared resource management.

## Booking System Details

| Parameter | Value |
|---|---|
| Number of users | 3 |
| Initial available seats | 10 |
| Price per ticket | ₹200 |
| Booking method | Multithreading |
| Exception | SeatBookingException |

## Execution

1. Run `Test.java` from Eclipse.
2. Enter the required ticket count for User 1.
3. Enter the required ticket count for User 2.
4. Enter the required ticket count for User 3.
5. The three threads execute their booking operations.
6. The system checks seat availability and processes successful bookings.
7. If sufficient seats are unavailable, the user-defined exception displays an error message.

## Author

**Mirza Yaser Ali**  
Computer Science Engineering  
DES Pune University, Pune

---

*Java Programming – Assignment 6 | 2026–27*
