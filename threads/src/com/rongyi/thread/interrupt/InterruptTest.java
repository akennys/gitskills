package com.rongyi.thread.interrupt;

/* 
	�ն�ִ��
*/
public class InterruptTest {

	public static void main(String[] args) {
		String threadName = Thread.currentThread().getName();
		System.out.println(threadName + " start.");
		AThread at = new AThread();
		try {
			at.start();
			System.out.println(threadName + " ˯��5��.");
			Thread.sleep(5000);
			System.out.println(threadName + " ˯��5�����.");
		} catch (Exception e) {
			System.out.println("Exception from main");
		}
		at.interrupt();
		System.out.println(threadName + " end!");
	}

}
