import java.util.*;  
public class LinkedList4{  
 public static void main(String args[]){  
  
  LinkedList<String> ll=new LinkedList<String>();  
           ll.add("Rabi");  
           ll.add("Vijay");  
           ll.add("Anki");  
           //Traversing the list of elements in reverse order  
           Iterator i=ll.descendingIterator();  
           while(i.hasNext())  
           {  
               System.out.println(i.next());  
           }  
             
 }  
}  
