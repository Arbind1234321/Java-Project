package geeksForGeeks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FrequenciesinaLimitedArray {

	public static void main(String[] args) {
		int[] arr = { 3, 3, 3, 3 };
		frequencyCount(arr);
	}

	public static List<Integer> frequencyCount(int[] arr) {
		ArrayList<Integer> list = new ArrayList<>();
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int a : arr) {
			map.put(a, map.getOrDefault(a, 0) + 1);
		}

		for (int i = 1; i <= arr.length; i++) {
			if (map.containsKey(i)) {
				list.add(map.get(i));
			} else {
				list.add(0);
			}
		}

		return list;

	}

}
