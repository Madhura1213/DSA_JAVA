package com.java.test;
import com.java.CircularLinkedlist.*;
public class TestCircularLinkedList {

	public static void main(String[] args) {
		
	
	CircularLinkedList cll = new CircularLinkedList();
	System.out.println("Adding Elements...");
		cll.addNode(5,1);
		cll.addNode(10, 2);
		cll.addNode(14, 3);
		cll.addNode(54, 4);
		cll.addNode(100,5);
		
		cll.displayData();
		
		cll.deleteByPos(5);
		cll.displayData();  
		
		System.out.println("Linked list Type: ");
		boolean status = cll.checkCircular();
		
		if(status) {
			System.out.println("Circular");
		}else   {
			System.out.println("Not Circular");
		}
			
}
}