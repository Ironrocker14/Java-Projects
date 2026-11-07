public class Student
{
	
	int PRN;
	String Name;
	String Year;
	String Department;
	String Division;
	String Mobile;
	double Percentage;
	
	public Student()
	{
		PRN= 0;
		Name = "Null";
		Year = "Null";
		Department = "Null";
		Division = "Null";
		Mobile = "Null";
		Percentage = 0.0;
	}
	
	public Student(int PRN, String Name)
	{
		this.PRN = PRN;
		this.Name = Name;
		Year = "Null";
		Department = "Null";
		Division = "Null";
		Mobile = "Null";
		Percentage = 0.0;
	}
	
	public Student(int PRN,	String Name, String Year, String Department, String Division, String Mobile, double Percentage)
	{
		this.PRN = PRN;
		this.Name = Name;
		this.Year = Year;
		this.Department = Department;
		this.Division = Division;
		this.Mobile = Mobile;
		this.Percentage = Percentage;
	}
	
	public String toString()
	{
		return "PRN :" + PRN 
				+"\n Student Name :" +Name
				+"\n Year :" +Year
				+"\n Department :" +Department
				+"\n Division :" +Division
				+"\n Mobile :" +Mobile
				+"\n Percentage :" +Percentage +"%";
	}
}