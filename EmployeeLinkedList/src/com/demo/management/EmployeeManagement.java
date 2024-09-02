package com.demo.management;

import com.demo.entity.Employee;

public class EmployeeManagement {
	
	Node head;
	public class Node {

		Employee emp;
		Node next;
		
		public Node(Employee emp) {
			super();
			this.emp = emp;
			this.next = null;
		}
		
		public Employee getEmp() {
			return emp;
		}
	}
	
	public boolean addEmployee(Employee emp) {
		
		if(emp == null) {
			return false;
		}
		
		Node newNode = new Node(emp);
		
		if(head == null) {
			head = newNode;
			return true;
		}
		
		Node temp = head;
		
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
		newNode.next= null;
		
		return true;
	}
	
	public void displayEmployees() {
		
		Node temp = head;
		if(head== null) {
			System.out.println("List is Empty !!");
		}
		
		while(temp != null) {
			System.out.println(temp.getEmp());
			temp = temp.next;
		}
	}
	
	public Employee searchEmployee(int id) {
		
		if(head == null) {
			return null;
		}
		
		for(Node temp = head; temp != null; temp = temp.next) {
			if(id == temp.getEmp().getId()) {
				return temp.getEmp();
			}
		}
		return null;
	}
	
	public boolean deleteEmployee(int id ) {
		if(head == null) {
			return false;
		}
		
		Node prev = head;
		Node temp = head.next;
		while(temp != null){
			
			if(id == temp.getEmp().getId()) {
				prev.next = temp.next;
				temp.next= null;
				temp = null;
				return true;
			}
			prev = temp;
			temp = temp.next;
		}
		
		return false;
	}
	
}








