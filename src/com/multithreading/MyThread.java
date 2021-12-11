package com.multithreading;

import java.util.Iterator;

public class MyThread extends Thread {
	public void run() {
		System.out.println(Thread.currentThread().getPriority());
		for (int i=0;i<10;i++) {
			System.out.println("Child Thread");
			
		}
}
}
