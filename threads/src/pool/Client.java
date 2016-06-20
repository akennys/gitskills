package pool;

import java.util.ArrayList;
import java.util.List;

public class Client {
	public static void main(String[] args) throws InterruptedException {
		// 初始化连接池
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
		
		
		// 设置优先级，先让初始化执行，模拟 线程池 先启动
		// 这里仅仅表面控制了，因为即使t 线程先启动，也不能保证pool 初始化完成，为了简单模拟，这里先这样写了
		t1.setPriority(10);
		t2.setPriority(10);
		t3.setPriority(10);
		t1.start();
		t2.start();
		t3.start();
		
		System.out.println("线程A-> "+a.getConnection());
		System.out.println("线程B-> "+b.getConnection());
		System.out.println("线程C-> "+c.getConnection());*/
		
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

	// 初始化
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
