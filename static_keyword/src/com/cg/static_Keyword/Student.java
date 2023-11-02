package com.cg.static_Keyword;

public class Student {
	private int id;
	private String name;
	private float fees;
	private static String college = "TKR";
	
//	public Student() {
//		System.out.println("User Defined No Args Constructor");
//	}
//	
//	public Student(int id , String name) {
//		this(1,"Ramesh",5000.0f);
//		System.out.println(id+" "+name);
//	}
//	
	public Student(int id, String name, float fees) {
		super();
		this.id = id;
		this.name = name;
		this.fees = fees;
		System.out.println("User Defined Argument Constructor");
	}
	
	public static void change() {
		college = "Teegala Krishna Reddy Engineering COllege";
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
		return college;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", fees=" + fees + ", College=" + getCollege() + "]";
	}
	
	
	
}
