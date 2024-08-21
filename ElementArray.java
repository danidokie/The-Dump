public class ElementArray
{
   public static void main(String[] args)
   {
      Element[] elements = {
         new metalElement("U", 238, 345.6),
         new MetalElement("Pb", 67, 615.3),
         new NonMetalElement("H", 1, 0.12),
         new NonMetalElement("He", 2, 0.15)};
   
         
      for(Element element: elements)
      {
         System.out.println(element);
         System.out.println(element.describeElement());
      }
   }
}
