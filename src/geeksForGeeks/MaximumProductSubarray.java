package geeksForGeeks;

public class MaximumProductSubarray {

	public static void main(String[] args) {
		 int arr[] = {-1, -3, -10, 0, 6};
	        System.out.println(maxProduct2(arr));	

	}
	static long maxProduct2(int[] arr) {
       int n=arr.length;
       int leftproduct=1;
       int rightproduct=1;
       long maxprod=Integer.MIN_VALUE;
       for(int i=0;i<n;i++)
       {
//    	   if(leftproduct==0)
//    	   {
//    		   leftproduct=1;
//    	   }
//    	   if(rightproduct==0)
//    	   {
//    		   rightproduct=1;
//    	   }
    	   leftproduct=leftproduct==0?1:leftproduct;
    	   rightproduct=rightproduct==0?1:rightproduct;
    	   leftproduct *=arr[i];
    	   rightproduct *=arr[n-1-i];
    	   maxprod=Math.max(maxprod, Math.max(leftproduct, rightproduct));
       }
       
        return maxprod;
    }
	static long maxProduct1(int[] arr) {
        int n = arr.length;
        int maxProd = Integer.MIN_VALUE;
  
        // leftToRight to store product from left to Right
        int leftToRight = 1;
  
        // rightToLeft to store product from right to left
        int rightToLeft = 1;
  
        for (int i = 0; i < n; i++) {
            if (leftToRight == 0)
                leftToRight = 1;
            if (rightToLeft == 0)
                rightToLeft = 1;
      
            // calculate product from index left to right
            leftToRight *= arr[i];
      
            // calculate product from index right to left
            int j = n - i - 1;
            rightToLeft *= arr[j];
            maxProd = Math.max(leftToRight,  Math.max(rightToLeft, maxProd));
        }
        return maxProd;
    }
	public static int maxProduct(int[] arr) {
      int result=arr[0];
      for(int i=0;i<arr.length;i++)
      {
    	  int mul=1;
    	  for(int j=i;j<arr.length;j++)
    	  {
    		  mul=mul*arr[j];
    		  result=Math.max(result, mul);
    	  }
    	 
      }
      return result;
        
    }

}
