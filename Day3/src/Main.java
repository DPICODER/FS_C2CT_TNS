
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Customer obj = new Customer();//obj creation
		//obj.customerId=1;
		//obj.setCustomerId(1);
		//obj.setCustomerName("shiva");
		//obj.setCustomerCity("hyd");
		obj.initialize(2,"shiva","Hyderabad");
		
		//System.out.println(obj);
		
		Customer c1=new Customer(3,"teja","hyd");
		
		
		System.out.println(c1);
	}

}








