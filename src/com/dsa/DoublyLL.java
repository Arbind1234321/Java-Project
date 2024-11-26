package com.dsa;



public class DoublyLL {
	private Node head;
	
	//insert at first position 
	public void insertFirst(int value)
	{
		Node node = new Node(value);
		
		node.next=head;
		node.prev=null;
		if(head != null)
		{
			head.prev=node;
		}
		head=node;
	}
    //inserting at last node
	public void insertLast(int value)
	{
		Node node=new Node(value);
		Node last=head;
		node.next=null;
		
		if(head == null)
		{
			node.prev=null;
			head=node;
			return;
		}
		while(last.next != null)
		{
			last=last.next;
		}
		last.next=node;
		node.prev=last;
		
	}
   //insert after value
	public void insert(int after,int val)
	{
		Node p=find(after);
		if(p == null)
		{
		  System.out.println("does not exit");
		  return;
		}
		
		Node node=new Node(val);
		
		node.next=p.next;
		p.next=node;
		node.prev=p;
		if(node.next != null) {
			node.next.prev=node;
		}
	}
	
	public Node find(int val) {
		Node node=head;
		while(node !=null)
		{
			if(node.value==val)
			{
				return node;
			}
			node=node.next;
			
		}
		return null;
	}
	
	
	
	//Displaying in data of node
	public void display() {
		Node node = head;
		Node last=null;
		while (node != null) {
			System.out.print(node.value + " -> ");
		     last=node;
			node = node.next;
		}
		System.out.println("END");
		System.out.println("printing in reverse");
	while(last != null)
	{
		System.out.print(last.value +" ->");
		last=last.prev;
	}
	System.out.println("Start");
}
   //displaying data in reverse
	public void revserdisplay()
	{
		Node node=head;
		Node last=null;
		while(node != null)
		{
			last=node;
			node=node.next;
		}
		while(last !=null)
		{
			System.out.print(last.value +" ->");
			last=last.prev;
		}
		System.out.println("Start");
	}

private class Node{
		private int value;
		private Node next;
		private Node prev;
		
		public Node(int value)
		{
			this.value=value;
		}
		public Node(int value, Node next, Node prev) {
			this.value = value;
			this.next = next;
			this.prev = prev;
		}
		
	}

}
