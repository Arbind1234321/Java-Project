package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EmployeeTest implements Comparator {
	@Override
	public int compare(Object o1, Object o2) {

		Employee e1 = (Employee) o1;
		Employee e2 = (Employee) o2;
		//for String Comparison   
//		String  I1 = e1.name;
//		String I2 = e2.name;
//		return I1.compareTo(I2);
		//for id Comparison
		int I1=e1.id;
		int I2=e2.id;
		if(I1<I2)
		{
			return -1;
		}
		else if(I1<I2)
		{
			return 1;
		}
		else
		{
			return 0;
		}
		
	}
	public static void main(String[] args)
	{
	  ArrayList<Employee> e=new ArrayList<Employee>();
	  e.add(new Employee("Arbind",15336));
	  e.add(new Employee("vinit",54833));
	  e.add(new Employee("Arbindk",99666));
	  e.add(new Employee("parvati",72055));
	  System.out.println(e);
	  //for  id Comparison
	 // Collections.sort(e, (e1,e2)->e1.id<e2.id?-1:e1.id>e2.id?1:0);
	  //name Comparison 
	  Collections.sort(e, (e1,e2)->e1.name.compareTo(e2.name));
	 // Collections.sort(e,new EmployeeTest());
	  System.out.println(e);
	
	 

	}

}
