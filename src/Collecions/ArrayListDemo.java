package Collecions;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;
/*
 * underline d.s is resizable array and growable array present in java.util package
 * Duplicate object is allowed
 * insertion order  is preserved.
 * Heterogeneous object are allowed
 * null insertion is possible
 * initial  capacity is 10;
 * implements serializable and clonable and random Access interface  
 * incremental  capacity is =(current capacity *3/2)+1
 * has 3 constructor{(),(intial capacity),(collection c)}
 * ArrayList l=New ArrayList()
 * ArrayList l=New ArrayList(int intial capacity )
 * ArrayList l=New ArrayList(collection c)
 * Arraylist is the best choice if our frequent operation is retrival because it omplements Randaom 
 * Access interface
 * Arraylist is worst choice if our operation is inserting deleting in middle
 *------------------------------------
 * Random Access: present in java .util.package
 * it doesnot contain any method
 * it is  a marker interface
 * */

public class ArrayListDemo {

	public static void main(String[] args)
	{
		
		
        //ArrayList<String> list=new ArrayList<>();
		//LinkedHashSet list=new LinkedHashSet<>();
		LinkedList<String> list=new LinkedList<>();
        list.add("A");//0
        list.add("B");
        list.add("c");//1
        list.add("d");
         list.add("e");
         list.add("f");//2
       // Collections.sort(list);
        System.out.println(list);
//        for(int i=0;i<list.size();i++)
//        {
//        	System.out.println(list.get(i));
//        }
//        for(String a:list)
//        {
//        	System.out.println(a);
//        }
//       
//       ListIterator a=list.listIterator();
//       
//       while (a.hasNext()) 
//
//        {       
//      
//    	System.out.println(a.next());
//    	
 //       }
        int n=list.size();
        
    for(int i=0;i<n;i++)
    {
    	System.out.println(list.remove(0));
    }
    System.out.println(list);
    
     
        
	}

}
