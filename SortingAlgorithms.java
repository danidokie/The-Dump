import java.util.concurrent.ThreadLocalRandom;
import java.util.Arrays;

public class SortingAlgorithms
{
   public static void main(String[] args)
   {
      int length1 = ThreadLocalRandom.current().nextInt(5, 11);
      int length2 = ThreadLocalRandom.current().nextInt(5, 11);
      Integer[] numbers = new Integer[length1];
      String[] letters = new String[length2];
      
      for(int i = 0; i < numbers.length; i++);
      {
         numbers[i] = ThreadLocalRandom.current().nextInt(1, 101);
      }
      
      for(int i = 0; i < letters.length; i++)
      {
         letters[i] = "" + (char)ThreadLocalRandom.current().nextInt(97, 123);
      }
      
      System.out.println(Arrays.toString(numbers));
      System.out.println(Arrays.toString(letters));
      
      //bubbleSort(numbers);
      //bubbleSort(letters);
      //insertionSort(numbers);
      //insertionSort(letters);
      selectionSort(numbers);
      selectionSort(letters);
      
      System.out.println(Arrays.toString(numbers));
      System.out.println(Arrays.toString(letters));
   }
   
   public static <E extends Comparable<E>> void selectionSort(E[] array)
   {
      for(int i = 0; i < array.length; i++)
      {  
         int bigIndex = 0;
         
         for(int j = 1; j < array.length - i; j++)
         {
            if(less(array[bigIndex], array[j]))
            {
               bigIndex = j;
            }
         }
         swap(array, bigIndex, array.length - i - 1);
      }
   }
   
   public static <E extends Comparable<E>> void insertionSort(E[] array)
   {
      for(int i = 1; i < array.length; i++)
      {
         for(int j = i; j > 0 && less(array[j], array[j - 1]); j--)
         {
            swap(array, j, j - 1);
         }
      }
   }
   
   public static <E extends Comparable<E>> void bubbleSort(E[] array)
   {
      for(int i = 0; i < array.length; i++)
      {
         for(int j = 1; j < array.length - i; j++)
         {
            if(less(array[j], array[j - 1]))             
            {
               swap(array, j, j - 1);
            }
         }
      }
   }
   
   private static <E> void swap(E[] array, int i, int j)
   {
      E temp = array[j];
      array[j] = array[j - 1];
      array[j - 1] = temp;
   }
   private static <E extends Comparable<E>> boolean less(E v, E w)
   {
      return v.compareTo(w) < 0;
   } 
}

