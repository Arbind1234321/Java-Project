package set;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.TreeSet;

public class CompratorDemo {

	public static void main(String[] args) {
	TreeSet t=new TreeSet();
	t.add(10);
	t.add(0);
	t.add(20);
	t.add(10);
	t.add(5);
	System.out.println(t);
	List li=new ArrayList (t);
	ListIterator l=li.listIterator(li.size());
	while(l.hasPrevious())
	{
		System.out.println(l.previous());
	}

	}

}
