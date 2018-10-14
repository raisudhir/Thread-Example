package com.thread;

public class DaemonThread extends Thread {

	public DaemonThread(String name){
		super(name);
	}
	public void run() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println(getName() + " is Daemon thread");
		}
		else {
			System.out.println(getName() + " is User thread"); 
		}
	}
	public static void main(String[] args) {
		
		DaemonThread thread1= new DaemonThread("t1");
		DaemonThread thread2= new DaemonThread("t1");
		DaemonThread thread3= new DaemonThread("t1");
		thread1.setDaemon(true);
		thread1.start();
		thread2.start();
		thread3.setDaemon(true);
		thread3.start();
	}
}
