package com.dsa;

public class LinkedListDemo1 {
	private Node head;
	private Node tail;
	private int size;
	public LinkedListDemo1()
	{
		this.size=0;
	}
	//inserting first element 
	public void insertFirst(int val)
	{
		Node node=new Node(val);
		node.next=head;
		head=node;
		if(tail==null)
		{
			tail=head;
		}
		size++;
	}
	//insert at last
	public void insertLast(int val) {
		if(tail==null)
		{
			insertFirst(val);
			return;
		}
		Node node=new Node(val);
		tail.next=node;
		tail=node;
		size++;
	}
	//inserting at particular index
	public void insert(int val,int index)
	{
		if(index>size||index<0)
		{
			 throw new NullPointerException("Not able to insert this value");  
		}
		if(index==0)
		{
			insertFirst(val);
			return;
		}
		if(index==size)
		{
			insertLast(val);
			return;
		}
		Node temp=head;
		for(int i=1;i<index;i++)
		{
			temp=temp.next;
		}
		Node node=new Node(val,temp.next);
		
		temp.next=node;
		size++;
	}
	// delete first element 
	public int deleteFirst()
	{
	
		int val=head.value;
		head=head.next;
		if(head==null) {
			tail=null;
		}
		size--;
		return val;
	}
	//Delete last element approach 1 
	/*public int  deleteLast()
	{
		if(size<=1)
		{
			
			return deleteFirst();
		}
	  Node temp=head;
	  int val=tail.value;
	  for(int i=0;i<size-2;i++)
	  {
		  temp=temp.next;
	  }
	  temp.next=null;
	  size--;
	  return val;
	}*/
	//Delete last element approach 2
	public int deleteLast() {
		if(size<=1)
		{
			return deleteFirst();
		}
		int val=tail.value;
		Node secondLast=get(size-2);
		tail=secondLast;
		tail.next=null;
		size--;
		return val;
	}
	//delete at particular index approach 1
	/*public int delete(int index)
	{
		if(index==0)
		{
			return deleteFirst();
		}
		if(index==size-1)
		{
			return deleteLast();
		}
		Node temp=head;
		for(int i=1;i<index;i++)
		{
			temp=temp.next;
		}
		int  val=temp.next.value;
		temp.next=temp.next.next;
		size--;
		return val;
		
	}*/
	//delete at particular  index approach 2
	public int delete(int index)
	{
		if(index==0)
		{
			return deleteFirst();
		}
		if(index==size-1)
		{
			return deleteLast();
		}
		Node prev=get(index-1);
		int val=prev.next.value;
		prev.next=prev.next.next;
		size--;
		return val;
	}
	//search particular node with value
	public Node find(int value) {
		Node node=head;
		while(node !=null)
		{
			if(node.value==value)
			{
				return node;
			}
			node=node.next;
			
		}
		return null;
	}
	//for getting the particular node 
	public Node get(int index)
	{
		Node node=head;
		for(int i=0;i<index;i++)
		{
			node=node.next;
		}
		return node;
	}
	// display the list
	public void display() {
	   Node temp=head;
	   while(temp !=null)
	   {
		   System.out.print(temp.value+" ->");
		   temp=temp.next;
	   }
	   System.out.println("End");
	}
	
	private class Node{
		private int value;
		private Node next;
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
