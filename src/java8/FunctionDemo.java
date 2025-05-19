package java8;
 
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
class Student{
	String name;
	int marks;
	public Student(String name,int marks)
	{
		this.marks=marks;
		this.name=name;
	}
	public String toString()
	{
		return this.name+" : "+this.marks;
	}
}

public class FunctionDemo {

	public static void main(String[] args) {
		
//		//String t[]= {"arbind", "automatin", "india"};
//		String str="this is arbind kumar";
//		String t[]=str.split(" ");
//		System.out.println(t.length);
//		
//		
//		Function<String,String> f=s->s.substring(0, 1).toUpperCase()+s.substring(1).toLowerCase();
//		System.out.println(f.apply("arbind"));
//		for(String x:t)
//		{
//			System.out.println(f.apply(x));
//		}
		
		Function<Student, String> f=s->{
			int marks=s.marks;
			String grade="";
			if(s.marks>=80) grade ="A[Dist]";
			else if(s.marks>=60) grade="B[first]";
			else if(s.marks>=50) grade="C[second]";
			else if(s.marks>=60) grade="D[Third]";
			else grade="Failed";
			return grade;
			
		};
		Student s[]= {
				new Student("Arbind",95),
				new Student("Mukesh",65),
				new Student("shyam",45),
				new Student("sundar",36),
				new Student("madav",23)
				
		};
		Predicate<Student> p= t->t.marks>=60;
		System.out.println(Arrays.toString(s));
		//Collections.sort(s,(e,d)->);
		Arrays.sort(s, (e,d)->(e.marks<d.marks)?-1:(e.marks>d.marks)?1:0);
		System.out.println(Arrays.toString(s));
		Arrays.sort(s,(e,d)->e.name.compareTo(d.name));
		System.out.println(Arrays.toString(s));
		
		Consumer<Student> c=a->{
			System.out.println(a.name+"********* "+a.marks);
		};
		

		
        for(Student s1:s) {
        	if(s1.marks==65)
        	c.accept(s1);
        	//if(p.test(s1))
        	// System.out.println(s1.name+" "+s1.marks+" "+f.apply(s1));
        }
	}

}
