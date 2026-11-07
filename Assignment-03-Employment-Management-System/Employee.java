public class Employee
{
	String Name;
	int EmployeeID;
	
	public void Edisplay()
	{
		System.out.println("-----------Employee Details---------");
		System.out.println("Employee Name :" + Name);
		System.out.println("Employee ID :" + EmployeeID);
	}
	
	public void work()
	{
		System.out.println("Employee Is Working");
		System.out.println("--------------------------------------\n");
	}
}