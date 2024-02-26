package Collecions;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteraorDemo {

	public static void main(String[] args) {
	  LinkedList l=new LinkedList();
	  l.add("Arbind");
	  l.add("ram");
	  l.add("sham");
	  l.add("nag");
	  System.out.println(l);
	  
	 /* ListIterator itr=l.listIterator();
	  while(itr.hasNext())
	  {
		  String str=(String)itr.next();
		  if(str.equals("ram"))
		  {
			  itr.remove();
		  }
		  else if(str.equals("nag"))
		  {
			  itr.add("Bp");
		  }
		  else if(str.equals("sham"))
		  {
			  itr.set("Tv");
		  }
	  }
	  System.out.println(l);*/
	  //traversing backward direction
	  ListIterator itr=l.listIterator(l.size());//mention cursor location 
	   while(itr.hasPrevious())
	   {
		   System.out.println(itr.previous());
	   }
	  

	}

}
