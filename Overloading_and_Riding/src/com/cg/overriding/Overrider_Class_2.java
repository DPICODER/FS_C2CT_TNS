package com.cg.overriding;

public class Overrider_Class_2 extends MethodOverridr{
	
	public static void addition (int a , int b) {
		System.out.println("Entering Addition Method Child {Overridden by child}");
		System.out.println("Addition : "+(a+b));
	}
	
}
