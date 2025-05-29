package geeksForGeeks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class ArraySubset {

	public static void main(String[] args) {
		int[] a = { 1,2,2};
		int[] b = {1,1};
		System.out.println(isSubset2(a, b));

	}

	public static boolean isSubset2(int a[], int b[]) {
		HashMap<Integer, Integer> map=new HashMap<>();

		for (int x : a) {
			map.put(x, map.getOrDefault(x,0)+1);
		}
		for (int y : b) {
			if (!map.containsKey(y) || map.get(y)==1) {
				return false;
			}
			 map.put(y, map.get(y) - 1);
		}
		return true;

	}
	public static boolean isSubset1(int a[], int b[]) {
		HashSet<Integer> set = new HashSet<>();

		for (int x : a) {
			set.add(x);
		}
		for (int y : b) {
			if (!set.contains(y)) {
				return false;
			}
		}
		return true;

	}

	public static boolean isSubset(int a[], int b[]) {
		ArrayList<Integer> list = new ArrayList<>();
		for (int x : b) {
			list.add(x);
		}
		for (int y : a) {
			if (list.contains(y)) {
				list.remove(Integer.valueOf(y));
			}
		}
		if (list.isEmpty()) {
			return true;
		} else {
			return false;
		}

	}
}
