public class Circle extends Asset implement Measurable
{
   private double radius;
   
   public class Circle(int idNumber, double radius)
   {
      super(idNumber);
      this.radius = radius; 
   }
   
   public String description()
   {
      return "It's a circle.";
   }   
   
   public double getMeasure()
   {
      return pi * radius * radius;
   }
   
   @Override
   public String toString()
   {
      return String.format("%s Radius: %,.2f", super.toString(),
         radius);
   }
   
   public double getRadius()
   {
      return radius;
   }
   
   public double setRadius(double radius)
   {
      this.radius = radius;
   }
}