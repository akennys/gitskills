/*package com.rongyi.thread.proConCase;


class Info{	// ������Ϣ��
	private String name = "���˻�";	 // ����name����
	private String content = "JAVA��ʦ"  ;		// ����content����
	public synchronized void set(String name,String content){
		this.setName(name) ;	// ��������
		try{
			Thread.sleep(300) ;
		}catch(InterruptedException e){
			e.printStackTrace() ;
		}
		this.setContent(content) ;	// ��������
	}
	public synchronized void get(){
		try{
			Thread.sleep(300) ;
		}catch(InterruptedException e){
			e.printStackTrace() ;
		}
		System.out.println(this.getName() + 
			" --> " + this.getContent()) ;
	}
	public void setName(String name){
		this.name = name ;
	}
	public void setContent(String content){
		this.content = content ;
	}
	public String getName(){
		return this.name ;
	}
	public String getContent(){
		return this.content ;
	}
};
class Producer implements Runnable{	// ͨ��Runnableʵ�ֶ��߳�
	private Info info = null ;		// ����Info����
	public Producer(Info info){
		this.info = info ;
	}
	public void run(){
		boolean flag = false ;	// ������λ
		for(int i=0;i<50;i++){
			if(flag){
				this.info.set("���˻�","JAVA��ʦ") ;	// ��������
				flag = false ;
			}else{
				this.info.set("mldn","www.mldnjava.cn") ;	// ��������
				flag = true ;
			}
		}
	}
};
class Consumer implements Runnable{
	private Info info = null ;
	public Consumer(Info info){
		this.info = info ;
	}
	public void run(){
		for(int i=0;i<50;i++){
			this.info.get() ;
		}
	}
};
public class ThreadCaseDemo02{
	public static void main(String args[]){
		Info info = new Info();	// ʵ����Info����
		Producer pro = new Producer(info) ;	// ������
		Consumer con = new Consumer(info) ;	// ������
		new Thread(pro).start() ;
		new Thread(con).start() ;
	}
};*/