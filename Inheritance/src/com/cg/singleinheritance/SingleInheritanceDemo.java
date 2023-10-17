package com.cg.singleinheritance;

public class SingleInheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Citizen c = new Citizen();
//		c.setName("Ramesh");
//		c.setAadharNo("1234 5678 9123");
//		c.setCity("Hyderabad");
//		c.setPhno(965217531);
//		
//		System.out.println(c.getName()+" " + c.getAadharNo()+" " + c.getCity()+" "+c.getPhno());
//		System.out.println(c);
		Student s = new Student("Ramesh", "1234 5678 9123", "Hyderabad", 98742311, 101, "ABC College");
        System.out.println(s);		
		}

}
