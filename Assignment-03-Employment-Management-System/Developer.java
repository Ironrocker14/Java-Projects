
public class Developer extends Employee 
{
	
	String Language;
	
	public void Ddetails()
	{
		System.out.println("\n-----------Developer Details-----------");
		System.out.println("Devloper Name :" + Name);
		System.out.println("Devloper ID :" + EmployeeID);
		System.out.println("Devloper Language :" + Language);
	}
	
	@Override
	public void work()
	{
		System.out.println("Developer Is Coding");
		System.out.println("-----------------------------------------\n");

	}

}
