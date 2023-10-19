package com.cg.InterfaceExample;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Shape s = new Shape {ERROR}
		Circle c = new Circle();
		c.input();
		c.radius();
		
		Shape s1 = new Circle();
		s1.input();
//		s1.output();
//		no object can be created for interface 
//		but can be referenced to implementing class
//		s1.radius(); we cannot access the radius method because it
//		is being called through reference object 
//		so it will only access the methods which are implemented in 
//		referenced object {interface}
	}

}
