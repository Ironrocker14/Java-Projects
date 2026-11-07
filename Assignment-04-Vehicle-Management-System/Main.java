import java.util.Scanner;

public class Main
{
    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);
        int choice;
        
        Car c = new Car();
        Bike b = new Bike();
        Bus bus = new Bus();
        
        do 
        {
            System.out.println("\n--- Vehicle Management System ---");
            System.out.println("1. Car");
            System.out.println("2. Bike");
            System.out.println("3. Bus");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice)
            {
                case 1:
                    System.out.println("You selected Car");
                    c.start();
                    c.stop();
                    break;

                case 2:
                    System.out.println("You selected Bike");
                    b.start();
                    b.stop();
                    break;

                case 3:
                    System.out.println("You selected Bus");
                    bus.start();
                    bus.stop();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}