public class BookingThread extends Thread
{
	BookingSystem system;
	String user;
	int seats;
	
	public BookingThread(String user, int seats, BookingSystem system)
	{
		this.seats = seats;
		this.user = user;
		this.system = system;
	}
	
	public void run()
	{
		try
		{
			system.bookTickets(user, seats);
		}
		
		catch(SeatBookingException s)
		{
System.out.println(s.getMessage());
		}
	}
}
