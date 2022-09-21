package com.bridgelabz;

public class Stack {
	LinkedList list = new LinkedList();

	public void push(Object data) {
		list.addFirst(data);
	}

	public void display() {
		// TODO Auto-generated method stub
			list.display();
		}
}
