package com.forgyan.queue;

public class Queue {

	int queue[] = new int[5];
	int size;
	int front;
	int rear;
	
	public void enqueue(int data) {
		if(!isFull()) {
			queue[rear] = data;
			rear = (rear+1)%5;
			size = size+1;
		}else {
			System.out.println("Queue Full");
		}
	}
	
	public int dequeue() {
		int data = 0;
		if(!isEmpty()) {
			data = queue[front];
			front = (front+1)%5;
			size = size-1;
		}else {
			System.out.println("Queue is Empty");
		}
		return data;
	}
	
	public int getSize() {
		return size;
	}
	
	public boolean isEmpty() {
		return getSize()==0;
	}
	
	public boolean isFull() {
		return getSize()==5;
	}
	
	public void show() {
		System.out.print("Elements :" );
		for(int i = 0 ;i < size ;i++) {
			System.out.print(queue[(front+i)%5]+" ");
		}
	}
}
