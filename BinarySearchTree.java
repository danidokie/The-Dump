public class BinarySearchTree<E extends Comparable<? super E>>
{
   private TNode<E> root;
   
   private static class TNode<E>
   {
      private E element;
      private TNode<E> left;
      private TNode<E> right;
   }
   
   public BinarySearchTree()
   {
      root = null;
   }
   
   public boolean search(E element)
   {
      if(isEmpty())
      {
         return false;
      }
      TNode<E> currentNode = root;
      while(currentNode != null)
      {
         if(element.compareTo(currentNode.element) < 0)
         {
            currentNode = currentNode.left;
         }
         else if(element.compareTo(currentNode.element) > 0)
         {
            currentNode = currentNode.right;
         }
         else
         {
            return true;
         }
      }
      return false;
   }
   
   public void insert(E element)
   {
      if(isEmpty())
      {
         root = new TNode<E>();
         root.element = element;
         return;
      }
      
      TNode<E> newNode = new TNode<E>();
      newNode.element = element;
      TNode<E> currentNode = root;
      TNode<E> previousNode = null;
      
      while(currentNode != null)
      {
         if(element.compareTo(currentNode.element) < 0)
         {
            previousNode = currentNode;
            currentNode = currentNode.left;
         }
         else if(element.compareTo(currentNode.element) > 0)
         {
            previousNode = currentNode;
            currentNode = currentNode.right;
         }
         else
         {
            System.out.println("No dups!");
            return;
         }
      }
      
      if(element.compareTo(previousNode.element) < 0)
      {
         previousNode.left = newNode;
      }
      else
      {
         previousNode.right = newNode;
      }
   }
   
   //delete later
   public E findMinElement()
   {
      return minElement(root).element;
   }
   
   private TNode<E> minElement(TNode<E> node)
   {
      if(node == null)
      {
         return null; 
      }
      if(node.left == null)
      {
         return node;
      }
      return minElement(node.left);
   }
   
   public void delete(E target)
   {
      root = delete(root, target);
   }

   private TNode<E> delete(TNode<E> node, E target)
   {
      if(node == null)
      {
         return null;
      }
      if(target.compareTo(node.element) < 0)
      {
         node.left = delete(node.left, target);
      }
      else if(target.compareTo(node.element) < 0)
      {
         node.right = delete(node.right, target);
      }
      else
      {
         if(node.right == null)
         {
            return node.left;
         }
         TNode<E> temp = node;
         node = minElement(node.right);
         node.right = deleteMinNode(temp.right);
         node.left = temp.left; 
      }
      return node;
   } 
   
   //delete later
   public void testDeleteMinNode()
   {
      root = deleteMinNode(root);   
   }
   
   private TNode<E> deleteMinNode(TNode<E> node)
   {
      if(node.left == null)
      {
         return node.right;
      }
      node.left = deleteMinNode(node.left);
      return node;
   }
   
   public boolean isEmpty()
   {
      return root == null;
   }
}