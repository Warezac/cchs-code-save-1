import java.util.*;

public class Product
{
   private String ProductId;
   private double Bought;
   private double Sold;
   private String Descr;
   
   public Product(String pro, double buy, double sell, String Desc)
    {
        ProductId = pro;
        Bought = buy;
        Sold = sell;
        Descr = Desc;
    }
    
    public String getID()
    {
        return ProductId;
    }
    
    public double getBought()
    {
        return Bought;
    }
    
    public double getSell()
    {
        return Sold;
    }
    
    public String getDisc()
    {
        return Descr;
    }
    
    
    
    
}
   
    
