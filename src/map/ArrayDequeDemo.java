package map;

import java.util.ArrayDeque;

public class ArrayDequeDemo {

	public static void main(String[] args) {
		ArrayDeque<Integer> dq=new ArrayDeque<>();
		dq.add(1);
		dq.add(2);
		dq.add(3);
		dq.add(4);
		dq.add(5);
		dq.add(6);
		System.out.println(dq);
		System.out.println(dq.peekFirst());
		System.out.println(dq);
		

	}

}
