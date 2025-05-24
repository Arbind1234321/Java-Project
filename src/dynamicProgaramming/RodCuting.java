package dynamicProgaramming;

public class RodCuting {

	public static void main(String[] args) {
		int price[] =  {1, 5, 8, 9, 10, 17, 17, 20};
    System.out.println(cutRod(price));
	}

	public static int cutRod(int[] price) {
		
		int n=price.length;
		int memo[]=new int[n+1];
		
	
	       
	    return maxcount(price ,n ,memo );    
	    }

	public  static int maxcount(int[] price, int n, int[] memo) {
		int t[][]=new int[n+1][n+1];
	
		for(int i=0;i<n+1;i++)
		{
			t[i][0]=0;
		}
		for(int j=1;j< n+1;j++)
		{
			t[0][j]=0;
		}
		for(int i=1;i< n+1;i++)
		{
			for(int j=1;j<n+1;j++)
			{
				if(i<=j)
				{
					t[i][j]=Math.max(price[i-1]+t[i][j-i], t[i-1][j]);
				}
				else {
					t[i][j]=t[i-1][j];
				}
			}
		}
		
		return t[n][n];
	}

}
