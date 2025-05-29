package geeksForGeeks;

public class NthFibonacciNumber {

	public static void main(String[] args) {

		System.out.println(nthFibonacci(1));
	}

	public static int nthFibonacci(int n) {
		if(n==0)
		{
			return 0;
		}
		if(n==1)
		{
			return 1;
		}

		return  nthFibonacci(n-1)+ nthFibonacci(n-2);
	}

}
