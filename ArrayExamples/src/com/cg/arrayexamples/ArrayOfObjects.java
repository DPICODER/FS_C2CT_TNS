package com.cg.arrayexamples;

import java.util.Arrays;

public class ArrayOfObjects {

	public static void main(String[] args) {
//		User Defined
		Student arr[] = new Student[5];
		arr[0] = new Student(10,"Ramesh");
		arr[1] = new Student(11,"Suresh");
		arr[2] = new Student(12,"Somesh");
		arr[3] = new Student(13,"Komtesh");
		arr[4] = new Student(14,"Mallesh");
		
//		predefined
		
		int intArr[] = new int[5];
		intArr[0] = 10;
		intArr[1] = 20;
		intArr[2] = 30;
		intArr[3] = 40;
		intArr[4] = 50;
		
		
		System.out.println(Arrays.toString(arr));
		System.out.println(" ");
		System.out.println(Arrays.toString(intArr));
	}

}
