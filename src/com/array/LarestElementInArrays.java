package com.array;

public class LarestElementInArrays {

	public static void main(String[] args) {
		int [] arr = {2,3,7,366,5,34,1};
		 int largest=arr[0];
		 int sb=arr[1];
		 for(int  i=1;i<arr.length;i++)
		 {
			 if(largest<arr[i])
			 {
				 
				 sb=largest;
				 largest=arr[i];
			 }
			 
			 else if(sb<arr[i])
			 {
				 sb=arr[i];
			 }
		 }
        System.out.println(largest);
        System.out.println(sb);
	}

}
