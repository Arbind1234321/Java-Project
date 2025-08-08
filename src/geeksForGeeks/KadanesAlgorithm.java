package geeksForGeeks;

public class KadanesAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int arr[]= {5, 4, 1, 7, 8};
    System.out.println(maxSubarraySum(arr));
	}
	public static int maxSubarraySum1(int[] arr) {
		int current_max=arr[0];
		int max_sofar=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			current_max=Math.max(arr[i], arr[i]+current_max);
			max_sofar=Math.max(max_sofar, current_max);
		}
		return max_sofar;
        
    }
	public static int maxSubarraySum(int[] arr) {
		int n=arr.length;
       int maxsub=Integer.MIN_VALUE;
       for(int i=0;i<n;i++)
       {
    	   int sum=0;
    	   for(int j=i;j<n;j++)
    	   {
    		   sum=sum+arr[j];
    	   }
    	   maxsub= Math.max(maxsub,sum);
       }
       return maxsub;
        
    }

}
