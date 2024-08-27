public class CarSold extends ItemSold
{
   private boolean licensed;
   private boolean insured; 
   private boolean operable;
   
   public CarSold(String description, int invoice, double price,
      boolean licensed, boolean insured, boolean operable)
   {
      super(description, invoice, price);
      this.licensed = licensed;
      this.insured = insured;
      this.operable = operable;
   }
   
   @Override
   public String toString()
   {
      return String.format("%s Licensed: %b Insured: %b Price: %b",
         super.toString(), licensed, insured, operable);
   }
   
   public boolean getLicensed()
   {
      return licensed;
   }

   public boolean getInsured() 
   {
      return insured;
   }

   public boolean getOperable() 
   {
      return operable;
   }

   public void setLicensed(boolean licensed) 
   {
      this.licensed = licensed;
   }

   public void setInsured(boolean insured) 
   {
      this.insured = insured;
   }

    public void setOperable(boolean operable) 
   {
      this.operable = operable;
   }
}  
