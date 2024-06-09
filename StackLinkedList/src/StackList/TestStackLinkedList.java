package StackList;

public class TestStackLinkedList {
	public static void main(String[] args) {
		
		StackLinkedList sll = new StackLinkedList();
		sll.push(5);
		sll.push(4);
		sll.push(3);
		sll.push(2);
		sll.push(1);
		
		for(int i=0;i<5;i++)
		sll.pop();
		
		boolean isEmpty= sll.isEmpty();
		
		if(isEmpty)
			System.out.println("Empty List");
		else
			System.out.println("List Not Empty");
	}
}
