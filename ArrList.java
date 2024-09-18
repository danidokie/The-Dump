public class ArrList<E> extends ArrListAdapter<E>
{
   private E[] data;
   private int size;
   private static final int DEFAULT_SIZE = 10;
   
   /* TODO: implement ArrList(), a constructor that constructs an ArrList with
            capacity for ten elements.*/
   public ArrList()
   {
      this(DEFAULT_SIZE);
   }
   
   /* TODO: implement ArrList(int initialCapacity) a constructor with one int 
            parameter that constructs an ArrList with capacity initialCapacity.*/
   @SuppressWarnings("unchecked")//gets rid of warning
   public ArrList(int initialCapacity)
   {
      data = (E[])new Object[initialCapacity]; //array is generic type
      size = 0;
   }
            
   /* TODO: implement boolean add(E element) method
            add element to the end of the ArrList, possibly extending the 
            ArrList. */
   @SuppressWarnings("unchecked")
   public boolean add(E element)
   {
      if(size >= data.length)
      {
         //Case not enough room in array
         E[] newArray;
         newArray = (E[])new Object[2 * data.length];
         for(int i = 0; i < data.length; i++)
         {
           newArray[i] = data[i];
         }
         data = newArray;
       }
       data[size] = element;
       size++;
       return true;
   }
   
   /* TODO: implement void add(int index, E element) method
            insert element in the ArrList at the given index, moving existing 
            elements to the right 
            Throws IndexOutofBoundsException if the index is out of range.*/
   public void add(int index, E element)
   {
      if(index < 0 || index > size)
      {
         throw new IndexOutofBoundsException();
      }
      
      add(element);
      for(int i = size -1; i > index; i--)
      {
         data[i] = data[i - 1];   
      }
      data[index] = element;
   }
            
   // TODO: implement int size() method returing the size of the ArrList.
   
   /* TODO: implement E get(int index) method, returns element at index 
            
            Throws IndexOutofBoundsException if the index is out of range.*/
   
   /* TODO: implement E set(int index, E element) method, replace the existing
            value at index with element, return the old value. 
            
            Throws IndexOutofBoundsException if the index is out of range.*/
   
   /* TODO: implement int indexOf(Object o) method, return the index of the 
            first occurrence of o in the ArrList, or -1 if the ArrList does
            not contain the element. */
   
   /* TODO: implement boolean contains(Object o) method, return true of the list
            contains the element. */
   
   /* TODO: implement E remove(int index) method, remove the element at the 
            the specified index. 
            
            Throws IndexOutofBoundsException if the index is out of range.*/
   
   /* TODO: implement boolean remove(Object o) method, remove the first occurrence of 
            the specified element. */
}