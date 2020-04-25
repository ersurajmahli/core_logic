package com.forgyan.linkedlist;

public class DoublyLinkedListRunner {

	public static void main(String[] args) {
		DoublyLinkedList dl = new DoublyLinkedList();
		
		dl.insert(23);
		dl.insert(34);
		dl.insert(65);
		
		dl.show();
		System.out.println("----------------------");
		dl.prvious(2);

	}

}
