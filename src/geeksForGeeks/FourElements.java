package geeksForGeeks;

public class FourElements {
	public static void main(String[] args) {
		int N = 6 ;
				int A[] = {1, 5, 1, 0, 6, 0};
				int X = 7;
				System.out.println(find4Numbers(A, N, X));
	//8
	//			1 4 2 6 3 8 5 9
	//			20
				
	}
	 public static boolean find4Numbers(int A[], int n, int X) {
		 for (int i = 0; i < n - 3; i++) {
	            for (int j = i + 1; j < n - 2; j++) {
	                for (int k = j + 1; k < n - 1; k++) {
	                    for (int l = k + 1; l < n; l++) {
	                        if (A[i] + A[j] + A[k] + A[l] == X) {
	                            return true;
	                        }
	                    }
	                }
	            }
	        }
	        return false;
		 
	 }

}
