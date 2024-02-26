package com.array;

import java.util.Arrays;

public class DeleteFromArray {

	public static void main(String[] args) {
		int[] arr= {2,3,45,57,8};
	  int delete=45;
	  for(int i=0;i<arr.length;i++)
	  {
		  if(delete==arr[i])
		  {
			  for(int j=i;j<arr.length-1;j++)
			  {
				  arr[j]=arr[j+1];
			  }
			  break;
		  }
		  
	  }
	  System.out.println(Arrays.toString(arr));
	  for(int i=0;i<arr.length-1;i++)
	  {
		  System.out.print(arr[i]+" ");
	  }

	}

}
