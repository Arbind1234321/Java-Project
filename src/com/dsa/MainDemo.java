package com.dsa;

public class MainDemo {

	public static void main(String[] args) {
		SinglyLinkedList list=new SinglyLinkedList();
		list.insertFirst(3);
		list.insertFirst(2);
		list.insertFirst(8);
		list.insertFirst(17);
		list.insertLast(77);
		list.insert(100, 3);
//		list.display(); 
//	    System.out.println(	list.deleteFirst());
		//System.out.println(list.sizeL());
		list.display();
		System.out.println(list.deleteLast());
        list.display();	
        System.out.println(list.delete(3));
        list.display();
        System.out.println(list.find(5));
		

	}

}
