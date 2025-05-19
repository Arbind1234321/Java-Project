package leetcode;

public class PowerOfNumber {

	
	public static void main(String[] args) {
		System.out.println("hii");
		System.out.println(myPow(2.0, 4));
		
		
	}
	//WAP to power of number.
	public static double myPow(double x,int n)
	{
		if(n==0) return 1.0;
		if(n==1) return x;
		if(n<0)  return myPow(1/x ,-n);
		double result=1;
		
		for(int i=0;i<n;i++)
		{
			result=result*x;
		}
		
		return result;       			
	}

}
