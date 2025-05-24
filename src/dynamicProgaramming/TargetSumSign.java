package dynamicProgaramming;

public class TargetSumSign {

	public static void main(String[] args) {
      int [] arr= {0,0,0,0,0,0,0,0,1};
      int sum=1;
      System.out.println(targetSumSign(arr, sum));
	}
	public static int targetSumSign(int []arr,int sum)
	{
	      int totalSum = sumOfArray(arr);

	        // Check if (target + totalSum) is valid
	        if ((sum + totalSum) % 2 != 0 || totalSum < Math.abs(sum)) {
	            return 0;
	        }

	        int s1 = (sum + totalSum) / 2;
		return countSubSet(arr,s1);
	}
	public static int countSubSet(int[] arr, int sum) {
		int n=arr.length;
		int[][] t = new int[n + 1][sum + 1];

		for (int i = 0; i < n + 1; i++) {
			t[i][0] = 1;
		}
//		for (int j = 1; j < sum + 1; j++) {
//			t[0][j] = 0;
//		}

		for (int i = 1; i < n + 1; i++) {

			for (int j = 1; j < sum + 1; j++) {
				if (arr[i - 1] <= j) {
					t[i][j] = t[i - 1][j - arr[i - 1]] + t[i - 1][j];

				} else {
					t[i][j] = t[i - 1][j];

				}

			}
		}

		return t[n][sum];
	}
	public static int sumOfArray(int []arr)
	{
		int sum=0;
		for(int a:arr)
		{
			sum+=a;
		}
		return sum;
	}

}
