package com.thread;

public class JavaDaemonThread {

	public static void main(String[] args) throws InterruptedException {
		Thread t = new Thread(new DaemonThrad(),"t");
		t.setDaemon(true);
		t.start();
		Thread.sleep(200);
		System.out.println("Finish program");
	}
}
class DaemonThrad implements Runnable{

	@Override
	public void run() {
		while(true) {
			processTest();
		}
		
	}

	public void processTest() {
		// TODO Auto-generated method stub
		try {
			System.out.println("This is daemon thread");
			Thread.sleep(200);
		}catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
}