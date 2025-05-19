package object;

import java.lang.reflect.Method;

public class Methods extends Object {

	public static void main(String[] args) {
		//Object o=new Object();
		String o=new String();
		Class c=o.getClass();
//		int [] value= new int[3];
//		boolean [] b=new boolean[2];
//		 public static native registerNative().//
//		System.out.println(c.getName());
		Method[] m=c.getDeclaredMethods();
		System.out.println("Methods informations");
        int count =0;
		for(Method m1:m)
		{
			count++;
			System.out.println(m1.getName());
		}
		System.out.println(count);
	
	}

}
