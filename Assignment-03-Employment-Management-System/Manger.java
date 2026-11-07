public class Manger extends Employee 
{
	
	int teamcount;
	
	public void Mdetails()
	{
		System.out.println("\n----------- Manager Details---------");
		System.out.println("Team Members Count :" + teamcount);
		System.out.println("Manager Name :" + Name);
		System.out.println("Manager ID :" + EmployeeID);
	}
	
	@Override
	public void work()
	{
		System.out.println("Manager Is Working");
		System.out.println("-------------------------------------\n");

	}

}
