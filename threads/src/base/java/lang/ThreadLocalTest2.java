package base.java.lang;

import base.singleton.Student;

public class ThreadLocalTest2 {
	ThreadLocal<Long> longLocal = new ThreadLocal<Long>();
	Long simpleLong = new Long(0);
	
	public void set() {
		//�൱�ڰѴ�longLocalʵ����Ϊkey��set������Ϊvalue�����ڷ��ڵ�ǰThread�е�һ��map���ԣ�ThreadLocal.ThreadLocalMap threadLocals���У�
		//����ThreadLocalMap��key�����;���ΪThreadLocal��value��������Object
		longLocal.set(Thread.currentThread().getId());
		simpleLong = Thread.currentThread().getId();
	}

	public long getLong() {
		return longLocal.get();
	}
	
	public long getSimpleLong() {
		return simpleLong;
	}

	public static void main(String[] args) throws InterruptedException {
		final ThreadLocalTest2 test = new ThreadLocalTest2();
		
		test.set();
		System.out.println(test);
		System.out.println(test.getLong());
		System.out.println(test.getSimpleLong());
		
		Thread thread1 = new Thread() {
			public void run() {
				test.set();
				System.out.println(test);
				System.out.println(test.getLong());
				System.out.println(test.getSimpleLong());
			};
		};
		thread1.start();
		thread1.join();

		System.out.println(test);
		System.out.println(test.getLong());
		System.out.println(test.getSimpleLong());
		
		/*
		Student student = new Student(){
			@Override
			public String getName() {
				return "pk";
			}
		};
		System.out.println(student.getName());*/
		
	}
}