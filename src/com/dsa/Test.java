package com.dsa;

public class Test {
	public static void main(String[] args) {
		MainList list=new MainList();
	//	LinkedListDemo1 list=new LinkedListDemo1();
		list.insertFirst(3);
		list.insertFirst(5);
		list.insertFirst(8);
		list.insertFirst(12);
		list.insertLast(19);
		list.insert(99, 3);
		list.insertFirst(27);
		list.insertFirst(24);
		list.display();
		
		System.out.println(list.find(1));
		list.display();
	}

}
