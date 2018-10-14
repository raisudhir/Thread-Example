package com.thread;

public class Bank {

	public static void main(String[] args) {
		 final Customer customer = new Customer();
		 Thread t1= new Thread() {
			public void run() {
				customer.withdraw(1200);
			}
		 };
		 Thread t2 = new Thread() {
			 public void run() {
				 customer.deposite(1000);
			 }
		 };
		 t1.start();
		 t2.start();
	}
}
