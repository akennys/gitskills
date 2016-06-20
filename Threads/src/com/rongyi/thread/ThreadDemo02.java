package com.rongyi.thread;

public class ThreadDemo02 {
	public static void main(String[] args) {
		
		MyRunnable r1 = new MyRunnable("A");
		MyRunnable r2 = new MyRunnable("B");
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();
	}
}
