import java.util.*;

public class Test
{
	public static void main(String[] args)
	{
	
	Scanner sc = new Scanner(System.in);
	
	Student s1 = new Student();
	
	System.out.println("Enter Student 1 PRN");
	int prn = sc.nextInt();
	sc.nextLine();
	
	System.out.println("Enter Student 1 Name :");
	String name = sc.nextLine();
	
	
	Student s2 = new Student(prn, name);
	
	
	
	System.out.println("Enter Student 1 Year :");
	String year = sc.nextLine();
	
	System.out.println("Enter Student 1 Department :");
	String dept = sc.nextLine();
	
	System.out.println("Enter Student 1 Division :");
	String div = sc.nextLine();
	
	System.out.println("Enter Student 1 Moblie Number :");
	String mob = sc.nextLine();
	
	System.out.println("Enter Student 1 Percentage :");
	double per = sc.nextDouble();
	sc.nextLine();
	
	Student s3 = new Student(prn, name, year, dept, div, mob, per);
	
	System.out.println("----------------Student 1--------------");
	System.out.println(s1);
	
	System.out.println("----------------Student 2 --------------");
	System.out.println(s2);
	
	System.out.println("----------------Student 3 --------------");
	System.out.println(s3);
	
	}
}	