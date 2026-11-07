import java.util.Scanner;

public class Main 
{

    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);

        Libmanage library = new Libmanage(sc);

        int choice;

        do 
        {

            System.out.println("\n===== LIBRARY MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Book");
            System.out.println("2. Delete Book");
            System.out.println("3. Update Book");
            System.out.println("4. Search Book");
            System.out.println("5. Return Book");
            System.out.println("6. Display Book");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) 
            {

                case 1:
                    library.addBook();
                    break;

                case 2:
                    library.deleteBook();
                    break;

                case 3:
                    library.updateBook();
                    break;

                case 4:
                    library.searchBook();
                    break;

                case 5:
                    library.returnBook();
                    break;

                case 6:
                    library.displayBooks();
                    break;

                case 7:
                    System.out.println("Thank You for using Library Management System!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } 
        
        while (choice != 7);

        sc.close();
    }
}