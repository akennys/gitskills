package com.rongyi.thread.concurrent;

import java.sql.Time;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test_xiaolvceshi {
	public static void main(String[] args) {
		// ����һ�������ù̶��߳������̳߳�
		ExecutorService pool = Executors.newFixedThreadPool(10);
//		ExecutorService pool = Executors.newCachedThreadPool();
		for (int i = 1; i <= 10000; i++) {
			Thread t1 = new MyThread1(String.valueOf(i));
			pool.execute(t1);
		}
		pool.shutdown();
	}
}

class MyThread1 extends Thread {
	
	private String name;
	public MyThread1(String name){
		this.name = name;
	}
	@Override
	public void run() {
		try {
			System.out.println(Thread.currentThread().getName() + "����ִ�С�����" + name);
			Thread.sleep(500);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
}
