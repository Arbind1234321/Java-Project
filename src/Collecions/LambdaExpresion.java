package Collecions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LambdaExpresion {

	public static void main(String[] args) {
		ArrayList<Integer> l= new ArrayList<>();
		l.add(10);
		l.add(5);
		l.add(101);
		l.add(20);
		System.out.println(l);
		
		Comparator<Integer> c=(I1,I2)->(I1<I2)?-1:(I1>I2)?1:0;
		
		Collections.sort(l,c);
		System.out.println(l);

	}

}
