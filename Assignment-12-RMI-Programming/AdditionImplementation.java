import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class AdditionImplementation extends UnicastRemoteObject implements Addition
{

	public AdditionImplementation() throws RemoteException
	{
		super();	
	}
	
	public int add(int a, int b) throws RemoteException
	{
		return a+b;
	}
	
}
