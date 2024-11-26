package Collecions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Test1 {

	public static void main(String[] args) {
		//ArrayList list = new ArrayList<>();
		// LinkedHashSet list=new LinkedHashSet<>();
		List list=new LinkedList<>();
		list.add("A");
		list.add("B");
		list.add(1);
		list.remove(1);
	
		// list.add(null);
		// Collections.sort(list);
	  // System.out.println(list.get(2));
		System.out.println(list);
//		ListIterator a = list.listIterator();
//		while (a.hasPrevious())
//
//		{
//			System.out.println(a.previous());
//		}

	}

}
