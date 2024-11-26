package com.dsa;

public class LLMain {

	public static void main(String[] args) {
	LinkedListDemo1 list=new LinkedListDemo1();
	list.insertFirst(3);
	list.insertFirst(6);
	list.insertFirst(8);
	list.insertFirst(12);
	list.insertLast(44);
	list.insert(66, 3);
	list.display();
    System.out.println(list.delete(2));
	System.out.println(list.find(8));
	list.display();
	
	

	}

}
