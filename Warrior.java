public class Warrior extends Player implements Ninja
{
   private int twoHandedBonus;
   
   public Warrior(String name, int xp, int twoHandedBonus)
   {
      super(name, xp);
      this.twoHandedBonus = twoHandedBonus;
   }
   
   public double getMeleeDamageModifier()
   {
      return 1.5;
   }
   
   public boolean hideShadows()
   {
      return false; 
   }
   
   public int getTwoHandedBonus()
   {
      return twoHandedBonus;
   }
   
   public void setTwoHandedBonus(int twoHandedBonus)
   {
      this.twoHandedBonus = twoHandedBonus;
   }
   
   @Override
   public String toString()
   {
      return String.format("%s Two-Handed Bonus: %d",
         super.toString(), twoHandedBonus);
   }
}