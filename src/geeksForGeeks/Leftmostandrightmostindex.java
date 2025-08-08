package geeksForGeeks;

class pair  {
    long first, second;
    public pair(long first, long second)
    {
        this.first = first;
        this.second = second;
    }
}
public class Leftmostandrightmostindex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public pair indexes(long arr[], long x) {
	    long first=firstInddex(arr,x);
	    long last=lastInddex(arr,x);
		//	System.out.println(first +" "+last);
			
			return new pair(first,last);
		}

		public static int lastInddex(long[] arr, long x) {
			
			int start=0;
			int end=arr.length-1;
			int res=-1;
			while(start<=end)
			{
				int mid=start+(end-start)/2;
				if(arr[mid]==x)
				{
					res=mid;
					start=mid+1;
				}
				else if(arr[mid]>x)
				{
					end=mid-1;
				}
				else {
					start=mid+1;
				}
			}
			return res;
		}

		public static int firstInddex(long[] arr, long x) {
			int start=0;
			int end=arr.length-1;
			int res=-1;
			while(start<=end)
			{
				int mid=start+(end-start)/2;
				if(arr[mid]==x)
				{
					res=mid;
					end=mid-1;
				}
				else if(arr[mid]>x)
				{
					end=mid-1;
				}
				else {
					start=mid+1;
				}
			}
			return res;
	    }

}
