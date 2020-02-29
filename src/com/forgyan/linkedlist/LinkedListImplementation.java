package com.forgyan.linkedlist;
/*
 * 
 * Author : Suraj Mahli
 * Moto : LinkedListImplementation class, add and show operation
 * Date : 22-02-2020
 * 
*/
public class LinkedListImplementation {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		list.insert(18);
		list.insert(45);
		list.insert(78);
		list.insertAtStart(22);
		
		list.insertAt(2, 55);
		
		list.show();
		System.out.println("-----------------------------");
		list.deleteAt(2);
		
		list.show();
	}

}
