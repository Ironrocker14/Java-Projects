package pkgTicket;

import pkgPassenger.Passenger;
import pkgReservation.Reservation;
import pkgTrain.Train;


public class Ticket extends Reservation
{
	
	Train train;
	Passenger passenger;
	
	boolean booked = false;
	
	public Ticket(Train train, Passenger passenger)
	{
		this.train = train;
		this.passenger = passenger;
	}
	
	@Override
	public void bookTicket()
	{
		if(!booked)
		{
			booked = true;
			System.out.println("Ticket Booked Successfully");
		}
		else
		{
			System.out.println("Ticket not found");
		}
	}
	
	@Override
	public void displayTickets()
	{
		if(booked)
		{
			System.out.println("--------------Ticket Details---------------");
			train.displayTrain();
			passenger.displayPassenger();
		}
		else
		{
			System.out.println("Ticket Not Found");
		}
	}	
	@Override
	public void cancelTickets()
	{
		if(booked)
		{
			booked = false;
			System.out.println("Ticket Cancelled Successfully");
		}
		else
		{
			System.out.println("Ticket Not Found");
		}
	
	}
	

}
