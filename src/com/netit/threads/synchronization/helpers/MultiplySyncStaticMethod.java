package com.netit.threads.synchronization.helpers;

public class MultiplySyncStaticMethod {

	public void dummyMethod() {
		for (int i = 0; i < 5; i++) {
			System.out.println("I'm dummy method");
		}
	}

	public static synchronized void multiplySyncStaticMethod(int num) {
		for (int i = 0; i < 5; i++) {
			System.out.println(num + "*" + i + " = " + num * i);
		}
	}

}
