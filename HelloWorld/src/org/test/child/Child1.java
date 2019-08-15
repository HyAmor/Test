package org.test.child;

import java.util.ArrayList;
import java.util.List;

public class Child1 {
	
	public void method1() {
		System.out.println("Hello Child");
	}
	
	public String method2() {
		List l = new ArrayList<Number>();
		return "Child";
	}
	public static void main(String[] args) {
		String[] stringArr = new String[5];
		stringArr[5] = "sss";
		for (int i = 0; i < stringArr.length; i++) {
			System.out.println(stringArr[i]);
		}
		Child1 ch1 = new Child1();
		ch1.method1();
		System.out.println(ch1.method2());
	}
}
