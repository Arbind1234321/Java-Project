package Collecions;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) 
	{
	    List l=new ArrayList<>();
	    l.add("A");
	    l.add("B");
	    System.out.println(l);
	    l.set(1, "c");
	    System.out.println(l);
	    l.remove("A");
	    System.out.println(l);
	    System.out.println(l.indexOf("c"));

	}

}
