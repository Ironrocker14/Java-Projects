
public class Product 
{
    private int id;
    private String category;
    private String name;
    private double price;
    private int quantity;

    public Product(int id, String category, String name, double price, int quantity) 
    {
        this.id = id;
        this.category = category;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public int getId() 
    {
        return id;
    }

    public String getCategory() 
    {
        return category;
    }

    public String getName() 
    {
        return name;
    }

    public double getPrice() 
    {
        return price;
    }

    public int getQuantity() 
    {
        return quantity;
    }

    public void setCategory(String category) 
    {
        this.category = category;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public void setPrice(double price) 
    {
        this.price = price;
    }

    public void setQuantity(int quantity) 
    {
        this.quantity = quantity;
    }

    @Override
    public String toString() 
    {
        return "Product ID: " + id +
               " | Category: " + category +
               " | Name: " + name +
               " | Price: Rs." + price +
               " | Quantity: " + quantity;
    }

    @Override
    public boolean equals(Object obj) 
    {
        if (this == obj)
            return true;

        if (!(obj instanceof Product))
            return false;

        Product other = (Product) obj;
        return this.id == other.id;
    }

    @Override
    public int hashCode() 
    {
        return Integer.hashCode(id);
    }
}
