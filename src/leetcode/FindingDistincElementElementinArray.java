package leetcode;

public class FindingDistincElementElementinArray {

	public static void main(String[] args) {
	int  a[]= {1,2,1,3,2,3,6};
	int value=0;
	for(int i=0;i<a.length;i++)
	{
		value=value^a[i];
	}
	System.out.println(value);

	}

}
