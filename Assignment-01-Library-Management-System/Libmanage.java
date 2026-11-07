import java.util.Scanner;

public class Libmanage
{

    Book[] books = new Book[100];
    int count = 0;

    Scanner sc;
    
    public Libmanage(Scanner sc) 
    {
        this.sc = sc;
    }

    // 1. Add Book
    public void addBook() 
    {

        Book b = new Book();

        System.out.print("Enter Book ID: ");
        b.bookId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Book Name: ");
        b.bookName = sc.nextLine();

        System.out.print("Enter Author Name: ");
        b.authorName = sc.nextLine();

        System.out.print("Enter Quantity: ");
        b.quantity = sc.nextInt();

        books[count] = b;
        count++;

        System.out.println("Book Added Successfully.");
    }

    // 2. Delete Book
    public void deleteBook() 
    {

        System.out.print("Enter Book ID to Delete: ");
        int id = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < count; i++) 
        {

            if (books[i].bookId == id)
            {

                // Shift books to the left
                for (int j = i; j < count - 1; j++) 
                {
                    books[j] = books[j + 1];
                }

                books[count - 1] = null;
                count--;

                found = true;

                System.out.println("Book Deleted Successfully.");
                break;
            }
        }

        if (!found) 
        {
            System.out.println("Book Not Found.");
        }
    }

    // 3. Update Book
    public void updateBook() 
    {

        System.out.print("Enter Book ID to Update: ");
        int id = sc.nextInt();
        sc.nextLine();

        boolean found = false;

        for (int i = 0; i < count; i++) 
        {

            if (books[i].bookId == id) 
            {

                System.out.print("Enter New Book Name: ");
                books[i].bookName = sc.nextLine();

                System.out.print("Enter New Author Name: ");
                books[i].authorName = sc.nextLine();

                System.out.print("Enter New Quantity: ");
                books[i].quantity = sc.nextInt();

                found = true;

                System.out.println("Book Updated Successfully.");
                break;
            }
        }

        if (!found) 
        {
            System.out.println("Book Not Found.");
        }
    }

    // 4. Search Book
    public void searchBook() 
    {

        System.out.print("Enter Book ID to Search: ");
        int id = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < count; i++) 
        {

            if (books[i].bookId == id) 
            {

                System.out.println("\nBook Found!");
                System.out.println("Book ID: " + books[i].bookId);
                System.out.println("Book Name: " + books[i].bookName);
                System.out.println("Author Name: " + books[i].authorName);
                System.out.println("Quantity: " + books[i].quantity);

                found = true;
                break;
            }
        }

        if (!found) 
        {
            System.out.println("Book Not Found.");
        }
    }

    // 5. Return Book
    public void returnBook() 
    {

        System.out.print("Enter Book ID to Return: ");
        int id = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < count; i++)
        {

            if (books[i].bookId == id) 
            {

                books[i].quantity++;

                found = true;

                System.out.println("Book Returned Successfully.");
                System.out.println("Updated Quantity: " + books[i].quantity);

                break;
            }
        }

        if (!found) 
        {
            System.out.println("Book Not Found.");
        }
    }

    // 6. Display Books
    public void displayBooks() 
    {

        if (count == 0) 
        {
            System.out.println("No Books Available.");
            return;
        }

        System.out.println("\n------------------------------------------------------------");
        System.out.println("Book ID\t\tBook Name\t\tAuthor\t\tQuantity");
        System.out.println("------------------------------------------------------------");

        for (int i = 0; i < count; i++) 
        {
            books[i].displayBook();
        }

        System.out.println("------------------------------------------------------------");
    }
}