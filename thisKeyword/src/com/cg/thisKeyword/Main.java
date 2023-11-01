package com.cg.thisKeyword;

class A {
	int data = 10;
	A(){ // Constructor
		B b = new B(this);
	}
	
	
//	int data = 10;
//	void display() {
//		show(this);
//		System.out.println("In display Method");
//	}
//	
//	void show(A a) {
//		System.out.println(a);
//		System.out.println("In show Method");
//	}
//	
//	
}

class B {
	B(A obj){
		System.out.println("In B Constructor");
	}
}



public class Main {
	public static void main(String[] args) {
		A obj = new A();
//		obj.display();
	}
}
