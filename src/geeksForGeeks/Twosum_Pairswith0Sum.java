package geeksForGeeks;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Twosum_Pairswith0Sum {

	public static void main(String[] args) {
		int []arr={-1, 0, 1, 2, -1, -4};
		System.out.println(getPairs(arr));

	}
	public static ArrayList<ArrayList<Integer>> getPairs(int[] arr) {
		Set<Integer> seen = new HashSet<>();

        // TreeSet to store sorted and unique pairs
        Set<ArrayList<Integer>> result = new TreeSet<>(
            Comparator.comparing((ArrayList<Integer> a) -> a.get(0))
                      .thenComparing(a -> a.get(1))
        );

        for (int num : arr) {
            int neg = -num;
            if (seen.contains(neg)) {
                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(Math.min(num, neg));
                pair.add(Math.max(num, neg));
                result.add(pair);  // TreeSet ensures uniqueness and order
            }
            seen.add(num);
        }

        return new ArrayList<>(result);
        
    }

}
