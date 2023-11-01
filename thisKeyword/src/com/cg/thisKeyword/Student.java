package com.cg.thisKeyword;

public class Student {
	private int id ;
	private String name;
	private float fees;
	private String College;
	
	public Student (int id , String name , int fees , String College) {
		this.id = id;
		this.name = name;
		this.fees = fees;
		this.College = College;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getFees() {
		return fees;
	}
	public void setFees(float fees) {
		this.fees = fees;
	}
	public String getCollege() {
		return College;
	}
	public void setCollege(String college) {
		College = college;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", fees=" + fees + ", College=" + College + "]";
	}
	
	
	
}
