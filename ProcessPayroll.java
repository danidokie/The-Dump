import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;
//file you want to read must be in same folder as code//mockaroo.com for data
public class ProcessPayroll
{
   public static void main(String[] args)
   {
      try(FileReader fr = new FileReader("payroll_data.csv");
            BufferedReader br = new BufferedReader(fr);
            FileWriter fw = new FileWriter("payroll_report.txt");
            BufferedWriter bw = new BufferedWriter(fw))
      {
         String line = br.readLine();
         while(line != null)
         {
            System.out.println(line);
            String[] parts = line.split(",");
            String id = parts[0];
            String first = parts[1];
            String last = parts[2];
            String email = parts[3];
            String title = parts[4];
            int hoursWorked = Integer.parseInt(parts[5]);
            double hourlyPayRate = Double.parseDouble(parts[6]);
            double grossPay = hoursWorked * hourlyPayRate;
            double netPay = 0.94 * grossPay;
            bw.write(String.format("%s %15s, %10s %d %,8.2f $%,.2f $%,8.2f%n", id, last, first, 
               hoursWorked, hourlyPayRate, grossPay, netPay));
            line = br.readLine();
         }
      }
      catch(FileNotFoundException e)
      {
         System.out.println("File not found.");
      }
      catch(IOException e)
      {
         System.out.println("Something went wrong.");
      }
   }
}