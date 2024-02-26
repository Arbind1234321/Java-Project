package seleniumprogram;

import java.util.Arrays;

public class DeletionFromArray {

	public static void main(String[] args) {
		int [] arr= {1,4,6,8,99};
		//System.out.println(arr.length);
		//int pos=arr.length-1; deleting from last 
		int pos =2; 
		int [] a =new int[arr.length-1];
		for(int i=0;i<a.length;i++)
		{
			if(i<pos-1)
				a[i]=arr[i];
			else
				a[i]=arr[i+1];
						
		}
		System.out.println(Arrays.toString(a));

	}

}
