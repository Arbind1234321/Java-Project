package geeksForGeeks;

public class LcmOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(lcm(0,4));
		int arr[]= {2,4,6,8};
		System.out.println(lcmOfArray(arr, arr.length));

	}
	public  static int lcm(int a,int b) {
		return (a*b)/gcd(a,b);
	}
	public  static int gcd(int a, int b) {
		if(a==0)
			return b;
		return gcd(b%a,a);
	}
	//Lcm of Array list 
	public static int lcmOfArray(int []arr,int N)
	{
		
		if(arr.length==0)
		{
			return 0;
		}
		if(arr.length==1)
		{
			return arr[0];
		}
		if(arr.length==2)
		{
			return lcm(arr[0],arr[1]);
		}
		int index=0;
		int ans=arr[index];
		for(int i=0;i<arr.length;i++)
		{
			if (arr[i] < 0) {
		           arr[i] = arr[i] * (-1);
		        }
			ans=lcm(arr[i],ans);
			index++;
		}
		
		return ans;
	}
	
	
	
	

}
