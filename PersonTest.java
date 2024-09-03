import java.util.Arrays;

public class PersonTest
{
   public static void main(String[] args)
   {
      Person[] people = {new Person("Zed", 22), new Person("Alan", 14), 
         new Person("Yolanda", 22), new Person("Barbara", 73),
         new Person("Xavier", 14), new Person("Carlos", 43)};
         
      Arrays.sort(people);
      System.out.println(Arrays.toString(people));
   }
}