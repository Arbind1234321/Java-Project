package set1;
import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo2 {

	public static void main(String[] args) {
	  TreeSet t=new TreeSet(new Mycomp());
	  t.add("A");
	  t.add(new  StringBuffer("ABC"));
	  t.add(new  StringBuffer("AB"));
	  t.add("Xx");
	  t.add("ABCD");
	  t.add("A");
	  System.out.println(t);
	}

}

