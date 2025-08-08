package geeksForGeeks;

public class JavaArraysSetJavaArraysSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}public String average(int arr[]) {
    int sum = 0;

        for (int price : arr) {
            sum += price;
        }

        double avg = (double) sum / arr.length;

        
        return String.format("%.2f", avg);
        
        
    }

}
