import java.io.*;
import java.net.*;

public class Server
{

	public static void main(String[] args)
	{
		try
		{
			ServerSocket serverSocket = new ServerSocket(5000);
			System.out.println("Server is waiting for client.....");
			
			Socket socket = serverSocket.accept();
			
			System.out.println("Client Connected Successfully");
			
			BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			PrintWriter output = new PrintWriter(socket.getOutputStream(), true);
			
			String message = input.readLine();
			
			System.out.println("Message from client" + message);
			
			output.println("Hello Client Message recieved");
			
			output.close();
			
			input.close();
			
			socket.close();
			
			serverSocket.close();
			
			System.out.println("Server closed successfully");
		}
		
		catch(IOException e)
		{
			System.out.println("Server Error : " + e.getMessage());
		}
		
	}

}
