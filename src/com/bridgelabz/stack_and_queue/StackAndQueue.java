package com.bridgelabz.stack_and_queue;

import com.bridgelabz.customlinkedlist.SimpleLinkedList;

public class StackAndQueue {
	SimpleLinkedList ll = new SimpleLinkedList();

	public static void main(String[] args) {
		// Stack Operation
		StackAndQueue sq = new StackAndQueue();
		sq.push(70);
		sq.push(30);
		sq.push(56);
		sq.display();
		sq.pop();
		sq.display();
		// UC2: popping the elements from the linked list till it's empty
		// peeking the last element from the stack
		System.out.println(sq.peek());
		sq.pop();
		sq.display();
		sq.pop();
		sq.display();
	}

	private int peek() {
		return ll.stackpeek();
	}

	private void pop() {
		ll.deleteLast(); // removing last element from the stack
	}

	// checking the nodes added in the stack
	private void display() {
		ll.printList();
	}

	private void push(int i) {
		ll.append(i); // adding element one by one after other in the stack
	}
}
