package com.multithreading.runnableinterface;

public class MyRunnable implements Runnable {

	public void run() {
		Thread.currentThread().setName("shivthread");
		System.out.println(Thread.currentThread().getName());
		for(int i=0;i<10;i++) {
			System.out.println("child thread");
			
		}
		System.out.println(Thread.currentThread().getName());
	}
}
