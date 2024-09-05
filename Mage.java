public class Mage extends Player implements Ninja
{
   private int spellBonus;
   
   public Mage(String name, int xp)
   {
      super(name, xp);
      this.spellBonus = spellBonus;
   }
   
   public int getSpellBonus()
   {
      return spellBonus;
   }
   
   public void setSpellBonus(int spellBonus)
   {
      this.spellBonus = spellBonus;
   }
  
   public double getMeleeDamageModifier()
   {
      return 0.25;
   }
   
   public boolean hideShadows()
   {
      return false;
   }
   
   @Override
   public String toString()
   {
      return String.format("%s Spell Bonus: %d", 
         super.toString(), spellBonus);
   }
}