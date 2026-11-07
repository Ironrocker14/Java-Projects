public class Book 
{

    int bookId;
    String bookName;
    String authorName;
    int quantity;

    public void displayBook() 
    {
        System.out.println(
            bookId + "\t\t" +
            bookName + "\t\t" +
            authorName + "\t\t" +
            quantity
        );
    }
}