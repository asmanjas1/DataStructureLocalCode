package com.linkedlist;

public class LinkedListImpl {
	public static void main(String[] args) {
		LinkedListImplementation list= new LinkedListImplementation();
		list.addToFront(6);
		list.addToFront(5);
		list.addToFront(4);
		list.addToFront(8);
		list.addToFront(6);
		list.addToFront(2);
		list.addToFront(6);
		list.addToFront(6);
		//System.out.println(list.deleteFromFront());
		list.print();
		list.deleteAllMatches(6);
		//list.deleteFirstMatche(6);
		System.out.println();
		list.print();
		
	}
}

class LinkedListImplementation {
	Node head;
	
	void addToFront(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}
	
	boolean isEmpty() {
		return head == null;
	}
	
	int deleteFromFront() {
		if(isEmpty())
			return Integer.MIN_VALUE;
		Node deleteNode = head;
		head = head.next;
		return deleteNode.value;
	}
	
	void print() {
		Node curr =  head;
		while(curr != null) {
			System.out.print(curr.value + " -> ");
			curr = curr.next;
		}
		System.out.print("null");
	}
	
	void deleteFirstMatche(int v1) {
		if (isEmpty()) {
			System.out.println("List is empty");
			return;
		}
		Node curr = head, prev = null;
		if (curr != null && curr.value == v1) {
			head = curr.next;
			return;
		}

		while (curr != null && curr.value != v1) {
			prev = curr;
			curr = curr.next;
		}

		if (curr == null)
			return;

		prev.next = curr.next;
	}
	
	void deleteAllMatches(int v1) {
		if(isEmpty()) {
			System.out.println("List is empty");
			return;
		}
		Node curr = head;
		while(curr != null && curr.value == v1) {
			head = curr.next;
			curr = curr.next;
		}
		
		Node prev = null;
		
		while(curr != null) {
			while(curr != null && curr.value != v1) {
				prev= curr;
				curr = curr.next;
			}
			
			if(curr == null)
				return;
			
			prev.next = curr.next;
			curr = prev.next;
		}
	}
	
}

class Node {
	int value;
	Node next;
	
	Node(int value){
		this.value =  value;
	}
}
