public class PizzaTest
{
   public static void main(String[] args)
   {
      Pizza[] pizzas = {new Pizza("cheese", 10.0),
         new Pizza("pepperoni", 12.0),
         new DeliveryPizza("supreme", 16.0,"650 College Dr."),
         new DeliveryPizza("veggie", 14.0, "22 Main St.")};
         
      for(Pizza pizza : pizzas)
      {
         System.out.println(pizza);
      } 
   }    
} 