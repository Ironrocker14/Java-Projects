
import java.util.*;

public class InventoryManagement 
{

    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);

        Collection<Product> inventory = null;

        System.out.println("================================");
        System.out.println("   INVENTORY MANAGEMENT SYSTEM");
        System.out.println("================================");

        System.out.println("\nSelect Data Structure:");
        System.out.println("1. ArrayList");
        System.out.println("2. LinkedList");
        System.out.println("3. HashSet");
        System.out.println("4. TreeSet");

        System.out.print("Enter your choice: ");
        int choice = Integer.parseInt(sc.nextLine());

        switch (choice) 
        {
            case 1:
                inventory = new ArrayList<>();
                System.out.println("ArrayList Selected.");
                break;

            case 2:
                inventory = new LinkedList<>();
                System.out.println("LinkedList Selected.");
                break;

            case 3:
                inventory = new HashSet<>();
                System.out.println("HashSet Selected.");
                break;

            case 4:
                inventory = new TreeSet<>(
                    Comparator.comparingInt(Product::getId)
                );
                System.out.println("TreeSet Selected.");
                break;

            default:
                System.out.println("Invalid Choice!");
                sc.close();
                return;
        }

        InventoryOperations operations =
                new InventoryOperations(inventory, sc);

        int option;

        do 
        {
            System.out.println("\n================================");
            System.out.println("       INVENTORY OPERATIONS");
            System.out.println("================================");
            System.out.println("1. Add Product");
            System.out.println("2. Remove Product");
            System.out.println("3. Update Product");
            System.out.println("4. Check Duplicates");
            System.out.println("5. Normal Display");
            System.out.println("6. Iterator Display");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");
            option = Integer.parseInt(sc.nextLine());

            switch (option)
            {
                case 1:
                    operations.addInventory();
                    break;

                case 2:
                    operations.deleteInventory();
                    break;

                case 3:
                    operations.updateInventory();
                    break;

                case 4:
                    operations.checkDuplicates();
                    break;

                case 5:
                    operations.normDisplay();
                    break;

                case 6:
                    operations.iterateDisplay();
                    break;

                case 7:
                    System.out.println("Thank you for using Inventory Management System!");
                    break;

                default:
                    System.out.println("Invalid Choice! Try Again.");
            }

        } 
        
        while (option != 7);

        sc.close();
    }
}
