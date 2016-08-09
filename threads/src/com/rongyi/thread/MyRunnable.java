package com.rongyi.thread;

public class MyRunnable implements Runnable{

	private String name; 
	
	public MyRunnable(String name) {
		this.name = name;
	}
	@Override
	public void run() {
		for (int i = 0; i < 500; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
		}
		
	}

	
}
