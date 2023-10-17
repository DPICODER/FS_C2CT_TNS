package com.cg.singleinheritance;

public class Student extends Citizen {
	private int rollNo;
	private String collegeName;
	public int getRollNo() {
		return rollNo;
	}
//	child class is aka Derived class or Sub Class
	
	public Student() {
		super();
	}
	public Student(String name , String aadharNo , String city , long phNo, int rollNo , String collegeName) {
		super(name,aadharNo,city, phNo);
		this.rollNo = rollNo;
		this.collegeName = collegeName;
	}
	
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", collegeName=" + collegeName 
				 + ",Name=" + getName() + ", AadharNo="
				+ getAadharNo() + ", City=" + getCity() + ", Phno=" + getPhno() + "]";
	}
	
	
}
