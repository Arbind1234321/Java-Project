package geeksForGeeks;

public class ProductofanArray {

	public static void main(String[] args) {
		long []arr= {100000, 100000, 100000};
		
		System.out.println(product(arr));
	}
	public static long product(long arr[]) {
      long prod=1;
      int n=arr.length;
      
      for(int i=0;i<n;i++)
      {
    	  prod=((prod*arr[i])%1000000007)%1000000007;
      }
      
      return prod;  
    }

}
