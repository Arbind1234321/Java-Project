package com.dsa;

public class MainCLL {

	public static void main(String[] args) {
		
		CircularList list=new CircularList();
		list.insert(4);
		list.insert(8);
		list.insert(5);
		list.insert(100);
		list.display();
		list.delete(0);
		list.display();
		

	}
	
	

}
