public class LinkdList<E> extends LinkdListAdapter<E>
{
   private class Node
   {
      private E element;
      private Node next;
      
      public Node(E element)
      {
         this.element = element;
         this.next = null;
      }
      
      @Override
      public String toString()
      {
         return String.format("Node: %s", element.toString());
      }
   }
   
   private Node head;
   private int size;
   
   /* TODO: implement LinkdList(), a constructor that constructs an LinkdList with
            null head and size 0.*/
   public LinkdList()
   {
      head = null;
      size = 0;
   }
            
   /* TODO: implement boolean add(E element) method
            add element to the end of the list, possibly extending the 
            list. */
   public boolean add(E element)
   {
      if(head == null) //or size == 0
      {
         head = new Node(element);
      }
      else
      {
         Node lastNode = head;
         while(lastNode.next != null)
         {
            lastNode = lastNode.next;
         }
         lastNode.next = new Node(element);
      }
      size++;
      return true;
   }
   
   /* TODO: implement void add(int index, E element) method
            insert element in the list at the given index, moving existing 
            elements to the right */
   public void add(int index, E element)
   {
      Node newNode = new Node(element);
      if(index == 0)
      {
         newNode.next = head;
         head = newNode;
      }
      else
      {
         Node previousNode = getNode(index - 1);
         newNode.next = previousNode.next;
         previousNode.next = newNode;
      }
      size++;
   }
   
   private Node getNode(int index)
   {
      if(index < 0 || index >= size)
      {
         throw new IndexOutOfBoundsException();
      }
      
      Node node = head; 
      for(int i = 0; i < index; i++)
      {
         node = node.next;
      }
      return node;
   }
            
   // TODO: implement int size() method returing the size of the list.
   public int size()
   {
      return size;
   }

   // TODO: implement E get(int index) method, returns element at index.
   public E get(int index)
   {
      return getNode(index).element;
   }
   
   /* TODO: implement E set(int index, E element) method, replace the existing
            value at index with element, return the old value */
   public E set(int index, E element)
   {
      Node node = getNode(index);
      E oldValue = node.element;
      node.element = element;
      return oldValue;
   }
   
   /* TODO: implement int indexOf(Object o) method, return the index of the 
            first occurrence of o in the list, or -1 if the list does
            not contain the element. */
   public int indexOf(Object o)
   {
      Node node = head;
      for(int i = 0; i < size; i++)
      {
         if(node.element.equals(o))
         {
            return i;
         }
         node = node.next;
      }
      return -1;
   }
   
   /* TODO: implement boolean contains(Object o) method, return true of the list
            contains the element. */
   public boolean contains(Object o)
   {
      return indexOf(o) != -1;
   }
   
   /* TODO: implement E remove(int index) method, remove the element at the 
            the specified index. */
   public E remove(int index)
   {
      E oldValue = get(index);
      if(index == 0)
      {
         head = head.next;
      }
      else
      {
         Node node = getNode(index -1);
         node.next = node.next.next;
      }
      size --;
      return oldValue;
   }
   
   /* TODO: implement boolean remove(Object o) method, remove the first occurrence of 
            the specified element, */
   public boolean remove(Object o)
   {
      int index = indexOf(o);
      if(index == -1)
      {
         return false;
      }
      remove(index);
      return true;
   }
}