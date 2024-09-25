import java.util.List;

public class TestLinkdList
{
   public static void main(String[] args)
   {
      List<String> words = new LinkdList<>();
      words.add("a");
      words.add("b");
      words.add("c");
      words.add("d");
      words.add(2, "e");
      words.add(4, "f");
      words.add(0, "g");
      System.out.println(words.size());
      System.out.println(words.get(0));
      System.out.println(words.get(6));
      System.out.println(words.get(4));
      words.set(0, "h");
      words.set(6, "i");
      words.set(3, "j");
      System.out.println(words.indexOf("a"));
      System.out.println(words.indexOf("c"));
      System.out.println(words.indexOf("h"));
      System.out.println(words.indexOf("i"));
      System.out.println(words.indexOf("d"));
      System.out.println(words.contains("d"));
      System.out.println(words.contains("i"));
      words.remove(0);
      words.remove(5);
      words.remove(1);
      words.remove("a");
      words.remove("j");
      words.remove("f");
      words.remove("a");
      
      //List<Integer> numbers = new LinkdList<>();
      //numbers.add(45);
   }
}