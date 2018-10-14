package com.thread;

public class ASingleton {

	private static volatile ASingleton singleton;
	private static Object object= new Object();
	
	private ASingleton() {
		
	}
	public static ASingleton getInstance() {
		ASingleton result= singleton;
		if(result==null) {
			synchronized(object) {
				result=singleton;
				if(result==null) {
					singleton= new ASingleton();
				}
			}
		}
		
		return result;
		
	}
}
