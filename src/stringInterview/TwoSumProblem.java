package stringInterview;

public class TwoSumProblem {

	public static void main(String[] args) {
	int [] arr= {2,3,7,4};
	int target=10;
	int t=0;
	int m=0;
	for(int i=0;i<arr.length-1;i++)//3
	{
		for(int j=i+1;j<arr.length;j++)//7
		{
			if(target==arr[i]+arr[j])
			{
				t=arr[i];
				m=arr[j];
				break;
			}
		}
	}
	System.out.println(t+" "+m);

	}

}
