package geeksForGeeks;

public class StockBuyandSellMaxoneTransactionAllowed {

	public static void main(String[] args) {
		

	}
	public int maximumProfit(int prices[]) {
        int maxprofit=0;
        int min1= prices[0];
        
        for(int i=1;i<prices.length;i++)
        {
        	int cost=prices[i]-min1;
        	maxprofit=Math.max(maxprofit, cost);
        	min1=Math.min(min1, prices[i]);
        }
        return maxprofit;
       
        
    }
public static int stockBuySell(int arr[]) {
		
		int profit=0;
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>arr[i-1])
			{
				profit=arr[i]-arr[i-1];
			}
		}

		return profit;

	}

}
