
import java.util.Scanner;

public class TestApp
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        HospitalDAO dao = new HospitalDAO();

        if(!dao.createConnection())
        {
            sc.close();
            return;
        }

        int choice = -1;

        do
        {
            System.out.println("\n===== HOSPITAL MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Patient");
            System.out.println("2. View Patients");
            System.out.println("3. Update Patient");
            System.out.println("4. Delete Patient");
            System.out.println("5. Book Appointment");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");

            if(!sc.hasNextInt())
            {
                System.out.println("Please enter a valid number.");
                sc.nextLine();
                continue;
            }

            choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    dao.addPatient();
                    break;

                case 2:
                    dao.viewPatient();
                    break;

                case 3:
                    dao.updatePatient();
                    break;

                case 4:
                    dao.deletePatient();
                    break;

                case 5:
                    dao.bookAppointment();
                    break;

                case 0:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice. Try Again.");
            }

        } while(choice != 0);

        dao.closeConnection();
        sc.close();
    }
}
