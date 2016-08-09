package com.rongyi.thread.join;

public class JoinTest {

	public static void main(String[] args) {
		String threadName = Thread.currentThread().getName();
		System.out.println(threadName + " start.");
		BThread bt = new BThread();
		AThread at = new AThread(bt);
		try {
			bt.start();
			Thread.sleep(2000);
			at.start();
			at.join();
		} catch (Exception e) {
			System.out.println("Exception from main");
		}
		System.out.println(threadName + " end!");
	}

}
/* 
	main start.    //主线程起动，因为调用了at.join()，要等到at结束了，此线程才能向下执行。 
	[BThread] Thread start. 
	[BThread] Thread loop at 0 
	[BThread] Thread loop at 1 
	[AThread] Thread start.    //线程at启动，因为调用bt.join()，等到bt结束了才向下执行。 
	[BThread] Thread loop at 2 
	[BThread] Thread loop at 3 
	[BThread] Thread loop at 4 
	[BThread] Thread end. 
	[AThread] Thread end.    // 线程AThread在bt.join();阻塞处起动，向下继续执行的结果 
	main end!      //线程AThread结束，此线程在at.join();阻塞处起动，向下继续执行的结果。
*/