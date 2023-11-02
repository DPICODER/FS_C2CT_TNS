package com.cg.static_Keyword;

public class Variables {

	public static void main(String[] args) {
		Student s1 = new Student(1,"Ramesh",5000.0f );
		Student s2 = new Student(2,"Suresh",6000.0f );
		Student s3 = new Student(3,"Somesh",7000.0f );
		Student s4 = new Student(4,"Komtesh",8000.0f );
		Student s5 = new Student(5,"Mallesh",9000.0f );
		
		Student.change();
		
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
	}
}
