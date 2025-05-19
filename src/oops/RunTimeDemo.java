package oops;

public class RunTimeDemo {

	public static void main(String[] args) {
		Owner obj1=new Owner();
		obj1.mail();
		Owner obj2=new Tenant1();
		obj2.mail();
		Owner obj3=new Tenant2();
		obj3.mail();
		int n=15;
		int count=0;
		while(n>0 &&n>=7)
		{
			n=n-7;
			count++; 
		}
		System.out.println(count);
		System.out.println(n);
	}

}
