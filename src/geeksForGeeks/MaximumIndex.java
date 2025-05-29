package geeksForGeeks;

public class MaximumIndex {

	public static void main(String[] args) {
		int arr[] = { 15 };
		System.out.println(maxIndexDiff(arr));

	}

	public static int maxIndexDiff(int[] arr) {

		int n = arr.length;
		if (n < 2) {
			return 0;
		}
		int leftmin[] = new int[n];
		int rightmax[] = new int[n];

		// fil left min
		leftmin[0] = arr[0];
		for (int i = 1; i < n; i++) {
			leftmin[i] = Math.min(arr[i], leftmin[i - 1]);
		}
		// fil rightmax
		rightmax[n - 1] = arr[n - 1];
		for (int j = n - 2; j >= 0; j--) {
			rightmax[j] = Math.max(arr[j], rightmax[j + 1]);
		}

		// use two pointer to find min j-i so that arr[i]<arr[j]
		int i = 0, j = 0, maxdiff = -1;

		while (i < n && j < n) {
			if (leftmin[i] <= rightmax[j]) {
				if (arr[i] <= arr[j]) {
					maxdiff = Math.max(maxdiff, j - i);
				}
				j++;
			} else {
				i++;
			}
		}

		return maxdiff;

	}

}
