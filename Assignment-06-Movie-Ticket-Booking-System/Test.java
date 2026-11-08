import java.util.*;

public class Test
{
	public static void main(String[] args)
	{
		Scanner sobj = new Scanner(System.in);
		
		BookingSystem system = new BookingSystem();
		
		System.out.println("------------------- Movie Ticket --------------------");
		
		System.out.println("Enter Number Of Tickets for User 1 : ");
		int s1 = sobj.nextInt();
		
		System.out.println("Enter Number Of Tickets for User 2 : ");
		int s2 = sobj.nextInt();
		
		System.out.println("Enter Number Of Tickets for User 3 : ");
		int s3 = sobj.nextInt();
		
		BookingThread t1 = new BookingThread("User 1 ", s1, system);
		BookingThread t2 = new BookingThread("User 2 ", s2, system);
		
		Booking b3 = new Booking("User 3 ", s3, system);
		Thread t3 = new Thread(b3);
		
		t1.start();
		t2.start();
		t3.start();
	}

}
