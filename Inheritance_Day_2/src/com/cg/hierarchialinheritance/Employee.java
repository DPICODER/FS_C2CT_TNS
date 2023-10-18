package com.cg.hierarchialinheritance;

public class Employee extends Person {

	private int empId;
	private float salary;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", salary=" + salary + "]";
	}
	
	
}
