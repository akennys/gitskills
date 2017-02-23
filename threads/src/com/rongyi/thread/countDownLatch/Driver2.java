package com.rongyi.thread.countDownLatch;

import java.util.concurrent.CountDownLatch;

public class Driver2 {
	public static void main(String[] args) throws InterruptedException {
		int N = 15;
		CountDownLatch doneSignal = new CountDownLatch(N);

		for (int i = 1; i <= 5; ++i){
			// create and start threads
			new Thread(new Worker2(doneSignal)).start();
		}
		
		for (int i = 1; i <= 10; i++) {
			doneSignal.countDown();
			System.out.println(doneSignal.getCount());
			Thread.sleep(500);
		}
		
		System.out.println("最后还剩"+doneSignal.getCount());
		doneSignal.await();
		System.out.println("adsadsdafwdwqd");

	}
}

class Worker2 implements Runnable {
	private final CountDownLatch doneSignal;

	Worker2(CountDownLatch doneSignal) {
		this.doneSignal = doneSignal;
	}

	public void run() {
		System.out.println("线程里的" + doneSignal.getCount());
		doneSignal.countDown();
	}

	void doWork() {
		System.out.println("im working.");
	}
}
