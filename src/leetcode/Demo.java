package leetcode;

public class Demo {

	public static void main(String[] args) {
		int prices[] = { 7, 1, 5, 3, 6, 4,100 };
		int mini=prices[0];
		int maxprofit=0;
		for(int i=1;i<prices.length;i++)//for buying 
		{
			int cost=prices[i]-mini;
			maxprofit=Math.max(maxprofit, cost);
			mini=Math.min(mini,prices[i]);
		}
		System.out.println(maxprofit);

	}

}
