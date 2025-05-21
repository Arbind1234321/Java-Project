package dynamicProgaramming;

public class SubSetSum {
	static boolean[][] t;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,3,7,8,10};
		int sum=40;
		int n=arr.length;
		System.out.println(sumT(arr, sum, n));

	}

	public static boolean sumT(int[] arr, int sum, int n) {

		t = new boolean[n + 1][sum + 1];
		
		   for (int i = 0; i < n + 1; i++) {
	            t[i][0] = true;  // A sum of 0 is always possible
	        }
	        for (int j = 1; j < sum + 1; j++) {
	            t[0][j] = false; // With 0 elements, non-zero sum is not possible
	        }
	      //  System.out.println(t[0][0]);

		for (int i = 1; i < n + 1; i++) {
			
			for (int j = 1; j < sum + 1; j++) {
				if(arr[i-1]<=j)
				{
					t[i][j]=t[i-1][j-arr[i-1]] || t[i-1][j];
					
				}
				else {
					t[i][j]=t[i-1][j];
					
				}

			}
		}
		
		 return t[n][sum];

	}

}
