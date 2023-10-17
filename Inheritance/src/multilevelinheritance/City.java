package multilevelinheritance;

public class City extends State{
	
	private String city;
	private String area;

	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	@Override
	public String toString() {
		return "City [city=" + city + ", area=" + area + ", StateName=" + getStateName() + ", Language="
				+ getLanguage() + ", CountryName=" + getCountryName() + ", Capital=" + getCapital() + "]";
	}
	
	
	
	
}
