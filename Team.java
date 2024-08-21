public abstract class Team
{
   protected String name;
   protected int number;
   
   public abstract String display();
   
   public Team(String name, int number)
   {
      this.name = name;
      this.number = number;
   }
   
   @Override
   public String toString()
   {
      return String.format("Name: %s, Number: $d", 
         name, number);
   }
}
   