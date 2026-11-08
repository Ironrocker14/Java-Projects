import java.util.*;

import pkgPassenger.Passenger;
import pkgReservation.Reservation;
import pkgTicket.Ticket;
import pkgTrain.Train;

public class Main
{

	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		
		Train t1 = new Train(12025, "Shatabdi Exp", "Pune", "Hyderabad");
		Train t2 = new Train(12026, "Pune Shatabdi Exp", "Hyderabad", "Pune");
		
		Ticket ticket = null;
		int choice;
		
		do
		{
			System.out.println("-------------Railway Reservation System------------");
			System.out.println("1. Show Train");
			System.out.println("2. Book Ticket");
			System.out.println("3. Cancel Ticket");
			System.out.println("4. Exit");
			System.out.println("Enter Your Choice :");
			choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice)
			{
				case 1:
					System.out.println("\n------------Available Trains-----------\n");
					t1.displayTrain();
					System.out.println("\n---------------------------------------\n");
					t2.displayTrain();
					break;
					
				case 2:
					if(ticket != null)
					{
						System.out.println("Ticket Already exists. Cancel That first");
						break;
					}
					else
					{
						System.out.println("Enter Train No :");
						int traino = sc.nextInt();
						sc.nextLine();
						
						Train selectedTrain;
						
						if(traino == 12025)
						{
							selectedTrain = t1;
						}
						
						else if(traino == 12026)
						{
							selectedTrain = t2;
						}
						
						else
						{
							System.out.println("Invalid Train No");
							break;
						}
						
						System.out.println("Enter Passenger ID :");
						int id = sc.nextInt();
						
						System.out.println("Enter Passenger Name :");
						String name = sc.nextLine();
						
						System.out.println("Enter Passenger Age :");
						int age = sc.nextInt();
						sc.nextLine();
						
						System.out.println("Enter Passenger Seat Number :");
						int seat = sc.nextInt();
						sc.nextLine();
						
						Passenger p = new Passenger(id ,name, age, seat);
						ticket = new Ticket(selectedTrain ,p);
						
						ticket.bookTicket();
						ticket.displayTickets();
						break;	
					}
					
				case 3:
					if(ticket != null)
					{
						ticket.cancelTickets();
						ticket = null;
					}
					
					else
					{
						System.out.println("No ticket Found");
					}
					break;
					
				case 4:
					System.out.println("Exiting.......... ");
					break;
					
				default:
					System.out.println("Invalid Choice");
			}
		}
		
		while(choice != 4);
		
		sc.close();
	}

}
