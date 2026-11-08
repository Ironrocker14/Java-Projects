# Remote Method Invocation (RMI) – Addition Program

**Java Programming – Assignment 12**  
**Deccan Education Society, Pune University**

## Project Overview

A simple Java application developed using Remote Method Invocation (RMI) to perform addition of two numbers.

The application allows a client to communicate with a remote server and invoke a method to calculate the sum of two integers. The server provides the addition service, while the client sends the input values and displays the result.

## Technologies Used

- Java
- Java RMI
- Eclipse IDE
- TCP/IP Networking

## Concepts Implemented

- Remote Method Invocation
- Remote Interface
- UnicastRemoteObject
- RemoteException
- RMI Registry
- Client-Server Communication
- Object Serialization and Remote References

## Project Files

| File | Description |
|---|---|
| Addition.java | Defines the remote interface and add() method |
| AdditionImplementation.java | Implements the remote addition method |
| Server.java | Creates the RMI registry and registers the remote service |
| Client.java | Looks up the remote service and invokes the add() method |

## How to Run

1. Open the project in Eclipse IDE.
2. Run `Server.java` first.
3. Wait for the message indicating that the RMI server is ready.
4. Run `Client.java` in a separate console.
5. Enter the first integer.
6. Enter the second integer.
7. The client displays the addition result returned by the server.

## Sample Output

**Server Output:**

```text
RMI Server is Ready
```

**Client Output:**

```text
Enter A :
10
Enter B :
20
Addition = 30
```

## Conclusion

This project demonstrates Remote Method Invocation (RMI) in Java. It provides practical understanding of remote interfaces, RMI registry, remote objects and client-server communication.
