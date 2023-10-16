import java.util.Scanner;

public class PersonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ur name:");
		String name=sc.next();
		
		System.out.println("Enter gender");
		String gender=sc.next();
		
		System.out.println("Enter age");
		 int age=sc.nextInt();
		 
		 System.out.println("Enter income");
		 int income=sc.nextInt();
		 
		
		
		//nextInt()
		//nextFloat()
		//nextDouble()
		//next() - no space
		//nextLine() - space
		
		Person p=new Person();
		p.setName(name);
		p.setAge(age);
		p.setGender(gender);
		p.setIncome(income);
		System.out.println("before"+p);
		
		Taxcalc tc=new Taxcalc();
		tc.calculateTax(p);
		System.out.println("after tax cal"+p);
		
	}

}
