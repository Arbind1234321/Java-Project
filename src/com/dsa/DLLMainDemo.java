package com.dsa;

public class DLLMainDemo {

	public static void main(String[] args) {
		DoublyLL list=new DoublyLL();
		list.insertFirst(3);
		list.insertFirst(2);
		list.insertFirst(9);
		list.insertFirst(17);
		list.insertLast(99);
		list.insert(9, 88);
		list.display();
		
		

	}

}
