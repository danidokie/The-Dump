public class TestPair
{
   public static void main(String[] args)
   {
      Pair<String, Double> pair1 = new Pair<>("alpha", 2.3);
      Pair<String, Double> pair2 = new Pair<>("bravo", 23.23);
      Pair<Person, Integer> pair3 = new Pair<>(new Person("Alice", 22), 14);
      System.out.println(pair1);
      System.out.println(pair2);
      System.out.println(pair3);
      System.out.println(pair3.getFirst().getName());
   }
}