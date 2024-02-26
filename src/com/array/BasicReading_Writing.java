package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class BasicReading_Writing {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println();
		/*int arr[]=new int[5];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter number ");
			arr[i]=sc.nextInt();
		}
		for(int j=0;j<arr.length;j++)
		{
			System.out.print(arr[j]+" ");
		}*/
		//1) sum of array element
		//Approach 1
		int arr[]= {4,55,6,7,8};
		int sum=0;
		/*for(int a:arr)
		{
			sum= sum+a;
		}*/
		//Approach 2
		/*for(int i=0; i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		
			System.out.println(sum);
	    */
		//2)Reversing array element
		/*for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}*/
		
		//3) find max element from array
		/*int max=0;
		for(int i=0;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		System.out.println(max);
		*/
		/*String [] str=new String[5];
		for(int i=0;i<str.length;i++)
		{
			str[i]=sc.next();
		}
		System.out.println(Arrays.toString(str));
		*/
		//reversing string
		String str1= "Arbind";
		char ch[]=str1.toCharArray();
		for(int  i=str1.length()-1;i>=0;i--)
		{
			
		}

	}

}
