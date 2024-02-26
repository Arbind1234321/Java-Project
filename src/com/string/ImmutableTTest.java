package com.string;

public class ImmutableTTest {
	private int i;
	

	public ImmutableTTest(int i) {
		this.i = i;
	}
	private ImmutableTTest modify(int i) {
		if(this.i==i)
		{
			return this;//(new ImmutableTTest(i));
		}
		else {
			return (new ImmutableTTest(i));//this;
		}
		
	}

	public static void main(String[] args) {
		ImmutableTTest t1=new ImmutableTTest(10);
		ImmutableTTest t2=t1.modify(100);
		ImmutableTTest t3=t1.modify(10);
		System.out.println(t1==t2);//false
		System.out.println(t1==t3);//true

	}


	

}
