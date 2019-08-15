package org.test;

import java.util.List;

public class Hui {
	public void method1() {
		System.out.println("Hello Huuui");
	}

	public String method2() {
		return "Huuui";
	}

	void countElements(List l) {

	}

	static void m1() {
	}

	void m2() {
		this.m1();
	}

	public static void main(String[] args) {

		Hui hui = new Hui();
		hui.method1();
		System.out.println(hui.method2());
	}
}
