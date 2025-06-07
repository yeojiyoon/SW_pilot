package no03;

public class Animal extends Organism{
	private String d_method;
	private String prey;

	public Animal(String name, String species, String habitat, String d_method, String prey) {
		super(name, species, habitat);
		
		this.d_method = d_method;
		this.prey = prey;
	}
	
	public String getMethod()
	{
		return d_method;
	}
	
	public String getPrey()
	{
		return prey;
	}
	
	public void setMethod(String d_method)
	{
		this.d_method = d_method;
	}
	
	public void setPrey(String prey)
	{
		this.prey = prey;
	}
	/*
	 * 소화방식, 먹이 필드를 추가한다.
		super 키워드로 부모 클래스를 생성자를 활용해 객체를 초기화하는 생성자를 구현한다.
	 */
	
	public void displayInfo()
	{
		System.out.println(super.getName() + ", " + super.getSpecies() + ", " + super.gethabitat() + ", " + d_method + ", " + prey);
	}
	
	//displayInfo 메서드를 재정의한다.
}
