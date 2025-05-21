package dynamicProgaramming;

public class EquivalanceSubSet {

	public static void main(String[] args) {
		int [] arr= {2,2,1,1};
		int n=arr.length;
		//int sum =0;
		System.out.println(equipart(arr, n));
	
	}
	public static boolean equipart(int []arr, int n)
	{
		int sum =0;
		for(int i=0;i<n;i++)
		{
			sum=sum+arr[i];
		}
		if(sum%2 !=0)
		{
			return false;
		}
		else {
			  return subset(arr,sum/2,n);
		}
		
	}
	public static boolean subset(int[] arr, int sum, int n) {
		boolean [][] t=new boolean[n+1][sum+1];
		for(int i=0;i<n+1;i++)
		{
			t[i][0]=true;
		}
		for(int j=1;j<sum+1;j++)
		{
			t[0][j]=false;
		}
		
		for(int i=1;i<n+1;i++)
		{
			for(int j=1;j<sum+1;j++)
			{
			  if(arr[i-1]<=j)
			  {
				  t[i][j]=t[i-1][j-arr[i-1]] || t[i-1][j];
			  }
			  else
			  {
				t[i][j]=t[i-1][j];  
			  }
			}
			
		}
		return t[n][sum];
		
	}

}





