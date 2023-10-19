package com.cg.abstractclass_method_example;

public abstract class AbstractNotes {

//		1.Abstract Classes
//			Keyword = abstract
//			to make a class Abstract we use Abstract Keyword before the class name like [ example :- public abstract class {class name}]
//			we can also make abstract method too just as class
	
		abstract void display();
//			if abstract method is created in a class it's mandatory to make class as abstract 
//			if a class is already abstract it's optional to have a abstract method
		void show() {
			
		}
//		a Object / Instance can never be created for a abstract class
}
