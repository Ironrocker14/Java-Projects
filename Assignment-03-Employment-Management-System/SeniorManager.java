public class SeniorManager extends Manger 
{
	
	double Salary;
	
	public void SMdetails()
	{
		System.out.println("\n-----------Senior Manager Details---------");
		System.out.println("SeniorManager Name :" + Name);
		System.out.println("Senior Manager ID :" + EmployeeID);
		System.out.println("Senior Manager Team Size :" + teamcount);
	}
	
	@Override
	public void work()
	{
		System.out.println("Senior Manager is Working");
		System.out.println("------------------------------------------\n");

	}

}
