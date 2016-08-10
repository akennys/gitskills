package com.rongyi.thread.interrupt;

public class AThread extends Thread {

	public AThread() {
		super("[AThread] Thread");
	}

	public void run() {
		String threadName = Thread.currentThread().getName();
		System.out.println(threadName + " start.");
		try {
			for (int i = 0; i < 10; i++) {
				Thread.sleep(1000);
				System.out.println("AÏß³Ìsleep" + i);
			}
			System.out.println(threadName + " end.");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Exception from " + threadName + ".run");
		}
	}
}
