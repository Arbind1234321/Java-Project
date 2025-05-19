package com.kunal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		factor2(36);
	}

	public static void factor2(int n) {
		
		ArrayList list=new ArrayList<>();
		for (int i = 1; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				if (n / i == i)
					System.out.print(i + " ");
				else {
					System.out.print(i + " ");
				list.add(n/i);
				}
			}
		}
		/*for(int i=list.size()-1;i>=0;i--)
		{
			System.out.print(list.get(i)+" ");
		}
		*/
		
		//Iterator itr=list.iterator();
		ListIterator itr=list.listIterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
	}

	// brutte force O(n)
	public static void factor(int n) {
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.print(i + " ");
			}
		}
	}

	// optimize solution O(sqrt(n))
	public static void factor1(int n) {
		for (int i = 1; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				if (n / i == i)
					System.out.print(i + " ");
				else
					System.out.print(i + " " + n / i + " ");
			}
		}
	}

}
