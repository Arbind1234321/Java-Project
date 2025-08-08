package geeksForGeeks;

public class ProductofPrimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 long  L = 18468, R =18510;
		// 18468 18510
		 System.out.println(primeProduct(L, R));
	}
	public  static long primeProduct(long L, long R) {
	       long mul=1;
	       
	       for(long i=L;i<=R;i++)
	       {
	    	   if(isPrime(i))
	    		   mul=(mul*i)%1_000_000_007;
	       }
	       return mul;
	       
	        
	    }
	private static boolean isPrime(long n) {
		if(n<=1)
			return false;
		for(int i=2;i*i<=n;i++)
		{
			if(n%i==0)
				return false;
		}
		return true;
	}

}
