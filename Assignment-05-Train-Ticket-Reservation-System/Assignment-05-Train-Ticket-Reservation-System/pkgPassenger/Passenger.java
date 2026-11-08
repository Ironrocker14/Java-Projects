package pkgPassenger;

public class Passenger
{
	
	Integer passengerID;
	String Name;
	Integer Age;
	Integer seatNo;
	
	public Passenger(Integer passengerID, String Name, Integer Age, Integer seatNo)
	{
		
		this.passengerID = passengerID;
		this.Name = Name;
		this.Age = Age;
		this.seatNo = seatNo;
		
	}
	
	public void displayPassenger()
	{
		System.out.println("Passenger ID :" + passengerID);
		System.out.println("Passenger Name :" + Name);
		System.out.println("Passenger Age :" + Age);
		System.out.println("Passenger Seat No :" + seatNo);
	}

}
