package com.thread;

public class Customer {

	int amount=1000;
	public Customer() {
		System.out.println("Open balence is Rs : "+amount);
	}
	synchronized void withdraw(int amount) {
		System.out.println("Going to withdraw : Rs"+amount);
		if(this.amount < amount) {
			System.out.println("Less Account balence ,Waiting for deposit...");
		}
		try {
			wait();
		}catch (InterruptedException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		this.amount=this.amount-amount;
		System.out.println("Withdrow complet : Rs"+ amount);
		System.out.println("Now balence is : Rs"+this.amount);
	}
	synchronized void deposite(int amount) {
		
		System.out.println("Going to deposite...");
		this.amount=this.amount+amount;
		System.out.println("Deposite Complete : Rs"+amount);
		notify();
	}
}
