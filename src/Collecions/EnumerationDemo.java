package Collecions;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {

	public static void main(String[] args) {
		Vector v=new Vector();
		for(int i=0;i<=10;i++)
		{
			v.addElement(i);
		}
		System.out.println(v);
		//converting vector to cursor  
		Enumeration e=v.elements();
		while (e.hasMoreElements()) {
			Integer I=(Integer)e.nextElement();
			if(I%2==0)
			{
				System.out.println(I+" ");
			}
			else
			{
				System.out.println(I+" i will remove ");
				v.remove(I);
			}
			
		}
		System.out.println();
		System.out.println(v);

	}

}
