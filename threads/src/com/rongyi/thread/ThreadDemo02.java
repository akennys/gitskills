package com.rongyi.thread;

public class ThreadDemo02 {
	public static void main(String[] args) {
		
		MyRunnable r1 = new MyRunnable("A");
//		MyRunnable r2 = new MyRunnable("B");
		Thread t1 = new Thread(r1,"woshixiancheng1");
		t1.setName("woshixiancheng2");
		t1.start();
//		Thread t2 = new Thread(r1);
//		t2.setName("woshixiancheng2");
//		t2.start();
	}
}
