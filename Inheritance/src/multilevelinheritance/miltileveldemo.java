package multilevelinheritance;

public class miltileveldemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		City c = new City();
		c.setCity("Hyderabad");
		c.setArea("santoshnager");
		
		c.setStateName("Telangana");
		c.setLanguage("Telugu");
		
		State s = new State();
		
		s.setStateName("Andhrapradesh");
		s.setLanguage("Telugu");
		
		c.setCountryName("India");
		c.setCapital("Delhi");
		
		System.out.println(c);
	}

}
