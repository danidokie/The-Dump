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
      myList.add("f");
      //myList.add(85, "g");
      System.out.println(myList.size());
      System.out.println(myList.get(2));
      System.out.println(myList.get(0));
      System.out.println(myList.get(4));
      //System.out.println(myList.get(5));
      //System.out.println(myList.get(-1));
      System.out.println(myList.set(0, "g"));
      System.out.println(myList.set(4, "h"));
      //System.out.println(myList.set(-1, "w"));
      //System.out.println(myList.set(5, "x"));
      System.out.println(myList.indexOf("g"));
      System.out.println(myList.indexOf("h"));
      System.out.println(myList.indexOf("i"));
      System.out.println(myList.indexOf("d"));
      System.out.println(myList.contains("e"));
      System.out.println(myList.contains("a"));
      System.out.println(myList.remove(2));
      System.out.println(myList.add("z"));
      System.out.println(myList.remove("c"));
      System.out.println(myList.remove("a"));
   }
}