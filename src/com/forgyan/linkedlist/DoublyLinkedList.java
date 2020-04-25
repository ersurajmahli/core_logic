package com.forgyan.linkedlist;

public class DoublyLinkedList {

	DoublyNode head;
	
	public void insert(int data) {
		
		DoublyNode node = new DoublyNode();
		node.next = null;
		node.preveous=null;
		node.data = data;
		
		if(head==null) {
			head = node;
		}else {
			DoublyNode n = head;
			while(n.next!=null) {
				n = n.next;
			}
			n.next = node;
			node.preveous = n;
		}
	}
	
	public void show() {
		DoublyNode node = head;
		
		while(node.next!=null) {
			System.out.println(node.data);
			node = node.next;
		}
		System.out.println(node.data);
	}
	
	public void prvious(int index) {
		DoublyNode node = head;
		for(int i = 0; i<index; i++) {
			node = node.next;
		}
		while(node.preveous!=null) {
			System.out.println(node.data);
			node = node.preveous;
		}
		System.out.println(node.data);
	}
}
