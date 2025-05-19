package java8;

import java.util.ArrayList;
import java.util.function.BiFunction;

class Emplo{
	String name ;
	int id;
	public Emplo(String name,int id) {
		this.name=name;
		this.id=id;
	}
	
}
public class BiFunctionDemo {
	public static void main(String[] args) {
		BiFunction<String, Integer, Emplo> f=(name,id)->new Emplo(name,id);
		Emplo e1=f.apply("arbind", 100);
		System.out.println(e1.name);
		ArrayList<Emplo> l=new ArrayList<>();
		l.add(f.apply("arbind", 100));
		l.add(f.apply("sonu", 200));
		l.add(f.apply("monu", 300));
		System.out.println(l);
		for(Emplo e:l)
		{
			System.out.println(e.id+"---- "+e.name);
		}
	}

}
