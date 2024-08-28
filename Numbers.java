import java.util.Arrays;

public class Numbers extends Asset implements Measurable
{
   private int[] numbers;
   
   public Numbers(int idNumber, int[] numbers)
   {
      super(idNumber);
      this.numbers = numbers;
   }
   
   public String description()
   {
      return "It's an array of numbers.";
   }
   
   public double getMeasure()
   {
      int total = 0;
      for(int i = 0; i < numbers.length; i++)
      {
         total = total + numbers[i];
      }
      return (double)total / numbers.length;
   }
   
   @Override
   public String toString()
   {
      return String.format("%s Numbers: %s", super.toString(),
         Arrays.toString(numbers));
   }
}