package com.dsa;

public class Main {

	public static void main(String[] args) {
//		LinearList list=new LinearList();
//		list.insertFirst(14);
//		list.insertFirst(28);
//		list.insertFirst(32);
//		list.insertLast(99);
//		list.insertFirst(56 );
//		list.display();
//		list.insert(100, 3);
//	    list.display();
//	   // System.out.println(list.deleteFirst());
//	   // System.out.println(list.deleteLast());
//	    System.out.println(list.delete(2));
//	    list.display();
//		DoublyLink list=new DoublyLink();
//		list.insertFirst(3);
//		list.insertFirst(33);
//		list.insertFirst(74);
//		list.insertFirst(45);
//		//list.display();
//		list.insertLast(14);
//		list.insert(2, 99);
//		list.display();
//		System.out.println(list.deleteFirst());
//		list.display();
//		
//		//list.reverse();
//		

		CircularLink list=new CircularLink();
		list.insert(3);
		list.insert(5);
		list.insert(7);
		list.insert(9);
		list.display();
		list.delete(5);
		list.display();
	}

}
