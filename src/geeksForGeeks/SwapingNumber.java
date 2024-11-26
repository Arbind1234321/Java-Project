package geeksForGeeks;

public class SwapingNumber {

	public static void main(String[] args) {
		int a=2;
		int b=4;
		//swapTemp(a, b);
		//swapWithOutTemp(a, b);
		swapBitwise(a, b);

	}
 //1 Swapping of number using third variable
	public static void swapTemp(int a,int b)
	{
		int temp=a;
		a=b;
		b=temp;
		System.out.println("a :"+a+"   b:"+ b);
	}
	public static void swapWithOutTemp(int a,int b)
	{
		a=a+b;//12
		b=a-b;//5
		a=a-b;//7
		System.out.println("a :"+a+"   b:"+ b);
	}
	public static void swapBitwise(int a,int b)
	{
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("a :"+a+"   b:"+ b);
	}

}
