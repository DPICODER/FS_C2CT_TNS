package com.cg.multi_Threading;

class Ecllipse extends Thread{
	public void run() {
		int sum = 0;
		for(int i = 0 ; i < 200000*2600 ; i++) {
			sum = sum+1;
		}
		System.out.println("\n\n");
		System.out.println(sum);
		System.out.println("Ran from Ecllipse Loop Completed");
		System.out.println(Thread.currentThread().getName());
		System.out.println("Ecllipse ID :" +Thread.currentThread().getId());
	}
}

class ppt extends Thread{
public void run() {
	int sum = 0;
	for(int i = 0 ; i < 200000*2300 ; i++) {
		sum = sum+1;
	}
	System.out.println("\n\n");
	System.out.println(sum);
	System.out.println("Ran from ppt Loop Completed ");
	System.out.println(Thread.currentThread().getName());
	System.out.println("PPT ID :" + Thread.currentThread().getId());
	}
}

class chrome extends Thread{
public void run() {
	int sum = 0;
	for(int i = 0 ; i < 20000*160 ; i++) {
		sum = sum+1;
	}
	System.out.println("\n\n");
	System.out.println(sum);
	System.out.println("Ran from Chrome Loop Completed");
	System.out.println(Thread.currentThread().getName());
	System.out.println("Chrome ID :" +Thread.currentThread().getId());
	}
}

class edge implements Runnable{
	public void run() {
		int sum = 0;
		for(int i = 0 ; i < 10000*160 ; i++) {
			sum = sum+1;
		}
		System.out.println("\n\n");
		System.out.println(sum);
		System.out.println("Ran from EDGE Loop Completed");
		System.out.println("\n\n");
		System.out.println(Thread.currentThread().getName());
		System.out.println("EDGE ID :" +Thread.currentThread().getId());
		}
}

public class MT_Example_1 {

	public static void main(String[] args) {
//		a single object cannot create multiple threads of same object / application 
		Ecllipse e = new Ecllipse();
		e.start();
//		
//		you need to create a separate object of the same class to create or start Multiple threads
//		Ecllipse e1 = new Ecllipse();
//		e1.start();
		
		ppt p = new ppt();
		p.start();
		
		chrome c = new chrome();
		c.start();
		
		
//		here edge is implementing Runnable interface so we can't directly start is like Normal Thread 
		edge ed = new edge();
//		we need to create a Thread object and pass the application or Class object as its parameter like (ed)
		Thread t = new Thread(ed);
//		now as we created a relation ship using runnable and passing our class object we can start the thread by calling the thread object and .start(){method}
		t.start();
		
		System.out.println(Thread.currentThread().getName());
		
	}

}
/*
	2 - Techniques of using Threads {2}
		They-are:-
				1 . Extends Threads 
				2 . implements Runnable
				
	- Thread's work simultaneosly:-
		you get Output of the one which completes Execution first
*/