package arbind.BinarySearch;


import java.util.HashSet;

public class RemoveDuplicateFromSorted {

	public static void main(String[] args) {
		int []arr= {1,2,2,3,3,3,3,3,4,4,5,5,5};//2 4 5
		//removeDuplicate(arr);
		duplictaeOnly(arr);
	

	}
	public static void removeDuplicate(int []arr)
	{
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			
			if(i<arr.length-1 && arr[i]==arr[i+1])
			{
				continue;
			}
			else
			{
				arr[count]=arr[i];
				count++;
			}
		}
		for(int i=0;i<count;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
   
	
	public static void duplictaeOnly(int []arr)
	{
		HashSet<Integer> set=new HashSet<>();
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(i<arr.length-1&&arr[i]==arr[i+1])
			{
				set.add(arr[i]);
			}
		}
		System.out.println(set);
	}
}
