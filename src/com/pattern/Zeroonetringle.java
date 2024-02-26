package com.pattern;

public class Zeroonetringle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		int a;
		//approach 1
		/*for(int i=1;i<=n;i++)
		{
			if(i%2!=0)a=1;
			else a=0;
			for(int j=1;j<=i;j++)
			{
				System.out.print(a);
				//if(a==0) a=1;
				//else a=0;
				if(a==1)a=0;
				else a=1;
			}
			System.out.println();
		}*/
      //Approach 2
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if((i+j)%2==0)
				{
					System.out.print("1");
				}
				else {
					System.out.print("0");
				}
				
			}
		  System.out.println();
		}

	}

}
