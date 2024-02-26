package set;

import java.util.TreeSet;

public class TreeSetDemo2 {

	public static void main(String[] args) {
		TreeSet<String> t=new TreeSet(new MyComparator());
		t.add("Deep");
		t.add("Arbind");
		t.add("Mota");
		t.add("Patla");
		t.add("E");
		t.add("C");
		System.out.println(t);

	}

}
