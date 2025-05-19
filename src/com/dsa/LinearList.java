package com.dsa;



public class LinearList 
{
	private Node head;
	private Node tail;
	private static int size;
	
	public LinearList()
	{
		this.size=0;
	}
	
//Create a method to add at first position of the node.	public 
	
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
//Insert at last position
	public void insertLast(int val)
	{
		
		if(tail==null)
		{
			insertFirst(val);
			return;
			
		}
		Node node =new Node(val);
		tail.next=node;
		tail=node;
		size++;
		
	}
//Insert At particular postion
	public void insert(int val,int index)
	{
		if(index>size||index<0)
		{
			throw new IndexOutOfBoundsException("Index " + index + " is out of bounds! It must be between 0 and " + size);
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
		Node node =new Node(val,temp.next);
		temp.next=node;
		size++;
	}
	
	//Removing element from the list 
	public int deleteFirst() {
		int val=head.value;//capturing head value
		head=head.next;// moving head to next element
		if(head==null)//checking head is null or not if then tail  must be also null i.e only one element in list
		{
			tail=null;
		}
		size--;
		return val;
	}
	
//Removing last element of list(my own method)
//	public int deleteLast() {
//		Node temp=head;
//		for(int i=1;i<size-1;i++)
//		{
//			temp=temp.next;
//		}
//		int val=temp.next.value;
//		temp=tail;
//		tail.next=null;
//		
//		size--;
//		return val;
//	}
	
//Removing last element from the  list
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
//Delete at particular element of the list
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
	
//Get the node of element
	public Node get(int index)
	{
		Node node=head;
		for(int i=0;i<index;i++)
		{
			node=node.next;
		}
		return node;
	}
	
	
//find the node for the given value
	public Node find(int value)
	{
		Node node=head;
		while(node!=null)
		{
			if(node.value==value)
			{
				return node;
			}
			node=node.next;
		}
		return null;
	}
	//for displaying list of all element
	public void display() {
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.value+"-->");
			temp=temp.next;
		}
		System.out.println("End");
	}
	
	// return the size of linear link list;
	public int sizeOfList()
	{
		return size;
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
