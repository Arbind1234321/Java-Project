package com.arbind;

public class ArbindPattern {

	public static void main(String[] args) {
	 int n=5;
	 pattern10(n);

	}
	public static void pattern1(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void pattern2(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void pattern3(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i+1;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void pattern4(int n) 
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)//
			{
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void pattern5(int n)
	{
		for(int i=1;i<=n;i++)
		{
			int a=1;
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++)
			{
				if(j>=i)
				{
					System.out.print(a--+"");
				}else {
					System.out.print(a++ +"");
				}
				
			}
			System.out.println();
		}
	}
    public static void pattern6(int n)
{
	int a=1;
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(a+" ");
			a+=2;
		}
		System.out.println();
	}
}

    public static void pattern7(int n)
    {
    	for(int i=0;i<=n;i++)
    	{
    		for(int j=1;j<=i;j++)
    		{
    			if((i+j)%2==0)
    			{
    				System.out.print("1");
    			}
    			else
    				System.out.print("0");
    		}
    		System.out.println();
    	}
    }
    public static void pattern8(int n)
    {
    	for(int i=1;i<=n;i++)
    	{
    		for(int j=1;j<=n-i+1;j++)
    		{
    			System.out.print(j+" ");
    		}
    		System.out.println();
    	}
    }
    public static void  pattern9(int n)
    {
    	for(int i=1;i<=n;i++)
    	{
    		for(int j=1;j<=n-i;j++)
    		{
    			System.out.print(" ");
    		}
    		for(int j=1;j<=2*i-1;j++)
    		{
    			System.out.print(j);
    		}
    		System.out.println();
    	}
    }
    public  static void pattern10(int n)
    {
    	
    	for(int i=1;i<=n;i++)
    	{
    		int a=i;
    		for(int j=1;j<=n-i;j++)
    		{
    			System.out.print(" ");
    		}
    		for(int j=1;j<=2*i-1;j++)
    		{
    			if(i>=j)
    			{
    				System.out.print(a+"");
    				a--;
    			}
    			else {
    				System.out.print(j-i+1+"");
    			}
    			
    		}
    		System.out.println();
    	}
    }
    public static void pattern11(int n)
    {
    	for(int i=1;i<=n;i++)
    	{
    		int a=i;
    		for(int j=1;j<=n-i;j++)
    		{
    			System.out.print(" ");
    		}
    		for(int j=1;j<=i;j++)
    		{
    			System.out.print(a);
    			a--;
    		}
    		int p=2;
    		for(int j=1;j<i-1;j++)
    		{
    			System.out.print(p);
    			p++;
    		}
    		System.out.println();
    	}
    }








}
