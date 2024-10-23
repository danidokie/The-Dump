import java.util.Arrays;

public class BinarySearch
{
   public static void main(String[] args)
   {
      String[] words = {"c", "r", "q", "a", "y", "p", "n", "y", "z", "k"};
      Arrays.sort(words);
      System.out.println(Arrays.toString(words));
      System.out.println(binarySearch(words, "x"));
      System.out.println(binarySearch(words, "w"));
      System.out.println(binarySearch(words, "p"));
      System.out.println(binarySearch(words, "k"));
      System.out.println(binarySearch(words, "c"));
      System.out.println(binarySearch(words, "d"));
   }
   
   public static <E extends Comparable<E>> int binarySearch(E[] array, E target)
   {
      int low = 0;
      int high = array.length - 1;
      while(low <= high)
      {
         int mid = (low + high) / 2;
         if(array[mid].compareTo(target) == 0)
         {
            return mid;
         }
         else if(array[mid].compareTo(target) < 0)
         {
            low = mid + 1;
         }
         else
         {
            high = mid - 1;
         }  
      }
      return -1;
   }
}