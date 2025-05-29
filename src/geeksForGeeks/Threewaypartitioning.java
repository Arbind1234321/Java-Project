package geeksForGeeks;import java.util.Arrays;

public class Threewaypartitioning {

	public static void main(String[] args) {
		int []arr= {1, 2, 3, 3, 4};
		int a=1;
		int b=2;
		threeWayPartition(arr, a, b);
		System.out.println(Arrays.toString(arr));
	}
	public static void threeWayPartition(int arr[], int a, int b) {
      int n=arr.length;
      int low=0;
      int mid=0;
      int high=n-1;
      while (mid <= high) {
          if (arr[mid] < a) {
              swap(arr, low++, mid++);
          } else if (arr[mid] > b) {
              swap(arr, mid, high--);
          } else {
              mid++;
          }
      }
        
    }
	 public static void swap(int[] arr, int i, int j) {
	        int temp = arr[i];
	        arr[i] = arr[j];
	        arr[j] = temp;
	    }
}
