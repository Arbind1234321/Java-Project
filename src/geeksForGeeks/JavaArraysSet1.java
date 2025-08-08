package geeksForGeeks;

public class JavaArraysSet1 {

	public static void main(String[] args) {
		int arr[] = {2, 55, 85, 656, 52, 554, 545, 5, 2};
		System.out.println(average1(arr));
	}
	public static String average1(int arr[]) {
		int sum = 0;

        for (int price : arr) {
            sum += price;
        }

        double avg = (double) sum / arr.length;

        // Format to 2 decimal places and return as string
        return String.format("%.2f", avg);
	}
	public static  String average(int arr[]) {
        int sum=0;
        for(int a:arr)
        {
        	sum+=a;
        }
        int last= sum%100;
        System.out.println(last);
        
        double d=sum/arr.length;
        
        return d+"";
        
    }

}
