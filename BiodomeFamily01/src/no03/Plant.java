package no03;

public class Plant extends Organism{
	private String period;
	private String existence;
	
	public Plant(String name, String species, String habitat, String period, String existence) {
		super(name, species, habitat);
		// TODO Auto-generated constructor stub
		this.period = period;
		this.existence = existence;
	}
	
	public String getPeriod()
	{
		return period;
	}
	
	public String getExistence()
	{
		return existence;
	}
	
	public void setPeriod(String period)
	{
		this.period = period;
	}
	
	public void setExistence(String existence)
	{
		this.existence = existence;
	}

	public void displayInfo()
	{
		System.out.println(super.getName() + ", " + super.getSpecies() + ", " + super.gethabitat() + ", " + period + ", " + existence);
	}

}
