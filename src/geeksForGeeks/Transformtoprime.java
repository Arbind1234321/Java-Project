package geeksForGeeks;

public class Transformtoprime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N=5;
				int []arr = {1, 5, 7};
				System.out.println(minNumber(arr, N));
	}

	public static int minNumber(int arr[], int N) {
		int sum = 0;
		for (int a : arr) {
			sum += a;
		}
		if (isPrime(sum)) {
			return 0;
		} else {
			for (int i = 1;; i++) {
				int p = sum + i;
				if (isPrime(p)) {
					return i;
				}
			}

		}

	}

	public static boolean isPrime(int sum) {

		for (int i = 2; i < Math.sqrt(sum); i++) {
			if (sum % i == 0)
				return false;
		}
		return true;
	}

}
