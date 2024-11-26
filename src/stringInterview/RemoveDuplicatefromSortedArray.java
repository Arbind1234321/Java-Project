package stringInterview;

public class RemoveDuplicatefromSortedArray {

	public static void main(String[] args) {
		int a[]= {0,0,1,3,4,5,5,6,7,7,8};//0,1,3,4,5,6,7,8
		int n=a.length;
		int j=0;
		/*for(int i=0;i<n-1;i++)
		{
			if(a[i]!=a[i+1])
			{
			 a[j++]=a[i];	
			}
		}
		a[j++]=a[n-1];*/
		
		int k=0;
		for(int x:a)
		{
			if(k<1|| x>a[k-1])
			{
				a[k++]=x;
			}
		}
		for(int i=0;i<k;i++)
		{
		System.out.print(a[i]+" ");	
		}
		

	}

}
