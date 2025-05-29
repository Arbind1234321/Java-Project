package geeksForGeeks;

public class FindTransitionPoint {

	public static void main(String[] args) {
		

	}
	 public static int transitionPoint(int arr[]) {
		 int n=arr.length;
		int sum=0;
		 for(int a:arr)
		 {
			 sum +=a;
		 }
		 if(sum==0)return -1;
		 if(sum==n) return 0;
		 
		 
		 for(int i=0;i<arr.length-1;i++)
		 {
			 if(arr[i] !=0 )
			 {
				return i; 
			 }
		 }
	     
		 return 0;
	    }

}
