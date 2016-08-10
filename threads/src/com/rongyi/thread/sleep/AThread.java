package com.rongyi.thread.sleep;

public class AThread extends Thread {

	public AThread() {
		super("[AThread] Thread");
	}

	public void run() {
		String threadName = Thread.currentThread().getName();
		System.out.println(threadName + " start.");
		try {
			Thread.sleep(10000);//–›√ﬂ10√Î
			System.out.println(threadName + " end.");
		} catch (Exception e) {
			System.out.println("Exception from " + threadName + ".run");
		}
	}
}
