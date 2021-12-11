package com.multithreading;

public class ThreadDemo {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		
		System.out.println(Thread.currentThread().getThreadGroup().getName());
		
		System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());
		
		System.out.println(Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(7);
		System.out.println(Thread.currentThread().getPriority());
		MyThread t= new MyThread();
	t.setPriority(10);
		t.start();
		
		for(int i=0;i<10;i++) {
			System.out.println("main thread");
			
		}
		
		
 }

}
