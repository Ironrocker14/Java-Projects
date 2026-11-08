# Client-Server Communication using Socket Programming

**Java Programming – Assignment 11**  
**Deccan Education Society, Pune University**

## Project Overview

A simple client-server communication application developed using Java Socket Programming. The application establishes a connection between a client and a server using TCP/IP communication.

The client sends a text message to the server, and the server receives and displays the message. The server also sends a response back to the client.

## Technologies Used

- Java
- Socket Programming
- TCP/IP Networking
- Java Input/Output Streams
- Eclipse IDE

## Concepts Implemented

- Client-Server Architecture
- Socket Class
- ServerSocket Class
- IP Address and Port Number
- BufferedReader
- PrintWriter
- Input and Output Streams
- Exception Handling
- Resource Management

## Project Files

| File | Description |
|---|---|
| Server.java | Creates the server and waits for client connections |
| Client.java | Connects to the server and sends a message |

## How to Run

1. Open the project in Eclipse IDE.
2. Run `Server.java` first.
3. Run `Client.java` in a separate console.
4. The client connects to the server through port 5000.
5. The client sends a message, and the server displays it.
6. The server sends a response back to the client.

## Sample Output

**Server Output:**
```text
Server is waiting for client.....
Client Connected Successfully
Message from client: Hello Server
Server closed successfully
```

**Client Output:**
```text
Connected To Server
Message sent to Server
Response from Server : Hello Client Message recieved
Client closed successfully
```

## Conclusion

This project demonstrates basic client-server communication using Java Socket Programming. It provides practical understanding of TCP/IP networking, socket connections, data transmission and exception handling.
