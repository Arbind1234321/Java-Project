package com.dsa;

public class CircularList {
	private Node head;
	private Node tail;
	public CircularList() {
		this.head=null;
		this.tail=null;
	}
	//insert
	public void insert(int val) {
		Node node=new Node(val);
		if(head==null)
		{
			head=node;
			tail=node;
		}
		tail.next=node;
		node.next=head;
		tail=node;
	}
	//delete
	public void delete(int val) {
		Node node=head;
		if(node==null)
		{
			return;
		}
		if(node.value==val)
		{
			head=head.next;
			tail.next=head;
			return;
		}
		
			do {
				Node n=node.next;
				if(n.value== val)
				{
					node.next=n.next;
					break;
				}
				node = node.next;
			}while(node != head);
	
	}
	//display
	public void display()
	{
		Node node=head;
		if(node==null)
		{
			return; 
		}
		if(head != null)
		{
			do {
				System.out.print(node.value+" ->");
				node=node.next;
			}while(node !=head);
		}
		System.out.println("HEAD");
	}

	private class Node{
		private int value;
		private Node next;
		public Node(int value) {
			this.value=value;
		}
	}
}




