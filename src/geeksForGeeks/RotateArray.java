package geeksForGeeks;

import java.util.Arrays;

public class RotateArray {
	public static void main(String[] args) {
		int []arr= {8, 3, 1, 2};
		rotateArr1(arr);
		
	}
	
	 public static void rotateArr2(int arr[], int d) {
		
	 }
	 public static void rotateArr(int arr[], int d) {
		 int n=arr.length;
		 d=d%n;
		
	   for(int i=0;i<d;i++,d++)
	   {
		    int temp=arr[0];
		    for(int j=0;j<arr.length-1;j++) {
		    	arr[j]=arr[j+1];
		    }
		    arr[n-1]=temp;
	   }
	   System.out.println(Arrays.toString(arr));
	  }
	 public static void rotateArr1(int arr[]) {
		 int d=1;
		 int n=arr.length;
		 d=d%n;
		
		 int [] a=new int [d];
		 for(int i=0;i<a.length;i++)
		 {
			 a[i]=arr[i];
		 }
		 //shift
         for(int i=0;i<arr.length-d;i++)
         {
        	 arr[i]=arr[i+d];
         }
         
         //copy
         for(int i=0;i<d;i++)
         {
        	 arr[arr.length+i-d]=a[i];
         }
         int sum=0;
         for(int i=0;i<n;i++)
         {
        	 sum=sum+arr[i]*i;
         }
         System.out.println(sum);
	  
	   System.out.println(Arrays.toString(arr));
	  }

}
