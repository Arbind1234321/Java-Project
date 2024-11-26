package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class Test {
    private int id;
   private  String name;
    private String dept;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public Test(int id, String name, String dept) {
		this.id = id;
		this.name = name;
		this.dept = dept;
	}
    public String toString() {
    	 return id+" "+name+" "+dept;
    }
	public static void main(String[] args) {
		Test b1 = new Test(100,"Arbind","Test");
	    Test b2 = new Test(100,"Arbind","Test");
	    Test b3 = new Test(101,"Arbind","Test");
	    Test b4 = new Test(100,"Arbind","Test");
	    Test b5 = new Test(103,"Arbind","Test");
	    List<Test> list = new ArrayList();
	    list.add(b1);
	    list.add(b2);
	    list.add(b3);
	    list.add(b4);       
	    list.add(b5);
	    
	    //Removing Duplicates;
	    Set<Test> s= new HashSet<Test>();
	    s.addAll(list);         
	    list = new ArrayList<Test>();
	    list.addAll(s);        
	    //Now the List has only the 
	    System.out.println(list);
	  
   
	}

}
