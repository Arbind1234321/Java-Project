package geeksForGeeks;

public class PalindromicArray {

	public static void main(String[] args) {

	}

	public static boolean isPalinArray(int[] arr) {
		int count=0;
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
			int x=arr[i];
			if(ispalindrome(x))
			{
				count++;
			}
		}
		if(count==n)return true;
		else return false;

	}

	public static boolean ispalindrome(int x) {
		int temp=x;
		int sum=0;
		while(x!=0)
		{
			sum=sum*10+x%10;
			x=x/10;
		}
		if(sum==temp)
		{
			return true;
		}
		else 
		return false;
	}

}
