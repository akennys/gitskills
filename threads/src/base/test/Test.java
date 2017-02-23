package base.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
	public static void main(String[] args) {
//		StaticTest st = new StaticTest();
//		System.out.println(st.getNumber());
//		Integer aa = null;
//		System.out.println(123);
//		if(aa != 0){
//			System.out.println("123");
//		}
		List<Integer> aa = new ArrayList<Integer>();
//		aa.add(e)
		
		String[] str = new String[] {"a","b"};
		List<String> list = Arrays.asList(str);
//		list.add("c"); //Exception in thread "main" java.lang.UnsupportedOperationException
		str[0] = "ÐÞ¸ÄÁË";
		System.out.println(list.get(0));
		
		exit:
		for (int i = 0; i < 10; i++) {
		    for (int j = 0; j < 10; j++) {
                break exit;
            }
        }
	}
}


