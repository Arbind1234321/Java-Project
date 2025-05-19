package java8;

import java.util.ArrayList;

public class Employee {
	int id;
	String name;

	public Employee(String name, int id) {
		this.id = id;
		this.name = name;
	}

	public String toString() {
		return id + ":" + name;
	}
	
	
public static void main(String[] args) {
	Employee e1=new Employee("ar", 20);
	Employee e2=new Employee("ar", 25);
	Employee e3=new Employee("ar", 27);
	
ArrayList<Employee> l=new ArrayList<>();
  l.add(e3);
  l.add(e2);
  l.add(e1);
	
  int sum=0;
  for(Employee t:l)
  {
	  sum =sum+t.id;
  }
  double  avg=sum/3;
  System.out.println(avg);
}

	
		
	
}
