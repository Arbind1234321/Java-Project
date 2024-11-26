package com.array;

import java.util.Arrays;

public class Test1 {
	public static void main(String[] args) {
		int[] a = { 2, 2, 3, 4, 5, 6, 6, 6 };// 2 3 4 5 6
		//int n = a.length;
		int i=0;
		for (int n : a)
            if (i < 1 || n > a[i - 1])
                a[i++] = n;
		
		for(int k=0;k<i;k++)
		{
			System.out.println(a[k]);
		}
	//	System.out.println(Arrays.toString(a));
        
	}
	
}

