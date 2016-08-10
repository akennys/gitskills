package com.rongyi.thread;

public class SaleTicketThread implements Runnable{
	private Integer ticket = 5;

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			synchronized (this) {
				if(ticket>0){
					try {
						Thread.sleep(300);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("ÂôÆ±£º" + ticket--);
				}
			}
			
		}
	}
	
	public static void main(String[] args) {
		SaleTicketThread st = new SaleTicketThread();
		Thread t1 = new Thread(st);
		Thread t2 = new Thread(st);
		Thread t3 = new Thread(st);
		t1.start();
		t2.start();
		t3.start();
		
	}
	
}
