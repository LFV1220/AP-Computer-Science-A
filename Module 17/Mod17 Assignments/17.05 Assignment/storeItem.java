
/**
 * Write a description of class storeItem here.
 *
 * @author Luis Vega
 * @version 3/26/20
 */
public class storeItem
{
    private String name;
    private int productNumber,quantity;
    private double price;
    
    public storeItem(String name,int productNumber,int quantity,double price)
    {
        this.name = name;
        this.productNumber = productNumber;
        this.quantity = quantity;
        this.price = price;
    }
    
    public String toString()
    {
        String item = name + "  (" + productNumber + ")  - $" + price + " [" + quantity + " available]";
        return item;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public int getProductNumber()
    {
        return productNumber;
    }
    
    public void setProductNumber(int productNumber)
    {
        this.productNumber = productNumber;
    }
    
    public int getQuantity()
    {
        return quantity;
    }
    
    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }
    
    public double getPrice()
    {
        return price;
    }
    
    public void setPrice(double price)
    {
        this.price = price;
    }
}
