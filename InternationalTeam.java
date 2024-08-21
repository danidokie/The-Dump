public class InternationalTeam extends Team
{
   private String country;
   private String language; 
   
   public InternationalTeam(String name, int number, String country, String language)
   {
      super(name, number);
      this.country = country;
      this.language = language;
   }
   
   public String display()
   {
      return String.format("This is the national team of %s.");
   }
   
   @Override
   public String toString()
   {
      return String.format("%s Country: %s, Language: %s",
         super.toString(), country, language);
   }
}
   