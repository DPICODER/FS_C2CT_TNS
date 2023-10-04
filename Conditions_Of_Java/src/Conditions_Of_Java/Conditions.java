package Conditions_Of_Java;

public class Conditions {
	
	public static void basic_conditions() {
		int a = 20 , b = 30 , c = 40;
		if(a > b) {
			if(a > c) {
				System.out.println("A is Bigger");
			}
		}
		else {
			if(c > b){
				System.out.println("C is bigger");
			}
			else
			System.out.println("B is Bigger");
		}
	}
	public static void main(String[] args) {
		basic_conditions();
	}
}
