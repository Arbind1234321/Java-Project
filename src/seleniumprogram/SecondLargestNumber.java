package seleniumprogram;
//Second largest element in array
public class SecondLargestNumber {
	public static void main(String[] args) {
		int [] arr= {10,5,1};
		int fbig=arr[0];
		int sbig=arr[1];
		int tbig=arr[2];
		for(int i=0;i<arr.length;i++)
		{
			if(fbig<arr[i])
			{
				sbig=fbig;
				fbig=arr[i];
			}
			else  if(sbig<arr[i])
			{
				tbig=sbig;
				sbig=arr[i];
			}
			else  if(tbig<arr[i])
			{
				
				tbig=arr[i];
			}
		}
		//System.out.println("Third irst big is :"+tbig);
		System.out.println(sbig);
	}

}
