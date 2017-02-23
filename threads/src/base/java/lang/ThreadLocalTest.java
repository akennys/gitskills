package base.java.lang;


public class ThreadLocalTest {
    ThreadLocal<Long> longLocal = new ThreadLocal<Long>();
//    ThreadLocal<String> stringLocal = new ThreadLocal<String>();
 
     
    public void set() {
        longLocal.set(Thread.currentThread().getId());
//        stringLocal.set(Thread.currentThread().getName());
    }
     
    public Long getLong() {
    	Long long1 = longLocal.get();
        return long1;
    }
     
//    public String getString() {
//        return stringLocal.get();
//    }
     
    public static void main(String[] args) throws InterruptedException {
        final ThreadLocalTest test = new ThreadLocalTest();
         
         
//        test.set();
        System.out.println(test);
        Long long1 = test.getLong();
        System.out.println(long1);
//        System.out.println(test.getString());
     
         
        Thread thread1 = new Thread(){
            public void run() {
//                test.set();
                System.out.println(test);
                System.out.println(test.getLong());
//                System.out.println(test.getString());
            };
        };
        thread1.start();
        thread1.join();
         Thread.currentThread().sleep(1000);
        System.out.println(test);
        System.out.println(test.getLong());
//        System.out.println(test.getString());
    }
}