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
	main start.    //���߳��𶯣���Ϊ������at.join()��Ҫ�ȵ�at�����ˣ����̲߳�������ִ�С� 
	[BThread] Thread start. 
	[BThread] Thread loop at 0 
	[BThread] Thread loop at 1 
	[AThread] Thread start.    //�߳�at��������Ϊ����bt.join()���ȵ�bt�����˲�����ִ�С� 
	[BThread] Thread loop at 2 
	[BThread] Thread loop at 3 
	[BThread] Thread loop at 4 
	[BThread] Thread end. 
	[AThread] Thread end.    // �߳�AThread��bt.join();�������𶯣����¼���ִ�еĽ�� 
	main end!      //�߳�AThread���������߳���at.join();�������𶯣����¼���ִ�еĽ����
*/