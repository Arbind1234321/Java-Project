package com.dsa;

public class DLL {
	private Node head;

	public void insertFirst(int value) {
		Node node = new Node(value);
		node.next = head;
		node.prev = null;
		if (head != null) {
			head.prev = node;
		}
		head = node;

	}

	public void display() {
		Node node = head;
		Node last=null;

		while (node != null) {
			System.out.print(node.value + " -> ");
			last=node;
			node = node.next;
		}
		System.out.println("END");
		
	
		
		System.out.println("Printing in reverse");
		while(last != null)
		{
			System.out.print(last.value + " -> ");	
			last=last.prev;
		}
		System.out.println(" START");
	}

//creating node	
	private class Node {
		private int value;
		private Node next;
		private Node prev;

		public Node(int value) {
			this.value = value;
		}

		public Node(int value, Node next, Node prev) {

			this.value = value;
			this.next = next;
			this.prev = prev;
		}

	}
}
