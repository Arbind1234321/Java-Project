package geeksForGeeks;

public class Stockbuyandsell {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {4, 2};
		System.out.println(stockBuySell(arr));
	}

	public static int stockBuySell(int arr[]) {
		
		int profit=0;
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>arr[i-1])
			{
				profit+=arr[i]-arr[i-1];
			}
		}

		return profit;

	}

}
