package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortingArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> l=new ArrayList<>();
		l.add(10);
		l.add(5);
		l.add(30);
		l.add(15);
		System.out.println(l);
		Comparator<Integer> c=(I1,I2)->(I1<I2)?-1:(I1>I2)?1:0;
		Collections.sort(l,c);
		System.out.println(l);

	}

}

// class MyComparator implements Comparator<Integer>
//{
//
//	
//	public int compare(Integer I1, Integer I2)
//	{
//		return (I1<I2)?-1:(I1>I2)?1:0;
////	if(I1<I2)
////		return -1;
////	else if(I1>I2)
////	{
////		return +1;
////	}
////	else
////		return 0;
////	}
//	}
//}
 
 
 
 
 
 
 
 
 