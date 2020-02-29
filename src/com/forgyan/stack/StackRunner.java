package com.forgyan.stack;

public class StackRunner {

	public static void main(String[] args) {
		StackDynamicSizeArray stack = new StackDynamicSizeArray();
		stack.push(4);
		stack.show();
		stack.push(5);
		stack.show();
		stack.push(6);
		stack.show();
		stack.push(7);
		stack.show();
		stack.push(8);
		stack.show();
		
		

		stack.pop();
		stack.show();
		stack.pop();
		stack.show();
		stack.pop();
		stack.show();
		stack.pop();
		stack.show();
		stack.pop();
		stack.show();
	}

}
