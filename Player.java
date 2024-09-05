public abstract class Player
{
   private String name;
   private int xp;
   
   public Player(String name, int xp)
   {
      this.name = name;
      this.xp = xp;
   }
   public abstract double getMeleeDamageModifier();
   
   @Override
   public String toString()
   {
      return String.format("Name: %s, XP: %d", name, xp);
   }
   
   public String getName()
   {
      return name;
   }
   
   public void setName(String name)
   {
      this.name = name;
   }
   
   public int getXp()
   {
      return xp;
   }
   
   public void setXp(int xp)
   {
      this.xp = xp;
   }
}