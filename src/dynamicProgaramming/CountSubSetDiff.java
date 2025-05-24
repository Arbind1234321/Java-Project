package dynamicProgaramming;

public class CountSubSetDiff {

	public static void main(String[] args) {
		int [] arr= {1,1,2,3};
		int diff=1;
		System.out.println(countSubSetDiff(arr, diff));

	}
	public static int countSubSetDiff(int []arr,int diff)
	{
		
		int s1=(diff+sumOfArr(arr))/2;
		return countSubSet(arr,s1);
		
	}
	public static int countSubSet(int[] arr, int s1) {
		
	   int n=arr.length;
	   int [][] t=new int [n+1][s1+1];
	   
	   //initialize
	   for(int i=0;i<n+1;i++)
	   {
		 t[i][0]=1;  
	   }
	   for(int j=1;j<n+1;j++)
	   {
		 t[0][j]=0;  
	   }
	   
	   //filling table
	   for(int i=1;i<n+1;i++)
	   {
		   for(int j=1;j<s1+1;j++)
		   {
			   if(arr[i-1]<=j)
			   {
				   t[i][j]=t[i-1][j - arr[i-1]]+t[i-1][j];
			   }
			   else
			   {
				   t[i][j]=t[i-1][j];
			   }
		   }
	   }
	   
		return t[n][s1];
	}
	public static int sumOfArr(int[] arr) {
		int sum=0;
		for(int a:arr)
		{
			sum=sum+a;
		}
		return sum;
	}

}
