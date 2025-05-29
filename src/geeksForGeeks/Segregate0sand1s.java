package geeksForGeeks;

import java.util.Arrays;

public class Segregate0sand1s {

	public static void main(String[] args) {
		int arr[] = {1, 1, 1, 1};
		segregate0and1(arr);
		System.out.println(Arrays.toString(arr));
	}
	public static void segregate0and1(int[] arr) {
      int low=0, mid=0,  high=arr.length-1;
      while(mid<=high)
      {
    	  if(arr[mid]==0)
    	  {
    		  int temp=arr[low];
    		  arr[low]=arr[mid];
    		  arr[mid]=temp;
    		  low++;
    		  mid++;
    	  }
    	  else if (arr[mid] == 1) {
				mid++;
			} else {
				int temp = arr[mid];
				arr[mid] = arr[high];
				arr[high] = temp;
				high--;
			}
      }
        
    }

}
