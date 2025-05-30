package geeksForGeeks;

import java.util.Arrays;

public class Arrayinsertatindex {

	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5};
		insertAtIndex(arr, 6, 5, 90);
	}

	public static void insertAtIndex(int arr[], int sizeOfArray, int index, int element) {
		for (int i = sizeOfArray - 1; i > index; i--) {
            arr[i] = arr[i - 1];
        }

        // Insert the new element at the given index
        arr[index] = element;
		System.out.println(Arrays.toString(arr));

	}

}
