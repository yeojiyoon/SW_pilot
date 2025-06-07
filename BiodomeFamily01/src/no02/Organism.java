package no02;

public class Organism { //동식물의 정보 관리
	private String name; // 멤버 변수
	private String species;
	private String habitat;
	
	//생성자(Constructor)
	public Organism(String name, String species, String habitat)
	{
		this.name = name;
		this.species = species;
		this.habitat = habitat;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getSpecies()
	{
		return species;
	}
	
	public String habitat()
	{
		return habitat;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public void setSpecies(String species)
	{
		this.species = species;
	}
	
	public void setHabitat(String habitat)
	{
		this.habitat = habitat;
	}

	//동식물의 정보를 출력하는 displayInfo 메서드를 구현한다.
	public void displayInfo()
	{
		System.out.println(name + ", " + species + ", " + habitat);
	}
}
