public class PoliceDog extends Dog
{
   private String pd;
   
   public PoliceDog(String name, String color, int birthYear, String pd)
   {
      super(name, color, birthYear);
      this.pd = pd;
   }
   
   @Override
   public String toString()
   {
      return String.format("%s Department: %s",
         super.toString(), pd);
   }
   
   public String getPd()
   {
      return pd;
   }
   
   public void setPd(String pd)
   {
      this.pd = pd;
   }
}