/**
 * 
 */
package com.bridgelabz;

import com.bridgelabz.LinkedList.Node;

/**
 * @author PAVITHRA C
 *
 */
public class LinkedList {

	/**
	 * @param args
	 */
	Node head;

		public class Node {

			Object data;
			Node next;

			public Node(Object data) {
				this.data = data;
			}
		}

		public void addFirst(Object data) {
		// TODO Auto-generated method stub
		Node newNode = new Node(data);

		if (head == null)
			head = newNode;
		else {
			Node temp = head;
			head = newNode;
			head.next = temp;

		}
	}
		public void display() {
			if (head == null)
				System.out.println("No elements to display...");
			else if (head.next == null)
				System.out.println(head.data);
			else {
				Node temp = head;
				while (temp != null) {
					if (temp.next != null)
						System.out.print(temp.data + " ");
					else
						System.out.print(temp.data + "\n");
					temp = temp.next;
				}
			}
		}

}


