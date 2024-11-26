package com.dsa;

public class LLDemo {

	public static void main(String[] args) {
	LL list=new LL();
	list.addFirst(2);
	list.addFirst(4);
	list.addLast(99);
	list.addFirst(10);
	list.insertAtGivenIndex(20,2);
	list.display();
	//System.out.println(list.deleteLastElement());
	System.out.println(list.deleteAtIndex(2));
	list.display();

	}

}
