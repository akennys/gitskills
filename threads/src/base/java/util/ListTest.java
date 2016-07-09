package base.java.util;

import java.util.ArrayList;
import java.util.List;

import entity.Student;

public class ListTest {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		for (int i = 0; i < 50; i++) {
			Student s = new Student(i,i + "����");
			list.add(s);
		}
		System.out.println(list.get(0));
		System.out.println(list);
		
		//1.�鿴subList����
		List<Student> subList = list.subList(0, 10);
		System.out.println(subList.get(0));
		System.out.println(subList);
		
	}
}
