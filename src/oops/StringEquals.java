package oops;

public class StringEquals {
	int roll;
	String name;
	public StringEquals(int roll,String name)
	{
	this.roll=roll;
	this.name=name;
	}
//	public boolean equals(Object obj)
//	{
//	
//		try {
//		String s1=this.name;
//		int r=this.roll;
//		StringEquals s=(StringEquals)obj;
//		String s2=s.name;
//		int r1=s.roll;
//		if(s1.equals(s2) && r==r1)
//		{
//			return true;
//		}
//		else {
//			return false;
//		}
//		}catch(ClassCastException  | NullPointerException e)
//		{
//			return false;
//		}
//		
//	}

//	public boolean equals(Object obj)
//	{
//		try {
//		StringEquals s=(StringEquals)obj;
//		if(name.equals(s.name) && roll==s.roll)
//		{
//			return true;
//		}
//		else
//			return false;
//		}
//		catch(ClassCastException | NullPointerException e)
//		{
//			return false;
//		}
//	}
	
	
	public boolean equals(Object obj)
	{
		if(obj==this)
		{
			return true;
		}
		if(obj instanceof StringEquals)
		{
			StringEquals s=(StringEquals)obj;
			if(name.equals(s.name) && roll==s.roll)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		return false;
		
	}
	public static void main(String[] args) {
		StringEquals s=new StringEquals(101,"Arbind");
		StringEquals s1=new StringEquals(101,"Arbind");
		System.out.println(s.equals(null));

	}

}
