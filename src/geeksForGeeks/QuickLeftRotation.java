package geeksForGeeks;

import java.util.Arrays;

public class QuickLeftRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 2, 3, 4, 5, 6, 7};int  k = 2;//7  5-2-1==7-2-5==
		leftRotate1(arr, k);

	}
	public  static void leftRotate2(int arr[], int k) {
		  k %= arr.length;
		    int[] temp = new int[k];

		    // Store the first k elements in a temp array
		    for (int i = 0; i < temp.length; i++) {
		      temp[i] = arr[i];
		    }

		    // Shift rest of the arr[]
		    for (int i = 0; i < arr.length - k; i++) {
		      arr[i] = arr[i + k];
		    }

		    // Store back the k elements
		    for(int i=0;i<k;i++)
	         {
	        	 arr[arr.length+i-k]=temp[i];
	         }
		System.out.println(Arrays.toString(temp));
		System.out.println(Arrays.toString(arr));
	}
	
	public  static void leftRotate1(int arr[], int k) {
        int n = arr.length;
        k = k % n;  // handle k > n

//        reverse(arr, 0, k - 1);       // Step 1
//        reverse(arr, k, n - 1);       // Step 2
//        reverse(arr, 0, n - 1);       // Step 3
        
        //Revesre 0 to n-1 all array
        reverse(arr,0,n-1);
        //Reverse 0 to n-k
        reverse(arr,0,n-k-1);
        //All last nn-k to last
        reverse(arr,n-k,n-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
	public static void leftRotate(int arr[], int k) {
		int n=arr.length;
		k=k%n;
		
		for(int i=0;i<k;i++)
		{
			int temp=arr[0];
			for(int j=0;j<n-1;j++) {
				arr[j]=arr[j+1];
			}
			arr[n-1]=temp;
			
		}
		System.out.println(Arrays.toString(arr));
		
		 
	 }

}
