package geeksForGeeks;

import java.util.Arrays;

public class StrongestNeighbour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,2,3,4,5};
		int n=6;
		maximumAdjacent(n, arr);

	}
	public static void maximumAdjacent(int sizeOfArray, int arr[]) {

       
		for (int i = 0; i < sizeOfArray - 1; i++) {
            System.out.print(Math.max(arr[i], arr[i + 1]) + " ");
        }
         
//         for(int i=0;i<sizeOfArray-1;i++)
//         {
//            if(arr[i]<=arr[i+1])
//            {
//            	arr[i]=Math.max(arr[i], arr[i+1]);
//            
//            }
//         }
//         System.out.println(Arrays.toString(arr));
    }

}
