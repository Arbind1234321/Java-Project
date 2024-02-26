package set1;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet t=new TreeSet(new Mycomparator());
		t.add("Arbind");
		t.add("Kumar");
		t.add("Pawan");
		t.add("Eshan");
		t.add("Chndan");
		System.out.println(t);

	}

}
