public class NonMetalElement extends Element
{
   public NonMetalElement(String symbol, int number, double weight)
   {
      super(symbol, number, weight);
   }
   
   public String describeElement()
   {
      return "It is a poor conductor.";
   }
}
/*
Error: "Class" is not abstract and does not override abstract method 
describeElement() in Element

Error: Constructor Element in class Element cannot be applied to 
given types

Super() must match arugments and parameters