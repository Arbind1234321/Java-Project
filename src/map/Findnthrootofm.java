package map;

public class Findnthrootofm {

	public static void main(String[] args) {
		System.out.println(nthRoot(1, 14));
	}
	public static int nthRoot(int n, int m) {
      
		if(n==1)
			return m;
        int start=1;
        int end=m;
        while(start<=end)
        {
        	int mid= start+(end-start)/2;
        	int power=power(mid,n);
        	if(power==m)
        	{
        		return mid;
        	}
        	else if( power< m)
        	{
        		start=mid+1;
        	}
        	else {
        		end=mid-1;
        	}
        }
       
      return -1;
        
    }
	public static int power(int mid, int n) {
		int prod=1;
		for(int i=0;i<n;i++)
		{
		 prod=prod*mid;
		}
		return prod;
	}

}
