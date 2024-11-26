package com.dsa;

import java.util.ArrayList;
import java.util.LinkedList;

public class MainList {
	private Node head;
	private Node tail;
	private int size;
	public MainList() {
		this.size=0;
	}
	//1.Insert the element at first position of the node
	public void insertFirst(int val) {
		//create the node
		Node node = new Node(val);
		node.next=head;
		head =node;
		if(tail==null)
		{
			tail=head;
		}
		size++;
	} 
	//2.Insert at the last position
	 public void insertLast(int val) {
		 if(tail==null)
		 {
			 insertFirst(val);
			 return ;
		 }
		 Node node =new Node(val);
		 size++;
		 tail.next=node;
		 tail=node;
		 
	 }
	//3.Insert the element at specific position 
	 public void insert(int val, int index) {
		 if(index==0)
		 {
			 insertFirst(val);
			 return ;
		 }
		 if(index==size)
		 {
			 insertLast(val);
			 return ;
		 }
		 Node temp=head;
		for(int i=1;i<index;i++)
		{
			temp=temp.next;
		}
		Node node= new Node( val,temp.next);
		temp.next=node;
		size++;
		 
	 }
	 //1.Delete first element
	 public int deleteFirst() {
		 
		 int val=head.value;
		 
		 head=head.next;
		 
		 if(head==null)
		 {
			 tail=null;
		 }
		 size--;
		 return val;
	 }
	/* //Delete last element Approach 1
	 public int deleteLast()
	 {
		 int val=tail.value;
		 Node temp=head;
		 for(int i=1;i<size-1;i++)
		 {
			 temp=temp.next;
		 }
		 temp.next=null;
		 
		 size--;
		 return val;
		 
	 }*/
	 
	 //Delete last element approach 2 via node 
	 public int deleteLast()
	 {
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
	 public Node get(int index)
	 {
		 Node node=head;
		 for(int i=0;i<index;i++)
		 {
			 node=node.next;
		 }
		 return node;
	 }
//	// Delete particular element  at particular index
//	 public int delete(int index)
//	 {
//		 if(index==0)
//		 {
//			 return deleteFirst();
//		 }
//		 if(index==size-1)
//		 {
//			 return deleteLast();
//		 }
//		 Node prev=get(index-1);
//		 int val=prev.next.value;
//		 prev.next=prev.next.next;
//		 size--;
//		 return val;
//	 } 
	// Delete particular element  at particular index approach 2
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
			Node temp=head;
			for(  int i=1;i< index;i++)
			{
				temp=temp.next;
			}
			int val=temp.next.value;
			temp.next=temp.next.next;
			 size--;
			 return val;
		 } 
		 
	// particular node with value
		 public Node find(int val)
		 {
			 Node node=head;
			 while(node!= null)
			 {
				 if(node.value==val) {
					 return node;
				 }
				 node=node.next;
			 }
			 return null;
		 }
	// Lastly Display the element  on console 
	public void display() {
		Node temp=head;
		while(temp !=null)
		{
			System.out.print(temp.value +" ->");
			temp=temp.next;
		}
		System.out.println("END");
	}
	public int  size()
	{
	 return size;
	
	}
	
	private class Node{
		private int value;
		private Node next;
		
		public Node(int value) {
			this.value=value;
		}
		public  Node(int value,Node next)
		{
			this.value=value;
			this.next=next;
		}
	}

}
