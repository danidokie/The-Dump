public class FlexibleLadder extends Ladder
{
   private int articulations; 
   
   public FlexibleLadder(String color, int height, 
      articulations)
   {
      super(color, height);
      this.articulations = articulations;
   }
   
   public void setArticulations(int articulations)
   {
      this.articulations = articulations;
   }
   
   public int getArticulations()
   {
      return articulations;
   }
} 