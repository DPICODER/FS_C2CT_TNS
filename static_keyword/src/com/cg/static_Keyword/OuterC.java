package com.cg.static_Keyword;

public class OuterC {
	
	static int data = 30;
	
	static class Inner{
		void msg() {
			System.out.println(data);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterC.Inner obj = new OuterC.Inner();
		obj.msg();
	}

}
