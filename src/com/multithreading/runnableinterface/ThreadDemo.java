package com.multithreading.runnableinterface;

public class ThreadDemo {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		MyRunnable r= new MyRunnable();
		Thread t= new Thread(r);
		//System.out.println(t.currentThread().getName());
		t.start();
		//System.out.println(t.currentThread().getName());
		for(int i=0;i<10;i++) {
			System.out.println("main thread");
		}
	}

}
