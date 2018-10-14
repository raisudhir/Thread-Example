package com.thread;

class Acount{
	
	static synchronized  void showAccount(String accountName) {
		 System.out.println("My account name is "+accountName+" Holder Name is "+Thread.currentThread().getName());
		 try {
			 Thread.sleep(200);
		 }catch (InterruptedException e) {
			 e.printStackTrace();
		}
	 }
}
class MyThread1 extends Thread{
	
	public void run() {
		Acount.showAccount("Sudhir");
	}
	
}
class MyThread2 extends Thread{
	public void run() {
		Acount.showAccount("Mukesh");
	}
}
class MyThread3 extends Thread{
	public void run() {
		Acount.showAccount("Sunil");
	}
}
public class StaticSyncDemo {

	public static void main(String[] args) {
		 MyThread1 t1 = new MyThread1();
	       MyThread2 t2 = new MyThread2();
	       MyThread3 t3 = new MyThread3();
	      
	       t1.setName("ABC");
	       t2.setName("CSE");
	       t3.setName("FGD");
	             
	       t1.start();
	       t2.start();
	       t3.start();
	      
	}
}
