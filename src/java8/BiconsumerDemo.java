package java8;

import java.util.ArrayList;
import java.util.function.BiConsumer;

class Worker{
	String name;
	double salary;
   public Worker(String name,double salary)
   {
	   this.name=name;
	   this.salary=salary;
   }
}
public class BiconsumerDemo {
	public static void main(String[] args) {
		ArrayList<Worker> l=new ArrayList<>();
		populate(l);
		BiConsumer<Worker, Double> c=(e,d)->e.salary=e.salary+d;
		for(Worker d: l)
		{
			if(d.salary>=3000)
			c.accept(d, 300.00);
			else {
				c.accept(d, 500.00);
			}
		}
		for(Worker e:l)
		{
			System.out.println(e.name+"   "+e.salary);
		}
	}
public static void populate(ArrayList<Worker> l)
{
	l.add(new Worker("Arbind", 1000));
	l.add(new Worker("Sonu", 4500));
	l.add(new Worker("Monu", 3000));
	l.add(new Worker("Ronu", 5000));
}

}
