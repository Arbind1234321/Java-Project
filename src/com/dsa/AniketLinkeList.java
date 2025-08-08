package com.dsa;

public class AniketLinkeList {
	private  Node head;
	private Node tail;
	private int size;
	//constructor 
	public AniketLinkeList() {
		this.size=0;
	}
	
	//Inssert at particular index
	public void insertAt(int value,int index)
	{
		if(index<0 ||index>size)
		{
		 throw new IndexOutOfBoundsException("out of index");
		}
		if(index==0)
		{
			addFirst(value);
			return ;
		}
		if(size==index)
		{
			addLast(value);
			return;
		}
		Node temp=head;
		for(int i=1;i<index;i++)
		{
			temp=temp.next;
		}
		Node node=new Node(value,temp.next);
		temp.next=node;
		size++;
	}
	//AddFirst
	public  void addFirst(int value)
	{
		Node node=new Node(value);
		node.next=head;
		head=node;
		if(tail==null)
		{
			tail=head;
		}
		size++;
	}
	
	//insset at last
	public void addLast(int value)
	{
		if(tail== null)
		{
			addFirst(value);
			return;
		}
		Node node=new Node(value);
	    tail.next=node;
	    tail=node;
	    size++;
			  
		
	}
	public void insertFirst(int value)
	{
		Node node =new Node(value);
		node.next=head;
		head=node;
		//for  checking both head and tail pointing to same position or not
		if(tail==null)
		{
			tail=head;
		}
		size++;
	}
	//display data
	public void display() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.value+ " -> ");
			temp=temp.next;
		}
		System.out.println("END");
		
		
	}
	// node class 
	class Node{
		private int value;
		private Node next;
		
		public Node() {
			
		}
		public Node(int value)
		{
			this.value=value;
		}
		public Node(int value,Node next)
		{
			this.value=value;
			this.next=next;
		}
	}

}
