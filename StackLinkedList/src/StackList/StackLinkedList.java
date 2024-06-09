package StackList;

public class StackLinkedList {
	Node top= null;
	public class Node
	{
		int data;
		Node next;	
		public Node()
		{
			this.data= 0;
			this.next= null;
		}
		public Node(int val)
		{
			this.data= val;
			this.next= null;
		}	
	}
	
	public void push(int val)
	{
		Node newNode = new Node(val);
		if(top ==null)
		{
			System.out.println("First Pushed");
			top= newNode;
		}
		else
		{
			if(top!=null)
			{
				newNode.next = top;
				top= newNode;
				System.out.println("Pushed");
			}
		}
	}
	
	public int pop()
	{
		if(top==null)
		{
			System.out.println("Empty");
			return 0;
		}
		else
		{
			Node temp =top;
			top= temp.next;
			int n= temp.data;
			temp.next= null;
			temp= null;
			System.out.println(n);
			return n;
		}
	}
	public boolean isEmpty()
	{
		if(top==null)
		{
			return true;
		}
		return false;
	}
}
