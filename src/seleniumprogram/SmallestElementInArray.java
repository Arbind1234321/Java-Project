package seleniumprogram;

public class SmallestElementInArray {

	public static void main(String[] args) {
		int arr[]= {33,4,5,1,-68,66,0};
		int smallest=arr[0];
		int sm=arr[1];
		for(int i=1;i<arr.length;i++)
		{
			if(smallest>arr[i])
			{
				sm=smallest;
				smallest=arr[i];
			}
			else if(sm>arr[i])
			{
				sm=arr[i];
			}
		}
		System.out.println(smallest);
		System.out.println(sm);

	}

}
