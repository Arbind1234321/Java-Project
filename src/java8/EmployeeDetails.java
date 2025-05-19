package java8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class EmployeeDetails {
	String name;
	  int id;
	public  EmployeeDetails(String name,int id)
	{
		this.name=name;
		this.id=id;
	}
	
	  public String toString() {
		 return this.name+"  "+this.id;  
	  }

	public static void main(String[] args) {
		EmployeeDetails e0=new EmployeeDetails("Arbind", 102);
		EmployeeDetails e1=new EmployeeDetails("Rahul", 100);
		EmployeeDetails e2=new EmployeeDetails("Sukesh", 104);
		EmployeeDetails e3=new EmployeeDetails("Prabhu", 101);
		ArrayList<EmployeeDetails> l=new ArrayList<>();
		l.add(e0);
		l.add(e1);
		l.add(e2);
		l.add(e3);
	
	
	System.out.println(l);
//	Comparator<EmployeeDetails> c=(e,d)->(e.id<d.id)?-1:(e.id>d.id)?1:0;
//	Collections.sort(l,c);
//	//Collections.sort(l, (e,d)->(e.id<d.id)?-1:(e.id>d.id)?1:0);
//	//Collections.sort(l, (e,d)->e.id<d.id?-1:e.id>d.id?1:0);
//	//Collections.sort(l,(e,d)->(d.name).compareTo(e.name));
//	System.out.println(l);
//	System.out.println(l.get(1).name);
//	for(EmployeeDetails p:l)
//	{
//		if(p.id==100)
//		System.out.println(p.name);
//	}
		

	}

}
