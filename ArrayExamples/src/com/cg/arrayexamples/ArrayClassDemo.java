package com.cg.arrayexamples;
import java.util.*;
public class ArrayClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intArr[] = {1,4,7,2,5,8,3,6,9};
//		to print Array as Array itself we use toString Method
		System.out.println(Arrays.toString(intArr));
		
		int len = intArr.length;
		
		
//		For loop
		for(int i = 0 ; i < len ; i++) {
			System.out.print(intArr[i]);
		}
		
		System.out.println(" ");
		
//		For Each for Retrieving Array Data
		for(int i:intArr){
			System.out.print(i);
		}
		
		System.out.println(" ");
		
//		sorting in Ascending
		Arrays.sort(intArr);
		
		System.out.println(Arrays.toString(intArr));
	
		int key = 6;
		System.out.println("Index of key "+key + " is " + Arrays.binarySearch(intArr, key));
		
		int intArr2[] = {9,6,3,8,5,2,7,4,1};
		
		System.out.println(" ");
		
		if(Arrays.equals(intArr,intArr2))
			System.out.println("Both are Equal");
		else
			System.out.println("Both are Not Equal");
		
		System.out.println(" ");
//	Making Copy of Existing Array with Different Array size
		int intArr3[] = Arrays.copyOf(intArr2,10);
		
		System.out.println(Arrays.toString(intArr3));
		
		System.out.println(" ");
		
		
	}
	

}
