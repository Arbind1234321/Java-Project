package com.dsa;

import java.util.Arrays;

public class TestDemo {

	public static void main(String[] args) {
	//move zero at last
		int []arr= {1,0,2,5,0,0,3,0,2};
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0)
			{
				count++;
			}
			else {
				int temp=arr[i];
				arr[i]=arr[i-count];
				arr[i-count]=temp;
			}
		}
System.out.println(Arrays.toString(arr));
	}

}
