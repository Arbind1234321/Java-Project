package java8;

import java.util.function.Function;

public class Demo 
{
	
	public static void main(String[] args) {
		 Function<Integer, Integer> f=i->i*i;
		 for(int i=1;i<10;i++)
		 {
			 System.out.println(i+"--->"+f.apply(i));
		 }
	}

}
