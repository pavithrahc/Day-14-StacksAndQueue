package com.bridgelabz;

public class Queue {
	LinkedList list = new LinkedList();

	public void enQueue(Object data) {
		list.addLast(data);
	}
	public void display() {
		list.display();
	}

}
