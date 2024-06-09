package Queue;

public class Queue {
	
	Node front=null;
	Node rear=null;
	class Node{
		int data;
		Node next;
		public Node(int val)
		{
			data = val;
			next= null;
		}
	}
	public boolean isEmpty()
	{
		if(front == null)
		{
			System.out.println("Queue Empty");
			return true;
		}
		return false;
	}
	
	public void enqueue(int val)
	{   Node newNode = new Node(val);
		if(isEmpty())
		{
			rear = newNode;
			front = newNode;
		}
		else{
			rear.next = newNode;
			rear = newNode;
		}
		System.out.println("Added");
	}
	
	public int dequeue()
	{
		if(!isEmpty())
		{int n = front.data;
			if(front == rear)
			{
				front = null;
				rear = null;
			}
			else {
				Node temp = front;
				front = front.next;
				temp.next= null;
				temp = null;
			}
			System.out.println("Deleted");
			return n;
		}
		return -1;
		
	}
	public void peek()
	{
		Node temp= front;
		for(;temp!=null;temp=temp.next)
		{System.out.print(temp.data+",");
			}
		System.out.println("--------------------");
	}
	
	
}
