package com.demo.test;

import java.util.Scanner;

import com.demo.entity.Employee;
import com.demo.management.EmployeeManagement;

public class TestManagement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmployeeManagement emanage = new EmployeeManagement();
		
		// Creating  a list of Employees 
			Employee e1 = new Employee(101,"Suzie", 2,"Admin");
			Employee e2 = new Employee(102,"Roxxie", 2,"User");
			Employee e3 = new Employee(103,"Joanne", 2,"Admin");
			Employee e4 = new Employee(104,"Joe", 1,"User");
		
			// adding it to linked list
		emanage.addEmployee(e1);
		emanage.addEmployee(e2);
		emanage.addEmployee(e3);
		emanage.addEmployee(e4);
		
		
		
		int choice;
		do {
			System.out.println("------------------------\n 1.Add Employee\n 2.Display Employee\n "
					+ "3.Search Employee\n 4.Delete Employee");
			System.out.println("Enter your choice :");
		choice= sc.nextInt();
		
		switch(choice) {
	
		case 1:
			System.out.println("Enter id :");
			int id  = sc.nextInt();
			System.out.println("Enter name :");
			String name = sc.next();
			System.out.println("Enter gender : 1.male 2.female");
			int gender  = sc.nextInt();
			System.out.println("Enter role :");
			String role  = sc.next();
			
			Employee emp = new Employee(id,name,gender,role);
			boolean status = emanage.addEmployee(emp);
			if(status) {
				System.out.println("Employee added  !!!");
			}
			else {
				System.out.println("Unable to add Employee !!");
			}	
			break;
			
		case 2:
			emanage.displayEmployees();
			break;
			
		case 3:
			System.out.println("Enter id :");
			id = sc.nextInt();
			Employee foundemp = emanage.searchEmployee(id);
			if(foundemp != null) {
				System.out.println(foundemp);
			}
			else {
				System.out.println("Employee Not Found !!");
			}
			break;
			
		case 4:
			System.out.println("Enter id :");
			id = sc.nextInt();
			status = emanage.deleteEmployee(id);
			if(status) {
				System.out.println("Employee deleted successfully !!");
			}
			else {
				System.out.println("Unable to delete Employee !!");
			}
			break;
		}
	}while(choice!= 0);
		
	}
}
