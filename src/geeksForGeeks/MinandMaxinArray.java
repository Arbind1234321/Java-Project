package geeksForGeeks;

public class MinandMaxinArray {

	public static void main(String[] args) {
		int arr[]= {56789};
    getMinMax(arr);
	}
	public static void getMinMax(int[] arr) {
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(min> arr[i])
			{
				min=arr[i];
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			if(max< arr[i])
			{
				max=arr[i];
			}
		}
		
		System.out.println(min);
		System.out.println(max);
	}

}
