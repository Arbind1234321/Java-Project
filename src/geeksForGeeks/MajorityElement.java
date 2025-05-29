package geeksForGeeks;

public class MajorityElement {

	public static void main(String[] args) {
		int[] arr = { 2, 13 };
		System.out.println(majorityElement(arr));

	}

	public static int majorityElement(int arr[]) {
		int count = 0;
		int cand = 0;

		for (int i = 0; i < arr.length; i++) {
			if (count == 0) {
				cand = arr[i];
			}
			count += (arr[i] == cand) ? 1 : -1;
		}
        count = 0;
        for (int num : arr) {
            if (num == cand) {
                count++;
            }
        }

        return (count > arr.length / 2) ? cand : -1;
	}

}
