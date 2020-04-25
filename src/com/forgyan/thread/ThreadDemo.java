package com.forgyan.thread;

public class ThreadDemo extends Thread{

	public static void main(String[] args) {
		ThreadDemo obj = new ThreadDemo();
		Thread t = new Thread(obj);
		
		t.start();

	}
	
	public void run() {
		System.out.println("Thread created");
	}

}
