public class PairTwo
{
   private Person first;
   private int second;
   
   public PairTwo(Person first, int second)
   {
      this.first = first;
      this.second = second;
   }
   
   @Override
   public String toString()
   {
      return String.format("(%s, %.2f)", first, second);
   }
   
   public Person getFirst()
   {
      return first;
   }
   
   public int getSecond()
   {
      return second;
   }
}