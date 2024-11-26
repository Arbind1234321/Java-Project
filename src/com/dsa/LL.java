package com.dsa;

public class LL 
{
	private Node head;
	private Node tail;
	private int size;
	public LL()
	{
		this.size=0;
	}
	// inserting at first position
	public void  addFirst(int value) {
		Node node=new Node(value);
		node.next=head;
		head=node;
		if(tail==null)
		{
			tail=head;
		}
		size++;
	}
	//Adding to last of the node
	public void addLast(int value)
	{
	   if(tail==null)
	   {
		   addFirst(value);
		   return ;
	   }
	   Node node= new Node(value);
	   tail.next=node;
	   tail=node;
	   size++;
	}
	//inserting the value at given index
	public void insertAtGivenIndex(int value,int index)
	{
		if(index==0)
		{
			addFirst(value);
			return ;
		}
		if(index==size)
		{
			addLast(value);
		}
		Node temp=head;
		for(int i=1;i<index;i++)
		{
			temp = temp.next;
		}
		Node node=new Node(value,temp.next);
		temp.next=node;
		size++;
	}
	//Delete first element of linked list
	public int deleteFirstIndex()
	{
	int value=head.value;
	head=head.next;
	if(head==null)
	{
		tail=null;
	}
	size--;
	return value;
	}
	//delete last element in list
	public int deleteLastElement() {
		if(size<=1)
		{
			return deleteFirstIndex();
		}
		Node secondlast=get(size-2);
		int value=tail.value;
		tail=secondlast;
		tail.next=null;
		size--;
		return value;
		
	}
	// deleting  specific element at given element
	public int deleteAtIndex(int index) {
		if(index==0)
		{
			return deleteFirstIndex();
		}
		if(index == size-1)
		{
			return deleteLastElement();
		}
		Node prev=get(index-1);
		int value=prev.next.value;
		
		prev.next=prev.next.next;
		size--;
		return value;
	}
	public Node findElement(int value )
	{
	  Node node=head;
	  while(node != null)
	  {
		  if(node.value==value)
		  {
			  return node;
		  }
		  node= node.next;
	  }
	  return null; 
	}
	
	public Node get(int index)
	{
		Node node=head;
		for(int i=0;i<index;i++) {
			node=node.next;
		}
		return node;
	}
	
	public void display() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.value+ " -> ");
			temp=temp.next;
		}
		System.out.println("END");
		
		
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







