import java.util.concurrent.ThreadLocalRandom;

public class TestBST
{
   public static void main(String[] args)
   {
      BinarySearchTree<Integer> tree = new BinarySearchTree<>();
      for(int i = 0; i < 20; i++)
      {
         Integer newInt = ThreadLocalRandom.current().nextInt(1, 101);
         tree.insert(newInt);
      }
      
      for(int i = 0; i < 20; i++)
      {
         Integer searchInt = ThreadLocalRandom.current().nextInt(1, 101);
         System.out.println(tree.search(searchInt));
      }
      
      System.out.println(tree.findMinElement());
      tree.testDeleteMinNode();
      
      BinarySearchTree<Integer> tree0 = new BinarySearchTree<>();
      tree0.insert(52);
      tree0.insert(91);
      tree0.insert(12);
      tree0.insert(15);
      tree0.insert(87);
      tree0.insert(7);
      tree0.insert(26);
      tree0.insert(9);
      tree0.insert(2);
      tree0.insert(33);
      
      tree0.delete(8);
      tree0.delete(2);
      tree0.delete(26);
      tree0.delete(7);
      tree0.delete(12);
      tree0.delete(52);
      tree0.delete(33);   
   }
}