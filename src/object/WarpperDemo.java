package object;

public class WarpperDemo {

	public static void main(String[] args) {
		//String s=Integer.toString(10);

		//System.out.println(Integer.valueOf("1110", 4));
		//boolean b=Boolean.parseBoolean(true);
		//System.out.println();
//       int a =Integer.parseInt("10");//String to primitive
//       Integer b =Integer.valueOf(10);//primitive to  wrapper
//       Integer c=new Integer(10);
//         c.toString();//object to string
//         Integer d=Integer.valueOf(10);
//         int f=d.intValue();//wrapper to primitive
//        
      // System.out.println(sum(2,3,3,1));
       
       //Long i=10L;
       //
		//Integer a= 10;
		// int a=10;
		 ///String b="10";
		 //System.out.println(a==Integer.parseInt(b));//int to String --->parseInt(String s)
		
	  String s=new String("Arbind");
	  String s1=new String("Arbind");
	  System.out.println(s.equals(s1));
	  System.out.println(s.hashCode()==s1.hashCode());
	  
		 
	}

	
	public static  int sum(int...x)
	{
		int sum=0;
		for(int a:x)
		{
			sum=sum+a;
		}
		return sum;
	}
}
