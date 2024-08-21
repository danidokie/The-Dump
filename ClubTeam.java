public class ClubTeam extends Team
{
   private String city; 
   
   public ClubTeam(String name, int number, String city)
   {
      super(name, number);
      this.city = city;
   }
   
   public String display()
   {
      return String.format("This team is located in %s.", 
         city);
   }
   
}