import java.util.ArrayList;
import java.util.List;

public class TestPlayer
{
   public static void main(String[] args)
   {
      ArrayList<Ninja> ninjas = new ArrayList<>(
         List.of(new Mage("Alice", 234234),
            new Mage("Bob", 2342),
            new Warrior("Carlos", 0, 2),
            new Warrior("Diane", 4523, 28)));
            
      //ninjas.add(new Warrior("Name", ##, ##));
      
      for(Ninja ninja: ninjas)
      {
         System.out.println(ninja);
         System.out.println(((Player)ninja).getMeleeDamageModifier());
         System.out.println(ninja.hideShadows());
      }
   }
}