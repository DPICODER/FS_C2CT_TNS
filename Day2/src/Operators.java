

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		
		++a; //a=a+1
		int c=++a + b + a--; //a=a+1 = 11+1=12 + 20
		System.out.println(c);
		
		//pre increment /pre decrement
		//1.perform operation
		//2. assign result of 1 to var
		
		//post incre /post decre
		//1. assign/use current value for calcu
		//2.perform operation
		 //a=11.b=20,c=22,d=?
		
		int d=c++ + a + b--; //44+ 11 + 20 =75
		//c++ =c+1 =44+1=45 
		System.out.println(d);
		System.out.println(c);
		System.out.println(b);
		
		//ternary operator
		int x=10;
		x=(10==x)?1:0;
		System.out.println(x);
		
		
		
		

	}
	
}
