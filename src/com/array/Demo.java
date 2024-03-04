package com.array;

import java.awt.RenderingHints.Key;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Demo {

	public static void main(String[] args) {
		int a[]= {2,3,4,43,44,3,4,5,5,44};//2--1,3--2,43--1,44--2,5--2
		for(int i=0;i<a.length;i++)
		{
			int x=a[i];
			int count=0;
			if(x==-1)continue;
			for(int j=0;j<a.length;j++)
			{
				if(a[j]==x)
				{
					count++;
					a[j]=-1;
				}
			}
			System.out.println(x+"--->"+count);
		}
		
//		HashMap< Integer, Integer> m=new HashMap<>();
//		for(int i=0;i<a.length;i++)
//		{
//			if(m.containsKey(a[i]))
//			{
//			 m.put(a[i], m.get(a[i])+1);	
//			}
//			else
//			{
//				m.put(a[i], 1);
//			}
//		}
//		System.out.println(m);
//		//using set
//		Set<Integer> k=m.keySet();
//         for(Integer t:k)
//         {
//        	 System.out.println(t+"-->"+m.get(t));
//         }
//         for(Entry<Integer, Integer> set:m.entrySet())
//         {
//        	 System.out.println(set.getKey()+"****"+set.getValue());
//         }
//		

	}

}
