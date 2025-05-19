package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;
class Employeee{
	
	String name;
	int salary;
	public Employeee(String n,int s) {
		this .name=n;
		this.salary=s;
	}
	public String toString ()
	{
		return this.name+"  "+this.salary;
	}
}

public class PredicateDemo {
	

	public static void main(String[] args) {
	//check number is odd or even
	//	Predicate<Integer> p=i->i%2==0;
	//	System.out.println(p.test(13));
		
	////	Check length of string 
//		String []s= {"arbind","abc","kdjdjdkkd","sgf","hfhf"};
//		Predicate<String> p=i->i.charAt(0)=='a';
//		for(String s1:s)
//		{
//			if(p.test(s1))
//			{
//				System.out.println(s1);  
//			}
//		}
		
//		ArrayList<Employeee> l=new ArrayList<>();
//		l.add(new Employeee("Arbind", 10000));
//		l.add(new Employeee("kumar",  50000));
//		l.add(new Employeee("Suresh", 1000));
//		l.add(new Employeee("Mahesh", 14000));
//		l.add(new Employeee("Bhupesh", 16000));
//		l.add(new Employeee("Sukesh", 20000));
//		System.out.println(l);
//		Collections.sort(l, (e,d)->(e.salary<d.salary)?-1:(e.salary>d.salary)?1:0);
//		
//		System.err.println(l);
//		Collections.sort(l,(e,d)->e.name.compareTo(d.name));
//		System.out.println(l);
//		Predicate<Employeee> p=e->e.salary>14000 && e.name=="Sukesh";
//		for(Employeee a:l)
//		{
//			if(p.test(a))
//			{
//				System.out.println(a.name+ " :  "+a.salary);
//			}
//		}
		//===============
		int []a= {0,5,10,20,35,50,55};
		Predicate<Integer> p1=i->i%2==0;
		Predicate<Integer> p2=i->i>20;
		for(int x:a)
			
		{
			//if(p1.and(p2).test(x))
			//if(p1.or(p2).test(x))
			if(p1.negate().test(x))//for opposite
			{
				System.out.println(x);
			}
		}
	}
}









