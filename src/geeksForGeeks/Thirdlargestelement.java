package geeksForGeeks;

public class Thirdlargestelement {

	public static void main(String[] args) {
		int[] arr = { 5, 5 };
		System.out.println(thirdLargest(arr));

	}

	public static int thirdLargest(int arr[]) {

		int n = arr.length;
		if (n < 3) {
			return -1;
		}
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		int third = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {

			if (first < arr[i]) {
				third = second;
				second = first;
				first = arr[i];
			} else if (second < arr[i]) {
				third = second;
				second = arr[i];
			} else if (third < arr[i]) {

				third = arr[i];
			}
		}
		return third;

	}

}
