import java.io.*;
import java.net.*;

public class Client
{

	public static void main(String[] args)
	{
		try
		{
			
			Socket socket = new Socket("localhost", 5000);
			
			System.out.println("Connected To Server");
			
			BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			PrintWriter output = new PrintWriter(socket.getOutputStream(), true);
			
			output.println("Hello Server");
			
			System.out.println("Message sent to Server");
			
			String response = input.readLine();
			
			System.out.println("Response from Server : " + response);
			
			output.close();
			
			input.close();
			
			socket.close();
			
			System.out.println("Client closed successfully");
		}
		
		catch(IOException e)
		{
			System.out.println("Server Error : " + e.getMessage());
		}
		
	}

}
