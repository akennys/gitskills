package com.rongyi.thread.daemon;

public class DaemonTest implements Runnable {
	private String name;
	private long delay;

	public DaemonTest(String name, long delay) {
		this.name = name;
		this.delay = delay;
	}

	public void run() {
		try {
			while (true) {
				System.out.println(name);
				Thread.sleep(delay);
			}
		} catch (Exception e) {
			System.out.println("Exception");
		}
	}
	
	public static void main(String args[]) {
		DaemonTest r = new DaemonTest("thread1", 200);
		Thread t = new Thread(r);
		t.setDaemon(true); // 后台线程
		t.start();
		try {
			System.out.println("main thread sleep start");
			Thread.sleep(5000);
			System.out.println("main thread sleep end");
		} catch (Exception e) {

		}
		System.out.println("end main");
	}
}