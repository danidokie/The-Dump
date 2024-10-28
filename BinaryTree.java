public class BinaryTree<E>
{
   private TNode<E> root;
   
   private static class TNode<E>
   {
      private E element;
      private TNode<E> left;
      private TNode<E> right;
   }
   
   public BinaryTree()
   {
      root = null;
   }
      
   public BinaryTree(E element)
   {
      root = new TNode<>();
      root.element = element;
   }
   
   public BinaryTree(E element, BinaryTree<E> left, BinaryTree<E> right)
   {
      this(element);
      root.left = left.root;
      root.right = right.root;
   }
   
   public boolean isEmpty()
   {
      return root == null;
   }

   public void postOrder()
   {
      MyStack<TNode<E>> stack = new MyStack<>();
      MyStack<Integer> marks = new MyStack<>();
      stack.push(root);
      marks.push(0);
      while(!stack.isEmpty())
      {
         if(marks.peek() == 0)
         {
            marks.pop();
            marks.push(1);
            TNode<E> currentNode = stack.peek();
            if(currentNode.right != null)
            {
               stack.push(currentNode.right);
               marks.push(0);
            }
            if(currentNode.left != null)
            {
               stack.push(currentNode.left);
               marks.push(0);
            }
       
         else
         {
            TNode<E> currentNode = stack.pop();
            System.out.print(currentNode.element + " ");
            marks.pop();
         }
   }
   
   public void preOrder()
   {
      MyStack<NTode<E>> stack = new MyStack<>();
      stack.push(root);
      while(stack.isEmpty())
      {
         TNode<E> currentNode = stack.pop();
         System.out.print(currentNode.element + " ");
         if(currentNode.right != null)
         {
            stack.push(currentNode.right);
         }
         if(currentNode.left != null)
         {
            stack.push(currentNode.left);
         }
      }
   }

   public void inOrder()
   {
      MyStack<TNode<E>> stack = new MyStack<>();
      TNode<E> currentNode = root;
      while(currentNode != null || !stack.isEmpty())
      {
         while(currentNode != null)
         {
            stack.push(currentNode);
            currentNode = currentNode.left;
         }
         currentNode = stack.pop();
         System.out.print(currentNode.element + " ");
         currentNode = currentNode.right;
      }
   }
   
   public void levelOrder()
   {
      MyQueue<TNode<E>> q = new MyQueue<>();
      q.add(root);
      while(!q.isEmpty())
      {
         TNode <E> currentNode = q.remove();
         System.out.print(currentNode.element + " ");
         if(currentNode.left != null)
         {
            q.add(currentNode.left);
         }
         if(currentNode.right != null)
         {
            q.add(currentNode.right);
         }
      }
   }
}