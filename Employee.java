import java.io.Serializable;

public class Employee implements Serializable
{
   private String id;
   private String last;
   private String first;
   private String email;
   private String title;
   private int hoursWorked;
   private double hourlyPayRate;
   private double grossPay;
   private double netPay;
   
   public Employee(String id, String last, String first, String email, 
      String title, int hoursWorked, double hourlyPayRate)
   {
      this.id = id;
      this.last = last; 
      this.first = first;
      this.email = email;
      this.title = title;
      this.hoursWorked = hoursWorked;
      this.hourlyPayRate = hourlyPayRate;
      grossPay = hoursWorked * hourlyPayRate;
      netPay = 0.94 * grossPay;
   }
   
   @Override
   public String toString()
   {
      return String.format("%s %15s, %10s %d %,8.2f $%,.2f $%,8.2f%n", id, last, first, 
               hoursWorked, hourlyPayRate, grossPay, netPay);
   }
}