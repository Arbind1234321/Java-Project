package leetcode;

public class BestTimetoBuyandSellStock {
	public static int maxProfit(int[] prices) {
		
		 
			  int mini= prices[0]; 
			  int maxprrofit=0;
			  int n=prices.length; 
			  for(int i=1;i<prices.length;i++)
			  {
				 int cost=prices[i]-mini;
				 maxprrofit=Math.max(maxprrofit,cost);
				 mini=Math.min(mini, prices[i]);
			  }
		      
	     return maxprrofit;
	    }

	public static void main(String[] args) {
		int prices[] = {100, 180, 260, 310, 40, 535, 695};
		int k=maxProfit(prices);
		System.out.println(k);
	}

}
