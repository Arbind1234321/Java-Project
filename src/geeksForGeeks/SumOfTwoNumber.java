package geeksForGeeks;

public class SumOfTwoNumber {
	static int carry;

	public static void main(String[] args) {
		int a=10;
		int b=22;
		System.out.println(sum(a,b));
		System.out.println(sumUsingIncrement(a, b));
		System.out.println(sumUsingBitWise(a, b));

	}
	public static int sum(int a,int b)
	{
	  return a+b;	
	}
	//sum using increment operator
    public static int sumUsingIncrement(int a,int b)
    {
    	for(int i=0;i<a;i++)
    	{
    		b++;
    	}
    	return b;
    }
//    Read two integers from the user.
//    Use bitwise XOR (^) operator to add the bits of the numbers without carry.
//    Use bitwise AND (&) operator to calculate the carry.
//    Left shift (<<) the carry by one place to add it.
//    Repeat the process until there is no carry.
  //sum using Bitwise  operator
    public static int sumUsingBitWise(int a,int b)
    {
    	
    	
    	while(b!=0) {
    		// Carry is AND of a and b
    		carry = a & b;

            // Sum without carry is XOR of a and b
            a = a ^ b;

            // Carry is shifted by one so that it can be
            // added in the next iteration
            b = carry << 1;
    	}
    	return a;
    }
    
}
