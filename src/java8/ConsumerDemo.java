package java8;

import java.util.Scanner;
import java.util.function.Supplier;

class Movie{
	String name;
	int price;
	public Movie(String name)
	{
		this.name=name;
	}
	public void disply()
	{
		System.out.println(this.name+" "+this .price);
	}
}

public class ConsumerDemo {
	
	public static void main(String[] args) {
		Movie m=new Movie("Ram");
		
		Supplier<String> c=()->{
			String otp="";
			for(int i=0;i<6;i++)
			{
				otp=otp+(int)(Math.random()*10);
			}
			return otp;
		};
		String a=c.get();
		System.out.println(a);
		System.out.println("Enter otp");
		Scanner sc=new Scanner(System.in);
		if(a.endsWith(sc.next()))
		{
			m.disply();
		}
		else {
			System.out.println("opt not match");
		}
	}


}
