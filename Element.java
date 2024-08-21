public abstract class Element
{
   protected String symbol;
   protected int number;
   protected double weight;
   
   public Element(String symbol, int number, double weight)
   {
      this.symbol = symbol;
      this.number = number;
      this.weight = weight;
   }
   
   public abstract String describeElement();
   
   public String getSymbol()
   {
       return symbol;
   }
   
   public int getNumber()
   {
      return number;
   }
   
   public double getWeight()
   {
      return weight;
   }
}