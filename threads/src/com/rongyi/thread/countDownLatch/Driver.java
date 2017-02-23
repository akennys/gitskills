package com.rongyi.thread.countDownLatch;

import java.util.concurrent.CountDownLatch;

public class Driver { 
	public static void main(String[] args) throws InterruptedException {
		CountDownLatch startSignal = new CountDownLatch(1);
		int N = 10;
		CountDownLatch doneSignal = new CountDownLatch(N);

		for (int i = 0; i < N; ++i) // create and start threads
			new Thread(new Worker(startSignal, doneSignal)).start();

		System.out.println("doSomethingElse|1"); // don't let run yet
		startSignal.countDown(); // let all threads proceed
		doneSignal.await(); // wait for all to finish
		System.out.println("doSomethingElse|2");
	}
}

class Worker implements Runnable {
	private final CountDownLatch startSignal;
	private final CountDownLatch doneSignal;

	Worker(CountDownLatch startSignal, CountDownLatch doneSignal) {
		this.startSignal = startSignal;
		this.doneSignal = doneSignal;
	}

	public void run() {
		try {
			startSignal.await();
			doWork();
			doneSignal.countDown();
		} catch (InterruptedException ex) {
		} // return;
	}

	void doWork() { 
		System.out.println("im working.");
	}
}
