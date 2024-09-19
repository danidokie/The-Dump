import java.io.*;

public class ProcessPayrollBinary
{
   public static void main(String[] args) throws FileNotFoundException, IOException
   {
      FileReader fr = new FileReader("payroll_data.csv");
      BufferedReader br = new BufferedReader(fr);
      FileOutputStream fos = new FileOutputStream("payroll_output.bin");
      ObjectOutputStream oos = new ObjectOutputStream(fos);
      
      String line = br.readLine();
      while(line != null)
      {
         //System.out.println(line);
         String[] parts = line.split(",");
         Employee employee = new Employee(parts[0],
            parts[1], parts[2], parts[3], parts[4],
            Integer.parseInt(parts[5]),
            Double.parseDouble(parts[6]));
            oos.writeObject(employee);
            System.out.print(employee);
            line = br.readLine();
      }
   }
}