package geeksForGeeks;

import java.util.ArrayList;
import java.util.HashSet;

public class Findmissinginsecondarray {

	public static void main(String[] args) {
		int a[] = { 6, 8, 3, 2, 1, 8, 5, 1 };// 351
		int b[] = { 7, 9, 2, 8, 1, 8, 6, 7, 2 };// 35

	}

	public static ArrayList<Integer> findMissing(int[] a, int[] b) {
		HashSet<Integer> setB = new HashSet<>();
        for (int num : b) {
            setB.add(num);
        }

        ArrayList<Integer> result = new ArrayList<>();
        for (int num : a) {
            if (!setB.contains(num)) {
                result.add(num);
            }
        }

        return result;
		

	}

}
