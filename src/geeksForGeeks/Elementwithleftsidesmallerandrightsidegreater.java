package geeksForGeeks;

public class Elementwithleftsidesmallerandrightsidegreater {

	public static void main(String[] args) {
		int arr[] = { 4, 2, 5, 7};
		System.out.println(findElement(arr));
	}

	public static int findElement(int[] arr) {
		int n = arr.length;
		if (n < 3)
			return -1;
		int[] leftmax = new int[n];
		int[] rightmin = new int[n];
		leftmax[0] = Integer.MIN_VALUE;
		// filling left max

		for (int i = 1; i < n; i++) {
			leftmax[i] = Math.max(leftmax[i - 1], arr[i - 1]);
		}
		
		//filling right min
		rightmin[n-1]=Integer.MAX_VALUE;
		for (int i = n-2; i >=0; i--) {
			rightmin[i] = Math.min(rightmin[i+1], arr[i +1]);
		}
		
		//filling array
		for(int i=1;i<n-1;i++)
		{
			if(leftmax[i]< arr[i] &&arr[i]<rightmin[i])
			{
				return arr[i];
			}
		}

		return -1;
	}

}
