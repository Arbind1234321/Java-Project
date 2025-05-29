package geeksForGeeks;

import java.util.ArrayList;

public class PascalTriangle {

	public static void main(String[] args) {

	}

	public static ArrayList<Integer> nthRowOfPascalTriangle(int n) {

	    ArrayList<Integer> row = new ArrayList<>();
	    row.add(1); // First element is always 1

	    long value = 1;
	    for (int k = 1; k < n; k++) {
	        // Compute next value using the formula: C(n-1, k) = C(n-1, k-1) * (n - k) / k
	        value = value * (n - k);
	        value = value / k;
	        
	        row.add((int)value);
	    }

	    return row;
	}

}
