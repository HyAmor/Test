package org.test;

import org.Hello2;
import org.Hello3;

public class Hello {

	public void printHello1() {
		System.out.println("Hello World");
	}

	public String printHello2() {
		return "World";
	}

	public void method1() {
		Hello2 h2 = new Hello2();
		h2.method1();
	}

	public String method2() {
		Hello2 h2 = new Hello2();
		String str = h2.method2();
		return str;
	}

	public void method3() {
		Hello3 h3 = new Hello3();
		h3.method1();
	}

	public String method4() {
		Hello3 h4 = new Hello3();
		String str = h4.method2();
		return str;
	}

	/**
	 * @deprecated As of Java SE 7, replaced by {@link #newMethod()}
	 */
	public static void deprecatedMethood() {
	}

	public static void newMethod() {
	}

	void n() {
		if (true)
			;
	}

//	public static int m() {
//		  try {
//		     throw new NullPointerException();
//		  }  catch(NullPointerException();{
//		     System.err.println("Caught NullPointerException.");
//		     return 1;
//		   } finally {
//		     return 0;
//		   }
//		  }
	
	public static void main(String[] args) {
		String s = (String) "Hello";
		java.util.Date myDate = new java.util.Date();
		int currentDay = myDate.getDay();
		int divideByZero = 42 / 0;
		int x = 1;
		switch (x) {
		case 1:
		  System.out.println("1");
		  // No break statement here.
		case 2:
		  System.out.println("2");
		}

		Hello h1 = new Hello();
		h1.printHello1();
		System.out.println(h1.printHello2());
		h1.method1();
		System.out.println(h1.method2());
		h1.method3();
		System.out.println(h1.method4());
	}

}