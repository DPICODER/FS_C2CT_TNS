
public class Taxcalc {

	public void calculateTax(Person p)
	{
		if(p.getAge()>65 || p.getGender().equalsIgnoreCase("Female"))
		{
			p.setTax(0);
			System.out.println("Tax is not applicable");
		}
		else
		{
			if(p.getIncome()<=160000)
			{
				p.setTax(0);
			}
			else if(p.getIncome()>160000 && p.getIncome()<=500000)
	{
				p.setTax((p.getIncome()-160000)*10/100);
	
	}
			else
			{
				
			}
		}
	}
}
