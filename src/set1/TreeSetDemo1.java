package set1;

import java.util.TreeSet;

public class TreeSetDemo1
{
	public static void main(String[] args) {
		 TreeSet t=new TreeSet(new Mycomparator());
		 t.add(new StringBuffer("Cd"));
		 t.add(new StringBuffer("A"));
		 t.add(new StringBuffer("Z"));
		 System.out.println(t);
	}

      
}
