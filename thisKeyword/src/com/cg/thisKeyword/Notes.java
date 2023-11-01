package com.cg.thisKeyword;

public class Notes {
	
	void display()
	{
		System.out.println("this Output :" + this);
	}
	
	public static void main(String[] args) {
		Notes n = new Notes();
		Notes n1 = new Notes();
		Notes n2 = new Notes();
		Notes n3 = new Notes();
		
		n1.display();
		
		System.out.println(n);
		System.out.println("N output :" +n1);
		System.out.println(n2);
		System.out.println(n3);
	}
}
