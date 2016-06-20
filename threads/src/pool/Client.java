package pool;

import java.util.ArrayList;
import java.util.List;

public class Client {
	public static void main(String[] args) throws InterruptedException {
		// ��ʼ�����ӳ�
//		Thread t = init();
//		t.start();
//		t.join();
		/*
		ThreadConnection a = new ThreadConnection();
		ThreadConnection b = new ThreadConnection();
		ThreadConnection c = new ThreadConnection();
		Thread t1 = new Thread(a);
		Thread t2 = new Thread(b);
		Thread t3 = new Thread(c);
		
		
		// �������ȼ������ó�ʼ��ִ�У�ģ�� �̳߳� ������
		// ���������������ˣ���Ϊ��ʹt �߳���������Ҳ���ܱ�֤pool ��ʼ����ɣ�Ϊ�˼�ģ�⣬����������д��
		t1.setPriority(10);
		t2.setPriority(10);
		t3.setPriority(10);
		t1.start();
		t2.start();
		t3.start();
		
		System.out.println("�߳�A-> "+a.getConnection());
		System.out.println("�߳�B-> "+b.getConnection());
		System.out.println("�߳�C-> "+c.getConnection());*/
		
		String s = new String("0000");
//		System.out.println(s.substring(1, 2).equals("1") && s.substring(3, 4).equals("1"));
		System.out.println(s.matches("[0-9]1[0-9]1"));
		s = new String("0001");
		System.out.println(s.matches("[0-9]1[0-9]1"));
//		System.out.println(s.substring(1, 2).equals("1") && s.substring(3, 4).equals("1"));
		s = new String("0101");
		System.out.println(s.matches("[0-9]1[0-9]1"));
//		System.out.println(s.substring(1, 2).equals("1") && s.substring(3, 4).equals("1"));
		
		
	}

	// ��ʼ��
	public static Thread init() {
		Thread t = new Thread(new Runnable() {
			@Override
			public void run() {
				IConnectionPool  pool = initPool();
				while(pool == null || !pool.isActive()){
					pool = initPool();
				}
			}
		});
		return t;
	}
	
	
	public static IConnectionPool initPool(){
		
		List<String> a = new ArrayList<String>();
		a.add("1");
		List subList = a.subList(0, 1);
		return ConnectionPoolManager.getInstance().getPool("testPool");
		
	}

}
