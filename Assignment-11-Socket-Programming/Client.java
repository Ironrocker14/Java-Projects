import java.rmi.registry.*;
import java.util.*;

public class Client 
{

	public static void main(String[] args) 
	{
		
		try
		{
			
			Registry registry = LocateRegistry.getRegistry("localhost", 1099);
			
			Addition obj = (Addition) registry.lookup("AddService");
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter A :");
			int a = sc.nextInt();
			
			System.out.println("Enter B :");
			int b = sc.nextInt();			
			
			int result = obj.add(a, b);
			
			System.out.println("Addition = " + result);
			
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
