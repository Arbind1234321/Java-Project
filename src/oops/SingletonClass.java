package oops;

import java.util.Set;

public class SingletonClass {
	//Approach 1
//	//creating single object
//	private static SingletonClass t=new SingletonClass();
//	//constructor 
//	private SingletonClass()
//	{
//		
//	}
//	//factory method
//	public static SingletonClass getSingletonClass()
//	{
//		return t;
//	}

	
	//Approach 2
	private static SingletonClass t=null;
	
	private SingletonClass()
	{
		
	}
	
	public static SingletonClass getSingletonClass()
	{
		if(t==null)
		{
			t=new SingletonClass();
		}
		return t;
	}

	public static void main(String[] args) {
	SingletonClass s=SingletonClass.getSingletonClass();
	SingletonClass s1=SingletonClass.getSingletonClass();
	System.out.println(s.hashCode());
	System.out.println(s1.hashCode());
	//String str="naa";
 
	}

}
