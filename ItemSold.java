public class ItemSold
{
   protected String description;
   protected int invoice; 
   protected double price; 
   
   public ItemSold(String description, int invoice, double price)
   {
      this.description = description;
      this.invoice = invoice; 
      this.price = price; 
   }
   
   @Override
   public String toString()
   {
      return String.format("Description: %s Inoice: %d Price: $%,.2f", 
         description, invoice, price);
   }
   
   public String getDescription()
   {
      return description;
   }
   
   public int getInvoice()
   {
      return invoice;
   }
   
   public double getPrice()
   {
      return price;
   }
   
   public void setDescription(String description)
   {
      this.description = description;
   }
   
   public void setInvoice(int invoice)
   {
      this.invoice = invoice;
   }
   
   public void setPrice(double price)
   {
      this.price = price; 
   }
}
   