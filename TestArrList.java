import java.util.List;

public class TestArrList
{
   public static void main(String[] args)
   {
      List<String> myList = new ArrList<>(4);
      myList.add("b");
      myList.add("c");
      myList.add("d");
      myList.add("e");
      myList.add(2, "g");
   }
}