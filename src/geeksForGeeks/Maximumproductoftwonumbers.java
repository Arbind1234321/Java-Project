package geeksForGeeks;

public class Maximumproductoftwonumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int arr[] = {24 ,75 ,50 ,45 ,90 ,58 ,71 ,47 ,72 ,60 ,33};
		int arr[] = {1, 4, 3, 6, 7, 0};
        System.out.println(maxProduct1(arr));
	}

	public static int maxProduct(int[] arr) {
		int prod =0;
		for(int j=0;j<arr.length-1;j++)
		{
		for (int i = j+1; i < arr.length; i++) {
			prod = Math.max(prod, arr[i] * arr[j]);
		}
		}
		return prod;

	}
	public static int maxProduct1(int[] arr) {
		int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
	    int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;

	    for (int num : arr) {
	        if (num > max1) { 
	            max2 = max1;
	            max1 = num;
	        } else if (num > max2) {
	            max2 = num;
	        }

	        if (num < min1) {
	            min2 = min1;
	            min1 = num;
	        } else if (num < min2) {
	            min2 = num;
	        }
	    }

	    return Math.max(max1 * max2, min1 * min2);

	}
}
