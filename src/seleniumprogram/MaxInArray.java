package seleniumprogram;
//Write a java program to print biggest and smallest  number in an array 
public class MaxInArray {

	public static void main(String[] args) {
		int[] arr = { 1, 7777, 88, 8, -5 };
		
//	for(int i=0;i<arr.length;i++)
//	{
//		System.out.println("Array elemets are: "+arr[i]);
//	}
		int big = arr[0];
		int smaller = arr[0];
		for (int i = 1; i < arr.length; i++) {

			if (big < arr[i]) {
				big = arr[i];

			}
			if (smaller > arr[i]) {
				smaller = arr[i];

			}

		}
		System.out.println("Bigget element is :" + big);
		System.out.println("smallest element is :" + smaller);
	}

}
