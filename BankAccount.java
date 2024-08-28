public class BankAccount extends Asset implements Measurable
{
   private double balance; 
   
   public BankAccount(int idNumber, double balance)
   {
      super(idNumber);
      this.balance = balance;
   }
   
   public String description()
   {
      return "It's a bank account.";
   }
   
   public double getMeasure()
   {
      return balance;
   }
   
   @Override
   public String toString()
   {
      return String.format("%s, Balance: %,.2f", 
      super.toString(), balance); 
   }
   
   public double getBalance()
   {
      return balance;
   }
   
   public void setBalance(double balance)
   {
      this.balance = balance;
   }
}