package com.rongyi.thread.sleep;

public class SleepTest {

	public static void main(String[] args) {
		String threadName = Thread.currentThread().getName();
		System.out.println(threadName + " start.");
		AThread at = new AThread();
		try {
			at.start();
			for (int i = 0; i < 5; i++) {
				Thread.sleep(1000);
				System.out.println("Ö÷Ïß³Ìsleep" + i);
			}
		} catch (Exception e) {
			System.out.println("Exception from main");
		}
		System.out.println(threadName + " end!");
	}

}
/* 
*/