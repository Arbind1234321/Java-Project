package dynamicProgaramming;

import java.util.ArrayList;

public class SubSetSumDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1, 5, 11, 5};
		System.out.println(subSetDiff(arr));

	}

	public static int subSetDiff(int[] arr) {
		int sum = 0;
		for (int a : arr) {
			sum += a;
		}
		int n=arr.length;
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<=sum/2;i++)
		{
			if(subSet(arr, sum, n))
			{
				list.add(i);
			}
		}
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < list.size(); i++) {
		    min = Math.min(min, sum - 2 * list.get(i));
		}
		return min;
	}

	public static boolean subSet(int[] arr, int range, int n) {
		boolean[][] t = new boolean[n + 1][range + 1];
		for (int i = 0; i < n + 1; i++) {
			t[i][0] = true;
		}
		
		for (int j = 1; j < range + 1; j++) {
			t[0][j] = false;
		}
        for(int i=1;i<n+1;i++)
        {
        	for(int j=1;j<range+1;j++)
        	{
        		if(arr[i-1] <= j)
        		{
        			t[i][j]=t[i-1][j-arr[i-1]] || t[i-i][j];
        		}
        		else {
        			t[i][j]=t[i-1][j];
        		}
        	}
        }
        return t[n][range];
	}
	
	//Alternate
	public static int subSetDiff1(int[] arr) {
        int sum = 0;
        for (int a : arr) {
            sum += a;
        }

        boolean[][] t = subsetSumDP(arr, sum);
        int min = Integer.MAX_VALUE;

        // Check possible subset sums up to sum/2
        for (int j = 0; j <= sum / 2; j++) {
            if (t[arr.length][j]) {
                min = Math.min(min, sum - 2 * j);
            }
        }
        return min;
    }

    // Builds the DP table to determine possible subset sums
    public static boolean[][] subsetSumDP(int[] arr, int sum) {
        int n = arr.length;
        boolean[][] t = new boolean[n + 1][sum + 1];

        // Initialize: sum = 0 is always possible
        for (int i = 0; i <= n; i++) {
            t[i][0] = true;
        }

        // Initialize: with 0 elements, non-zero sum is false
        for (int j = 1; j <= sum; j++) {
            t[0][j] = false;
        }

        // Fill the DP table
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sum; j++) {
                if (arr[i - 1] <= j) {
                    t[i][j] = t[i - 1][j - arr[i - 1]] || t[i - 1][j];
                } else {
                    t[i][j] = t[i - 1][j];
                }
            }
        }

        return t;
    }

}
