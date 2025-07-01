package no07;

public class AnimalSong extends Song {

	private String animal;
	
	public AnimalSong() {
		super();
		// TODO Auto-generated constructor stub
		this.animal = "";
	}

	public AnimalSong(String title, String time, String composer, String animal) {
		super(title, time, composer);
		// TODO Auto-generated constructor stub
		this.animal = animal;
	}
	//기본 노래 정보와 대상 동물 정보를 가지며, 사슴, 당나귀, 코끼리 중 하나의 값을 가진다.
	
	public String getAnimal()
	{
		return animal;
	}
	
	public void setAnimal(String animal)
	{
		this.animal = animal;
	}
	
	public String toString()
	{
		return getTitle() + ", " + getTime() + ", " + getComposer() + ", " + animal;
	}
}
