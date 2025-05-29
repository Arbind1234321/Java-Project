package geeksForGeeks;

public class MinimumJumps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {1 ,2 ,0, 0 ,0};
		System.out.println(minJumps(arr));

	}

	public static int minJumps(int[] arr) {
		int totaljumps=0;
		int destination=arr.length-1;
		int coverage=0;
		int lastjump=0;
		if(arr.length==1)
		{
		return 0;
		}
		if(arr[0]==0) return -1;
		for(int i=0;i<arr.length;i++)
		{
			coverage=Math.max(coverage, i+arr[i]);
			if(i==lastjump)
			{
				if (coverage == lastjump) {
                    
                    return -1;
                }
				lastjump=coverage;
				totaljumps++;
				if(coverage>=destination)
				{
					return totaljumps;
				}
			}
		}

		return totaljumps;
	}

}
