package com.rongyi.thread;

public class MyThread extends Thread{
	private String name;
	public MyThread(String name){
		this.name = name;
	}
	public void run(){
		for (int i = 0; i < 50; i++) {
			/*try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}*/
			
			System.out.println(name + ":" + i);
			if(i == 10){
				System.out.println(name + "ÀñÈÃ");
				Thread.yield();
			}
		}
		super.run();
	}
}
