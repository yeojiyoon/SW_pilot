package no06;

public class Animal {
	private String name;
	private String type;
	private String age;
	
	public Animal(String name, String type, String age)
	{
		this.name = name;
		this.type = type;
		this.age = age;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getType()
	{
		return type;
	}
	
	public String getAge()
	{
		return age;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setType(String type)
	{
		this.type = type;
	}
	
	public void setAge(String age)
	{
		this.age = age;
	}
	
	@Override
    public String toString() {
        return name + " (" + type + ", " + age + ")";
    }
}
