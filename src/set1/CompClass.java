package set1;

import java.util.TreeSet;

public class CompClass {

	public static void main(String[] args) {
		
		Employee e1=new Employee(30, "Arbind");
		Employee e2=new Employee(1, "Kumar");
		Employee e3=new Employee(20, "Sona");
		Employee e4=new Employee(50, "Rg");
		Employee e5=new Employee(100, "AA");
		//TreeSet t=new TreeSet(new Mycomparator());//for customize sorting
		TreeSet t=new TreeSet();//Default sorting order
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		t.add(e5);
		System.out.println(t);
		
	}

}
