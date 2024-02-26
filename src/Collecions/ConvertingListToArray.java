package Collecions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

//Write a programe  to convert collection to Arrays
public class ConvertingListToArray {

	public static void main(String[] args) {
    /* List<String> list=	new ArrayList<String>();
     list.add("My");
     list.add("name");
     list.add("is");
     list.add("Arbind");
     System.out.println(list);
     //Iterator<String> iterator = list.iterator();
     ListIterator<String > itr=list.listIterator();
//     while(iterator.hasNext())
//     {
//    	 
//    	 System.out.println(iterator.next());
//    	 
//     }
     while(itr.hasPrevious())
     {
    	 
    	 System.out.println(" "+itr.previous());
    	 
     }
     
//     //Converting list to Array
//     String [] str=list.toArray(new String[0]);
//      // Object obj=list.toArray();
//
//     for(int i=0;i<str.length;i++)
//     {
//    	 System.out.print(str[i]+"  ");
//     }
//     
//    // System.out.println(str.length);
//
 * 
 */
		List<String>  li = new ArrayList<>();  
        ListIterator<String> itr = null;  
        li.add("Java");  
        li.add("is");  
//        li.add("a");  
//        li.add("platform");  
//        li.add("independent");  
//        li.add("language");  
        itr = li.listIterator();  
        System.out.println("The given string in actual order :");  
        while (itr.hasNext()) {  
              System.out.println(itr.next());  
          }  
        System.out.println("The given string in reverse order :");  
          
        while (itr.hasPrevious()) {  
              System.out.println(""+itr.previous());  
       }  
	}

}
