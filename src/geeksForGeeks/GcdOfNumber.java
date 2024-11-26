package geeksForGeeks;

public class GcdOfNumber {

	public static void main(String[] args) {
	// System.out.println(gcd(24,36,48));
	 //System.out.println(gcdEculidian(24,56));
	 System.out.println(gcdrec(34,68));
	}
	public static int gcd(int a,int b ,int c)
	{
		int result=Math.min(a, Math.min( b,c));
		while(result>0)
		{
			if(a%result==0 && b%result==0 && c%result==0)
			{
				break;
			}
			result--;
		}
		return result;
	}
  //trough recursive call
	public static int gcdEculidian(int a,int b )
	{
		if(a==0)
			return b;
		if(b==0)
			return a;
		if(a>b)
			return gcdEculidian(a-b,b);
		else
			return gcdEculidian(a,b-a);
	}
  // using eculidian concept
	public static int gcdrec(int a,int b)
	{
		if(a==0)
			return b;
		return gcdrec(b%a, a);
	}
	
}
