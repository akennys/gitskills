package com.rongyi.thread.interrupt;

/* 
	ÖÕ¶ËÖ´ĞĞ
*/
public class InterruptTest {

	public static void main(String[] args) {
		String threadName = Thread.currentThread().getName();
		System.out.println(threadName + " start.");
		AThread at = new AThread();
		try {
			at.start();
			System.out.println(threadName + " Ë¯¾õ5Ãë.");
			Thread.sleep(5000);
			System.out.println(threadName + " Ë¯¾õ5Ãë½áÊø.");
		} catch (Exception e) {
			System.out.println("Exception from main");
		}
		at.interrupt();
		System.out.println(threadName + " end!");
	}

}
