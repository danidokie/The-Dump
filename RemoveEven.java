import java.util.ArrayList;
import java.util.List;

public class RemoveEven
{
   public static void main(String[] args)
   {
      ArrayList<String> first = new ArrayList<>(List.of("four", "score", "and", "seven", "years", "ago"));
      
      ArrayList<String> second = new ArrayList<>(List.of("To", "be", "or", "not", "to", "be", "Hamlet"));
      
      System.out.println(removeEven(first));
      System.out.println(removeEven(second));
   }
   
   public static void printEveryOtherReverse(ArrayList<String> a)
   {
      for(int i = a.size() - 1; i > -2; i-=2)
      {
         System.out.println(a.get(i));
      }
      
   
   public static ArrayList<String> removeEven(ArrayList<String> words)
   {
      ArrayList<String> out = new ArrayList();
      for(String word: words)
      {
         if(word.length() % 2 != 0)
         {
            out.add(word);
         }
      }
      return out;
   }   

ARRAY PRACTICE QUESTION 6
public static void printEveryOtherReverse(ArrayList<String> a, ArrayList<String> b)
{
   ArrayList<String> out = ArrayList<>();
   for(int i = 0; i < a.size(); i++)
   {
      out.add(a.get(i));
      out.add(b.get(i));
   }
   return out;
}