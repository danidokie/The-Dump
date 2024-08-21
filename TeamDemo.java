public class TeamDemo
{
   public static void main(String[] args)
   {
      Team[] teams = {
         new InternatioalTeam("USNT", 1, "USA", "English"),
         new InternationlTeam("PNT", 2, "Portugal", "Portuguese"),
         new ClubTeam("Chattanooga FC", 3, "Chattanooga"),
         new ClubTeam("Everton", 4, "Liverpool")};
         
      for(Team team: teams)
      {
         System.out.println(team);
         System.out.println(team.display());
      }
   }
}