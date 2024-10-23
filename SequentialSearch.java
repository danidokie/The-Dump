public class SequentialSearch
{
   public static void main(String[] args)
   {
      String[] words = {"c", "r", "q", "a", "y", "p", "n", "y", "z", "k"};
      System.out.println(sequentialSearch(words, "x"));
      System.out.println(sequentialSearch(words, "w"));
      System.out.println(sequentialSearch(words, "p"));
      System.out.println(sequentialSearch(words, "k"));
      System.out.println(sequentialSearch(words, "c"));
      System.out.println(sequentialSearch(words, "d"));
   }
   
   public static <E> int sequentialSearch(E[] array, E target)
   {
      for(int i = 0; i < array.length; i++)
      {
         if(array[i].equals(target))
         {
            return i;
         }
      }
      return -1;
   }
}