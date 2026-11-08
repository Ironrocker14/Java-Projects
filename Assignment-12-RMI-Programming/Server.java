import java.rmi.registry.LocateRegistry;
import java.rmi.registry.*;

public class Server
{
	public static void main(String[] args) 
	{
		
		try
		{
			
			AdditionImplementation obj = new AdditionImplementation();
			
			Registry registry = LocateRegistry.createRegistry(1099);
			
			registry.rebind("AddService", obj);
			
			System.out.println("RMI Server is Ready");
			
		}
		
		catch(Exception e)
		{
			
			e.printStackTrace();
			
		}

	}
}
