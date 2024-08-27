public class TestDog
{
   public static void main(String[] args)
   {
      Dog[] dogs = {new Dog("Fluffy", "brown", 2021),
                    new Dog("Fido", "black", 2020),
                    new PoliceDog("Zeuz", "black and tan", 2022),
                    new PoliceDog("King", "brindle", 2019)};
      for(Dog dog: dogs)
      {
         System.out.println(dog);
      }
    }
}
                    
                 