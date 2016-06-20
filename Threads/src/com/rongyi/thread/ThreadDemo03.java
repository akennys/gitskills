package com.rongyi.thread;

public class ThreadDemo03 {
	public static void main(String[] args) {
		MyRunnable r1 = new MyRunnable("A");
		MyRunnable r2 = new MyRunnable("B");
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();
		for (int i = 0; i < 500; i++) {
			/*if(i>10){
				try {
					t1.join();//强行让t1执行
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}*/
			//System.out.println("主线程：" + i);
		}
	}
}
