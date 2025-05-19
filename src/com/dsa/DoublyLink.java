package com.dsa;

public class DoublyLink {
	private Node head;
	
	//Inserting the first element in the list
	public void insertFirst(int val) {
		
		Node node=new Node(val);
		node.next=head;
		node.prev=null;
		if(head!=null)
		{
			head.prev=node;
		}
		head=node;
		
	}
// Inserting element at last of the node
   public  void insertLast(int val) {	
	   Node node = new Node(val);
	   Node last=head;
	   node.next=null;
	   if(head==null)
	   {
		   node.prev=null;
		   head=node;
		   return;
	   }
	   while(last.next!=null)
	   {
		   last=last.next;
	   }
	   
	   last.next=node;
	   node.prev=last;
   }
//Insert after the value
   
   public void insert(int after,int val) {
	   Node p=find(after);
	   
	   if(p==null)
	   {
		   System.out.println("Not exist");
		   return ;
	   }
	   Node node = new Node(val);
	   node.next=p.next;
	   p.next=node;
	   node.prev=p;
	   if(node.next!=null)
	   {
		   node.next.prev=node;
	   }
   }
   
   //Delete first of the list
   public int deleteFirst() {
	   int val=head.value;
	   head=head.next;
	   head.prev=null;
	   return val;
   }
   
   public Node find(int val) {
	   Node node=head;
	   while(node!=null)
	   {
		   if(node.value==val)
		   {
			   return node;
		   }
		   node=node.next;
	   }
	   return null;
   }
   
   
   
//for displaying element of the list
	public void display() {
		Node node=head;
		Node last=null;
		System.out.println("Normal order of the list");
		while(node!=null)
		{
			last=node;
			System.out.print(node.value+"->");
			node=node.next;
		}
		System.out.println("END");
		System.out.println("Reverse order of list");
		while(last!=null)
		{
			System.out.print(last.value+"->");
			last=last.prev;
		}
		System.out.println("START");
	}
//void displaying in reversse order
	public void reverse() { 
		Node node=head;
		Node last=null;
		while(node!=null)
		{
			last=node;
			node=node.next;
		}
		while(last!=null)
		{
			System.out.print(last.value+"->");
			last=last.prev;
		}
		System.out.println("START");
	}
	
		private class Node{
		private int value;
		private Node next;
		private Node prev;
		public Node (int value)
		{
			this.value=value;
		}
		public Node(int value, Node next, Node prev) {
			super();
			this.value = value;
			this.next = next;
			this.prev = prev;
		}
		
	}

}
