package seleniumprogram;
//counting frequency of a number without using map
public class FrequencyOfNumberInArray {

	public static void main(String[] args) {
		int [] arr= {2,2,2,33,3,4,4};
		for(int i=0;i<arr.length;i++)
		{
			int x=arr[i];
			int count=0;
			if (x==-1) continue;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[j]==x)
				{
					count ++;
					arr[j]=-1;
				}
			}
			System.out.println("The frequency of "+x+" is--> "+count);
		}

	}

}
