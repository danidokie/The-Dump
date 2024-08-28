public abstract class Asset
{
   protected int idNumber;
   
   public Asset(int idNumber)
   {
      this.idNumber = idNumber;
   }
   
   public abstract String description();
   
   
   @Override
   public String toString()
   {
      return String.format("ID: %d", idNumber);
   }
   
   public int getidNumber()
   {
      return idNumber;
   }
   
   public int setidNumber(int idNumber)
   {
      this.idNumber = idNumber;  
   }
}
