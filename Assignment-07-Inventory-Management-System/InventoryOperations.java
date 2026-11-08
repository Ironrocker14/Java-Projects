
import java.util.*;

public class InventoryOperations 
{

    private Collection<Product> inventory;
    private Scanner sc;

    public InventoryOperations(Collection<Product> inventory, Scanner sc) 
    {
        this.inventory = inventory;
        this.sc = sc;
    }

    // Find product using ID
    private Product findProduct(int id) 
    {
        for (Product p : inventory) 
        {
            if (p.getId() == id) 
            {
                return p;
            }
        }
        return null;
    }

    public void addInventory() 
    {
        System.out.print("Enter Product ID: ");
        int id = Integer.parseInt(sc.nextLine());

        if (findProduct(id) != null) 
        {
            System.out.println("Duplicate Product ID! Cannot add.");
            return;
        }

        System.out.print("Enter Category (Electronics/Groceries/Clothing): ");
        String category = sc.nextLine();

        System.out.print("Enter Product Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Price: ");
        double price = Double.parseDouble(sc.nextLine());

        System.out.print("Enter Quantity: ");
        int quantity = Integer.parseInt(sc.nextLine());

        Product p = new Product(id, category, name, price, quantity);

        inventory.add(p);

        System.out.println("Product added successfully!");
    }

    public void deleteInventory() 
    {
        System.out.print("Enter Product ID to remove: ");
        int id = Integer.parseInt(sc.nextLine());

        Product p = findProduct(id);

        if (p != null)
        {
            inventory.remove(p);
            System.out.println("Product removed successfully!");
        } 
        else 
        {
            System.out.println("Product not found!");
        }
    }

    public void updateInventory() 
    {
        System.out.print("Enter Product ID to update: ");
        int id = Integer.parseInt(sc.nextLine());

        Product p = findProduct(id);

        if (p == null) 
        {
            System.out.println("Product not found!");
            return;
        }

        System.out.print("Enter New Category: ");
        p.setCategory(sc.nextLine());

        System.out.print("Enter New Product Name: ");
        p.setName(sc.nextLine());

        System.out.print("Enter New Price: ");
        p.setPrice(Double.parseDouble(sc.nextLine()));

        System.out.print("Enter New Quantity: ");
        p.setQuantity(Integer.parseInt(sc.nextLine()));

        System.out.println("Product updated successfully!");
    }

    public void checkDuplicates() 
    {
        Set<Integer> ids = new HashSet<>();
        boolean duplicate = false;

        for (Product p : inventory) 
        {
            if (!ids.add(p.getId()))
            {
                System.out.println("Duplicate found: " + p.getId());
                duplicate = true;
            }
        }

        if (!duplicate)
        {
            System.out.println("No duplicate Product IDs found.");
        }
    }

    public void normDisplay() 
    {
        if (inventory.isEmpty()) 
        {
            System.out.println("Inventory is empty!");
            return;
        }

        System.out.println("\n----- INVENTORY DETAILS -----");

        for (Product p : inventory) 
        {
            System.out.println(p);
        }
    }

    public void iterateDisplay() 
    {
        if (inventory.isEmpty()) 
        {
            System.out.println("Inventory is empty!");
            return;
        }

        System.out.println("\n----- INVENTORY USING ITERATOR -----");

        Iterator<Product> itr = inventory.iterator();

        while (itr.hasNext()) 
        {
            System.out.println(itr.next());
        }
    }
}
