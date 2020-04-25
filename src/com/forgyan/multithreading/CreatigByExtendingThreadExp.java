package com.forgyan.multithreading;

public class CreatigByExtendingThreadExp extends Thread{
	
	public static void main(String[] args) {
		CreatigByExtendingThreadExp obj = new CreatigByExtendingThreadExp();
		Thread t1 = new Thread(obj);
		t1.start();

	}

	@Override
	public void run() {
		printInteger();
		printString();
	}
	
	public static void printString() {
		
		System.out.println("Printing String");
	}
	
	public static void printInteger() {
		System.out.println("Printing Integer");
	}

}
