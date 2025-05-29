package geeksForGeeks;

public class CountDigits {

	public static void main(String[] args) {
		System.out.println(evenlyDivides(20));

	}
   public  static int evenlyDivides(int n) {
        
	   
	   int count =0;
	   int temp=n;
	   while(n!=0)
	   {
		   int rem=n%10;
		   try {
		   if(temp%rem==0)
		   {
			   count++;
		   }
		   }catch(ArithmeticException e) {};
		   n=n/10;
			   
	   }
		   
	   return count;
        
    }

}
