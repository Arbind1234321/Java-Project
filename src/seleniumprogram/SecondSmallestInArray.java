package seleniumprogram;

public class SecondSmallestInArray {
	public static void main(String[] args) {
		int [] arr= {2,4,0,1,66};
		int fs=arr[0];
		int ss=arr[1];
		for(int i=1;i<arr.length;i++)
		{
			System.out.println(i+" "+ss+" "+fs);
			if(fs>arr[i])
			{
				ss=fs;
				fs=arr[i];
			}
			else if(ss>arr[i])
			{
				ss=arr[i];
			}
		}
		System.out.println(ss);
	}

}
