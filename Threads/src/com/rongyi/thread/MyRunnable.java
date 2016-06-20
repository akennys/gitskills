package com.rongyi.thread;

public class MyRunnable implements Runnable{

	private String name; 
	
	public MyRunnable(String name) {
		this.name = name;
	}
	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println(name + ":" + i);
			if(i == 10 && Thread.currentThread().getName().equals("Thread-0")){
				System.out.println(name + "ÀñÈÃ");
				Thread.yield();
			}
		}
		
	}

	
}
