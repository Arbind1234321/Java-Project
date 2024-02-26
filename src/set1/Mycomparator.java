package set1;

import java.util.Comparator;

public class Mycomparator implements Comparator {

	@Override
	public int compare(Object obj1, Object obj2) {
	
		 String s1= obj1.toString();
		 String s2=obj2.toString();
		 
		//return -s1.compareTo(s2);
		return s2.compareTo(s1);
	}

}
