package geeksForGeeks;

public class RoofTop {

	public static void main(String[] args) {

		int arr[]= {1,2,2,3,2};
		System.out.println(maxStep(arr));
	}

	public  static int maxStep(int arr[]) {
		int count=0;
		int maxcount=0;
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i-1]< arr[i] )
			{
				count++;
				maxcount= Math.max(maxcount, count);
			}
			else {
				count=0;
			}
		}
		return maxcount;

	}

}
