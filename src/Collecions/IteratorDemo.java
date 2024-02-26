package Collecions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {

	public static void main(String[] args) {
	/*	ArrayList li=new ArrayList();
		for(int i=0;i<=10;i++)
		{
			li.add(i);
		}
		System.out.println(li);
	   Iterator	itr=li.iterator();
	   while(itr.hasNext())
	   {
		   Integer I=(Integer)itr.next();
		   if(I%2==0)
		   System.out.println(I);
		   else
			itr.remove();   
	   }
	   System.out.println(li);*/
		//for String 
		ArrayList<String> li=new ArrayList<String>();
		for(int i=0;i<=10;i++)
		{
			li.add(""+i+"");
		}
		System.out.println(li);
		 Iterator	itr=li.iterator();
		 while(itr.hasNext())
		   {
			   String I=(String)itr.next();
			   if(I.equals("2") ||I.equals("7"))
			   System.out.println(I);
			   else
				itr.remove();   
		   }
		   System.out.println(li);
	}

}
