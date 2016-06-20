package com.rongyi.thread;

public class ThreadDemo01 {
	public static void main(String[] args) {
		
		MyThread t1 = new MyThread("A");
		MyThread t2 = new MyThread("B");
		t1.run();
		t2.run();
		t1.start();
		t2.start();
		
	}
}
