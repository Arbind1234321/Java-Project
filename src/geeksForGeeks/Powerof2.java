package geeksForGeeks;

public class Powerof2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPowerofTwo(98));

	}
	 public static boolean isPowerofTwo(int n) {
		 
		 if(n==0)
		 {
			 return false;
		 }
		 if(n==1)
		 {
			 return true;
		 }
		 while(n!=1)
		 {
			 if(n%2 !=0)
			 {
				 return false;
			 }
			 else {
				 n=n/2;
			 }
		 }
		 return true;
	       
	        
	    }

}
