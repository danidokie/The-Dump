public class MetalElement extends Element
{
   public MetalElement(String symbol, int number, double weight)
   {
      super(symbol, number, weight);
   }
   
   public String describeElement()
   //no abstract, no semicolon
   {
      return "It's metal.";
   }
}