//oops concepts

public class Customer {

	
		private int customerId;
		private String customerName;
		private String customerCity;
	
		//user defined constructor
		public Customer()
		{
			System.out.println("user defined no argument constructor");
		}
		
		//user defined argument constructor
		public Customer(int id,String name,String city)
		{
			customerId=id;
			customerName=name;
			customerCity=city;
			
		}
		
		//setters and getters
		public int getCustomerId() {
			return customerId;
		}
		public void setCustomerId(int customerId) {
			this.customerId = customerId;
		}
		public String getCustomerName() {
			return customerName;
		}
		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}
		public String getCustomerCity() {
			return customerCity;
		}
		public void setCustomerCity(String customerCity) {
			this.customerCity = customerCity;
		}
		
		
		void initialize(int id,String name,String city)
		{
			customerId=id;
			customerName=name;
			customerCity=city;
		}
		
		
		@Override
		public String toString() {
			return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerCity="
					+ customerCity + "]";
		}
		
		
		
		
	}

