package geeksForGeeks;

public class EquilibriumPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {1, 2, 0, 3};

	}
	public static int findEquilibrium(int arr[]) {
		int totalsum=0;
		int leftsum=0;
		for(int a:arr)
		{
			totalsum+=a;
		}
		for(int i=0;i<arr.length;i++)
		{
			totalsum -=arr[i];
			if(leftsum==totalsum)
			{
				return i;
			}
			leftsum=leftsum+arr[i];
		}
		
		
        return -1;
        
    }

}
