package Collecions;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

class mycomparator implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		String s1=o1.toString();
		String s2=o2.toString();
		
		return -s2.compareTo(s1);
	}
	
}

public class PriorityQue {

	public static void main(String[] args) {
		PriorityQueue p=new PriorityQueue (15,new mycomparator());
		p.add("A");
		p.add("C");
		p.add("G");
		p.add("K");
		p.add("F");
		p.add("D");
//		ArrayList l=new ArrayList(p);
//		Collections.sort(l);
		
		System.out.println(p);
		

	}

}
