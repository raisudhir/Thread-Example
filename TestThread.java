package com.thread;

public class TestThread extends Thread{

	public void run() {
		System.out.println("run");
	}
	public static void main(String[] args) {
		TestThread testThread= new TestThread();
		//Thread t1 = new Thread(testThread);
		
		
		testThread.start();
	}
}
