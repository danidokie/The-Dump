public class Person implements Comparable<Person>
{
   private String name;
   private int age;
   
   public Person(String name, int age)
   {
      this.name = name;
      this.age = age;
   }
   
   public int compareTo(Person o)//o = other
   {
      if(age == o.getAge())//if ages are the same
      {
         return name.compareTo(o.getName());//compare names
      }
      else
      {
         return age - o.getAge();//otherwise compare ages 
      }
   }
   
   @Override
   public String toString()
   {
      return String.format("Name: %s, Age: %d", name, age);
   }
   
   public String getName()
   {
      return name;
   }
   
   public void setName()
   {
      this.name = name;
   }
   
   public int getAge()
   {
      return age;
   }
   
   public void setAge()
   {
      this.age = age;
   }
}