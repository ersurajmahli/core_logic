package com.forgyan.stack;

public class StackDynamicSizeArray {

	int capacity = 2;
	int[] stack = new int[capacity];
	int top = 0;
	
	
	public void push(int data) {
		if(size()==capacity)
			expannd();
		stack[top] = data;
		top++;
	}
	
	private void expannd() {
		int length = size();
		int newStack[] = new int[2*capacity];
		System.arraycopy(stack, 0, newStack, 0, length);
		stack = newStack;
		capacity = 2*capacity;
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
			top--;
			data = stack[top];
			stack[top] = 0;
			shrink();
		}
		return data;
	}
	
	private void shrink() {
		int length = size();
		if(length<=(capacity/2)/2) {
			capacity = capacity/2;
			int newStack[] = new int[capacity];
			System.out.println("---------------");
			System.arraycopy(stack, 0, newStack, 0, length);
			stack = newStack;
		}
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
