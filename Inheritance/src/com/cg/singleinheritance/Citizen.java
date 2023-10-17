package com.cg.singleinheritance;

public class Citizen {
//	
// parent class is called as Base class or Super Class
	private String name;
	private String aadharNo;
	private String city;
	private long phno;
	
	public Citizen(String name, String aadharNo, String city, long phno) {
//		super();
		this.name = name;
		this.aadharNo = aadharNo;
		this.city = city;
		this.phno = phno;
	}
	
	public Citizen() {
		super();
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	@Override
	public String toString() {
		return "Citizen [name=" + name + ", aadharNo=" + aadharNo + ", city=" + city + ", phno=" + phno + "]";
	}
	
	
	
	
}
