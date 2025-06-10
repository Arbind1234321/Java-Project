package geeksForGeeks;

public class CountOccurrenceofdigitk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//int k=1, arr[] = {11, 12, 13, 14, 15};
		int k=3, arr[] = {11, 121, 15};
	System.out.println(num(k, arr));

	}
	public static int num(int k, int arr[]) {
		int count =0;
	    
	    for(int i =0;i<arr.length;i++)
	    {
	    	int n=arr[i];
	    	while(n!=0)
	    	{
	    		int r=n%10;
	    		if(r==k)
	    		{
	    			count++;
	    		}
	    		n=n/10;
	    	}
	    	
	    }
	    return count;
	    
	    }

}
