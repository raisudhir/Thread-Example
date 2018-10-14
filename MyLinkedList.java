package com.thread;

import com.list.Node;

public class MyLinkedList {

	 private Node head;
	 public boolean isEmpty() {
		 return (head==null);
	 }
	 public void addFirst(int data) {
		 Node newNode=new Node();
		 newNode.data=data;
		 newNode.next=head;
		 head=newNode;
	 }
	public void addLast(int data) {
		Node current=head;
		while(current !=null) {
			current=current.next;	
		}
		Node newNode= new Node();
		newNode.data=data;
		current.next=newNode;
	}
	public Node deleteFirst() {
		Node temp=head;
		head=head.next;
		return head;		
	}
	public void removeLast(int node) {
		Node temp = head;
		while(temp.next != null) {
			temp=temp.next;
		}
		if(temp.next!=null) {
			temp.next=temp.next.next;
		}
	}
	public Node nthPostion(Node head,int n) {
		
		Node firstPostion=head;
		Node secondPostion=head;
		for(int i=0; i<n;i++) {
			firstPostion=firstPostion.next;
		}
		while(firstPostion !=null) {
			firstPostion=firstPostion.next;
			secondPostion=secondPostion.next;
		}
		return secondPostion;
		
	}
	 Node reverse(Node node) {
		Node next=null;
		Node current=node;
		Node prv=null;
		while(current !=null) {
			next=current.next;
			current.next=prv;
			prv=current;
			current=next;
		}
		node=prv;
		 return node;
		 
	 }
	 void printMiddle() {
		Node firstPostion=head;
		Node secondPostion=head;
		if(firstPostion !=null && firstPostion.next !=null) {
			firstPostion=firstPostion.next.next;
			secondPostion=secondPostion.next;
		}
		  System.out.println("The middle element is [" + 
				  secondPostion.data + "] \n"); 
	 }
}
