package com.kodnest.queues;

import java.util.ArrayList;
import java.util.Scanner;

class MyQueue{
	
ArrayList<Integer>	al=new ArrayList<Integer>();
	void enque(int ele) {
		al.add(ele);
		System.out.println(ele +" Enque Success");
		
	}
	
	void deque() {
		if(al.isEmpty()) {
		   System.out.println("Queue is Empty");
		}else {
		Integer r = al.remove(0);
		System.out.println(r +" Deque Success");
		}
	}
	
	void peek() {
		if(al.isEmpty()) {
			System.out.println("Queue is Empty");
		}else {
		System.out.println(al.get(0));
		}
	}
	
	
	void display() {
		if(al.size()==0) {
			System.out.println("Queue is Empty");
		}else {
		System.out.println(al);
	}
	}
	
}

public class Main {
	public static void main(String[] args) {
		System.out.println("Hello User! Wlecome into Queue");
		
		MyQueue mq = new MyQueue();
		Scanner scan = new Scanner(System.in);
		try {
			
		while(true) {
			System.out.println("Press 1 for enque()");
			System.out.println("Press 2 for deque()");
			System.out.println("Press 3 for peek()");
			System.out.println("Press 4 for display()");
			System.out.println("Press 5 for exit");
			

			int option= scan.nextInt();
			
			switch(option) {
			case 1:
				System.out.println("Enter the element to be Enque");
				int ele=scan.nextInt();
				mq.enque(ele);
				break;
				
			case 2:
				mq.deque();
				break;
				
			case 3:
				mq.peek();
				break;
				
			case 4:
				mq.display();
				break;
			case 5:
				System.exit(0);
				break;
				
				default:
					System.out.println("Please Enter a valid Input");
				
				
			}
		
		}
		} finally {
			scan.close();
		}
	}

}
