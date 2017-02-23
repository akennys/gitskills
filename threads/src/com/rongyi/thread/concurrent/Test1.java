package com.rongyi.thread.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test1 {
	public static void main(String[] args) {
		// 创建一个可重用固定线程数的线程池
		ExecutorService pool = Executors.newFixedThreadPool(10);
//		ExecutorService pool = Executors.newCachedThreadPool();
		
		// 创建线程
		Thread t1 = new MyThread("A");
		Thread t2 = new MyThread("B");
		Thread t3 = new MyThread("C");
		Thread t4 = new MyThread("D");
		Thread t5 = new MyThread("E");
		// 将线程放入池中进行执行
		pool.execute(t1);
		pool.execute(t2);
		pool.execute(t3);
		pool.execute(t4);
		pool.execute(t5);
		// 关闭线程池
		pool.shutdown();
	}
}

class MyThread extends Thread {
	
	private String name;
	public MyThread(String name){
		this.name = name;
	}
	@Override
	public void run() {
		try {
			System.out.println(Thread.currentThread().getName() + "正在执行。。。" + name);
			Thread.sleep(500);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
}
