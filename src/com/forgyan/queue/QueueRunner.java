package com.forgyan.queue;

public class QueueRunner {

	public static void main(String[] args) {
		Queue queue = new Queue();
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(7);
		queue.enqueue(3);
		queue.enqueue(9);
		queue.show();
		
		queue.dequeue();
		queue.dequeue();
		queue.show();
		queue.enqueue(11);
		queue.enqueue(13);
		queue.show();

	}

}
