public class Ladder 
{
   protected String color;
   protected int height; 
   protected double price; 
   
   public Ladder(String color, int height)
   {
      this.color = color; 
      this. height = height;
      this.price = 1.50 * this.height;
   }
   
   
   @Override 
   public String toString()
   {
      return String.format("Color: %s, Height: %d, Price: %,.2f", color, 
         height, price);
   }
   
   public void setColor(String color)
   {
      this.color = color;
   }
   
   public void setHeight(int height)
   {
      this.height = height;
   }
   
   public String getColor()
   {
      return color;
   }
   
   public int getHeight()
   {
      return height;
   }
   
   public double getPrice()
   {
      return price;
   }
   
}