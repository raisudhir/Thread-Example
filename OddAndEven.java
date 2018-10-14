package com.thread;
class Odd implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10; i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
	}
	
}
class Even implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10; i++) {
			if(i%2==1) {
				System.out.println(i);
			}
		}
	}
	
}
public class OddAndEven {

	public static void main(String[] args) {
		Odd odd= new Odd();
		Thread thread = new Thread(odd);
		thread.start();
		Even even= new Even();
		Thread thread2 = new Thread(even);
		thread2.start();
	}
	
	
}
