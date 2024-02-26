package Collecions;

import java.util.Arrays;
import java.util.LinkedList;

public class DemoLinkedList {

	public static void main(String[] args) {
		LinkedList<String> li=new LinkedList();
		li.add("Arbind");
		li.add("Kumar");
		li.add("10");
		li.add(null);
		li.add(null);
		li.add("10");
		System.out.println(li);
		li.set(1, "parvati");
		System.out.println(li);
		li.addFirst("love");
		li.removeLast();
		System.out.println(li);
		//Converting list to Array
//		 Object[] objectAarray = li.toArray();
//		 //find the length of array
//	      int length = objectAarray.length;;
//	      
//	      String [] stringArray = new String[length];
//	      for(int i =0; i < length; i++) {
//	         stringArray[i] = (String) objectAarray[i];
//	      }
//	      System.out.println("Contents of the array: \n"+Arrays.toString(stringArray));
		 String [] str=li.toArray(new String[0]);
//	      // Object obj=list.toArray();
	//
		 System.out.println("=================");
	     for(int i=0;i<str.length;i++)
	     {
	    	 System.out.print(str[i]+"  ");
	     }

	}

}
