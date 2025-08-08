package geeksForGeeks;

public class Findthefine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static long totalFine(int date, int car[], int fine[]) {
		long sum = 0;

		for (int i = 0; i < car.length; i++) {
			if (date % 2 == 0 && car[i] % 2 == 1) {
				sum += fine[i];
			} else if (date % 2 == 1 && car[i] % 2 == 0) {
				sum += fine[i];
			}

		}
		return sum;

	}

}
