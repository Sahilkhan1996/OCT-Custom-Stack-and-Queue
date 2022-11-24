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
	}

	private void pop() {
		ll.deleteLast(); // removing last element from the stack
	}

	private void display() {
		ll.printList();
	}

	private void push(int i) {
		ll.append(i); // adding element one by one after other in the stack
	}
}
