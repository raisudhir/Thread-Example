package com.thread;

public class TestUsingRunnable implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("run");
	}

	public static void main(String[] args) {
		TestUsingRunnable runnable= new  TestUsingRunnable();
		Thread thread= new Thread(runnable);
		thread.start();
	}
}
