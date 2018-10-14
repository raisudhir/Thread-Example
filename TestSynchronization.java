package com.thread;

class Table{
	
	 void printtable(int n) {
		for(int i=0; i<=5;i++) {
			System.out.println(n*i);
			try {
				   Thread.sleep(400);  
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class OwnThread1 extends Thread{
	Table t1;
	public OwnThread1(Table ta) {
		this.t1=t1;
	}
	public void run() {
		t1.printtable(5);
	}
}
class OwnThread2 extends Thread{
	Table t1;
	public OwnThread2(Table t1) {
		this.t1=t1;
	}
	public void run() {
		t1.printtable(100);
	}
}
public class TestSynchronization {

	public static void main(String[] args) {
		Table  tt= new Table();
		OwnThread1 ownThread1= new OwnThread1(tt);
		OwnThread2 ownThread2 = new OwnThread2(tt);
		ownThread1.start();
		ownThread2.start();
	}
}
