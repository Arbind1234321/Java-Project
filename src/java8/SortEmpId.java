package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Consumer;

class Employe {
	int id;
	String name;

	Employe(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public String toString() {
		return name + ":" + id;
	}
}

public class SortEmpId {
	public static void main(String[] args) {
    ArrayList<Employe> l=new ArrayList<>();
    l.add(new Employe(101, "Biku"));
    l.add(new Employe(100, "piku"));
    l.add(new Employe(105, "miku"));
    l.add(new Employe(103, "titu"));
   // System.out.println(l);
   // Collections.sort(l, (e,d)->e.id<d.id?-1:e.id>d.id?1:0);
  //  Collections.sort(l,(e,d)->e.name.compareTo(d.name));
    //System.out.println(l)
// print id whose name is piku
   // l.stream().forEach(System.out::println);
    Consumer<Employe> c=i->{
    	System.out.println(i.name);
    };
   // l.stream().filter(e->e.id>=102).forEach( c);
	}
}
