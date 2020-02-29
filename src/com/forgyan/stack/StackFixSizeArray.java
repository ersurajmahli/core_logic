package com.forgyan.stack;

public class StackFixSizeArray {

	int[] stack = new int[5];
	int top = 0;
	
	
	public void push(int data) {
		if(top>=stack.length) {
			System.out.println("Stack is full");
		}else {
			stack[top] = data;
			top++;
		}
	}
	
	public void show() {
		for(int n : stack) {
			System.out.print(n+"\t");
		}
		System.out.println();
	}
	
	public int pop() {
		int data = 0;
		if(top == 0) {
			System.out.println("Empty Stack");
			data = 0;
		}else {
			data = stack[top-1];
			stack[top-1] = 0;
			top--;
		}
		return data;
	}
	
	public int peek() {
		int data = 0;
		if(top>0) {
			data = stack[top-1];
		}
		return data;
	}
	
	public int size() {
		return top;
	}
	
	public boolean isEmpty() {
		return top<=0;
	}

}
