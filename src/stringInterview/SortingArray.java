package stringInterview;

public class SortingArray {

	public static void main(String[] args) {
	int [] a= {1,5,7,0,55,9,88,6,3};
	int n=a.length;
	for(int i=0;i<n;i++)
	{
		for(int j=i+1;j<n;j++)
		{
		 if(a[i]> a[j])
		 {
			 int temp=a[i];
			 a[i]=a[j];
			 a[j]=temp;
		 }
		}
	}
    for(int i=0;i<n;i++)
    {
    	System.out.print(a[i]+" ");
    }
	
	}

}
