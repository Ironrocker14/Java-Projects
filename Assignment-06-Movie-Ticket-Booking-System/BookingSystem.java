public class BookingSystem 
{
	int availableSeats = 10;
	
	public synchronized void bookTickets(String user, int seats) throws SeatBookingException
	{
		if(seats > availableSeats)
		{
			throw new SeatBookingException("Not Enough Seats Available For " + user);
		}
		
		int amount = seats * 200;
		System.out.println("\n--------------------------------------------------\n");
		
		System.out.println(user +" " + "Booked" +" " + seats + " " + "tickets");
		System.out.println("The Total Amount to be Paid : " + amount);
		System.out.println("Payement Sucessfull ");
		
		availableSeats = availableSeats - seats;
		
		displayTickets(user, seats, amount);	
		
	}
	
	public void displayTickets(String user, int seats, int amount)
	{
		System.out.println("\n-------------------- Tickets --------------------");
		System.out.println("User : " + user);
		System.out.println("Tickets : " + seats);
		System.out.println("Amount : " + amount);
		System.out.println("\n--------------------------------------------------");
		System.out.println("--------------------------------------------------\n");
		
		System.out.println("Remaining Seats : " + availableSeats);
		System.out.println("--------------------------------------------------\n");
	}

}
