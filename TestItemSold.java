import java.util.ArrayList;

public class TestItemSold
{
   public static void main(String[] args)
   {
      ArrayList<ItemSold> items = new ArrayList<>();
      items.add(new ItemSold("Brass Monkey,", 1, 5.67));
      items.add(new ItemSold("Pez Dispenser,", 2, 7.83));
      items.add(new CarSold("Jaguar,", 3, 22432, false, false, true));
      items.add(new CarSold("Yugo,", 4, 5467, true, true, false));
      
      for(ItemSold item: items)
      {
         System.out.println(item);
      }
   }
}