package set;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.TreeSet;

public class Treedemo {

	public static void main(String[] args) {
		TreeSet t=new TreeSet();
		t.add("Vikash");
		t.add("arbind");
		t.add("Arbind");
		//t.add(new Integer(10));//RT :CCE
		System.out.println(t);
	/*	String [] str= {"Spa","Pare","Ar","Cyz"};
		for(int i=0;i<str.length;i++)
		{
			t.add(str[i]);
		}
		//System.out.println(t);
		 List li=new ArrayList(t); 
		 ListIterator l=li.listIterator(li.size());
//		 System.out.println(li);
//		 System.out.println(li.size());
		 
		Iterator itr=t.iterator();
		while(itr.hasNext())
		{
		System.out.println(itr.next());
		}
		System.out.println("++++++++");
		while(l.hasPrevious())
		{
		 System.out.println(l.previous());	
		}*/

	}

}
