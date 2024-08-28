public class MeasurableTest
{
   public static void main(String[] args)
   {
      Measurable[] things = {new BankAccount(0, 0),
         new BankAccount(1, 1), new Circle(2, 10.0),
         new Circle(3, 34.0),
         new Numbers(4, new int[] {1, 2, 3, 4, 5}),
         new Numbers(5, new int[] {9, 0, -1, 2, 4})};
         
      for(Measurable thing: things)
      {
         System.out.println(thing);
         System.out.println(((Asset)thing).description());
         System.out.println(thing.getMeasure());
      }
   }
}