package com.thread;

public class ThreadLocalDemo {

	public static void main(String[] args) {
		int i=10;
		System.out.println(i);
		i=20;
		System.out.println(i);
		ThreadLocal<Number> tn = new ThreadLocal<Number>();
		ThreadLocal<String> ts = new ThreadLocal<String>();
		tn.set(1000);
		System.out.println("value = " +tn.get());
		tn.set(900);
		System.out.println("value = " +tn.get());
		tn.set(900);
		System.out.println("value = " +tn.get());
		ts.set("HPE");
		
		System.out.println("value = " +ts.get());
	}
}
