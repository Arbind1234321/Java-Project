package com.string;

public class Immutable {
	
	private int i;
   public Immutable(int i)
   {
	   this.i=i;
   }
   private Immutable modify(int i)
   {
	   if(this.i==i)
		   return this;
	   else 
		   return new Immutable(i);
   }
   public static void main(String[] args) {
	Immutable t=new Immutable(10);
	Immutable t1=t.modify(10);
	Immutable t2=new Immutable(10);
	System.out.println(t.hashCode());
	System.out.println(t1.hashCode());
	System.out.println(t==t1);
	
}

}
