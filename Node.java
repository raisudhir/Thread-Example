package com.thread;

public class Node {

	public Node next;
	public int data;
	int value;
	public Node(int value) {
		this.value=value;
	}
	public void printData() {
		System.out.println(data);
	}
}
