package com.java.CircularLinkedlist;

public class CircularLinkedList {

	Node head=null;
	Node last= null;
	Node slowptr ;
	Node fastptr;
	public class Node{
		int data;
		Node next;
		Node(int val)
		{
			data = val;
			next = null;
		}
		public Node() {
			
		}   }
	
	public boolean addNode(int val,int pos)
	{
		Node newNode = new Node(val);
		if(head== null)
		{
			head = newNode;
			last = newNode;
			newNode.next= head;
		}
		else
		{
			if(pos ==1)
			{
				newNode.next =head;
				head = newNode;
				last.next = head;
				System.out.println("Added !!");
			}
			else
			{
				Node temp = head;
				for(int i = 0;temp!= last && i<pos-2;i++)
				{
					temp = temp.next;
				}
				newNode.next = temp.next;
				temp.next= newNode;
				if(temp == last)
				{
					last = newNode;
				}
				System.out.println("Added !!");
				return true;
			}
		}
		return false;
	}
	
	public void displayData()
	{
		Node temp=head;
		while(temp!= last)
		{
			System.out.print(temp.data+",");
			temp = temp.next;
		}
		System.out.print(temp.data);
		System.out.println("\n-----------------");
	}
	
	public void deleteByPos(int pos)
	{  Node newNode = new Node();
		if (head==null)
		{
			System.out.println("Empty");
		}
		else {
			if(pos== 1)
			{
				if(head == last)
				{
					head= null;
					last= null;
				}
				System.out.println("Deleted !!");
			}
			else {
				Node temp = head;
				Node prev = null;
				for(int i =0; temp!= last && i<pos-1;i++)
				{
					prev = temp;
					temp = temp.next;
				}
				prev.next = temp.next;
				if(temp ==last)
				{
					last = prev;
				}
				 temp.next=null;
				   temp=null;
				   
				   System.out.println("Deleted !!");
			}
		}	
	}
	
	public boolean checkCircular()
	{
		Node slowptr = head ;
		Node fastptr = head;
		
		boolean flag = false;
		while(fastptr!= null) {
		slowptr= slowptr.next;
		fastptr= fastptr.next.next;
		if(slowptr== fastptr) {
			flag= true;
			break;
		}else
			flag = false;
		}
		return flag;
	}
}
