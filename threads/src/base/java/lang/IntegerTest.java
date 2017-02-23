package base.java.lang;

public class IntegerTest {
	public static void main(String[] args) {
//		int a = 3;
//		int b = 99;
//		int c = 2;
//		System.out.println(a/b);
//		
//		Double a = 3.0;
//		Double b = 99.0;
//		Integer c = 2;
//		System.out.println(a/b/2);
//		System.out.println(System.currentTimeMillis());
//		
//		System.out.println(Math.floor((double)3000/(double)2966)/0.01);
//		System.out.println(Math.floor((double)2550/(double)2966)/0.01);
//		
//		
		for (float a = 0; a < 30; a++) {
			int b = 3;
			int c = (int)Math.ceil(a/b);
			System.out.println(a + "||" + b + "||" + c);
		}
		
		long aa = 2928;
		int bb = 50;
		
		System.out.println((int)Math.ceil(new Long(aa).floatValue()/bb));
		
	}
}
