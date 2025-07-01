package no07;

public class ManagerSong extends Song{

	private String genre;
	
	public ManagerSong() {
		super();
		// TODO Auto-generated constructor stub
		this.genre = "";
	}
	
	public ManagerSong(String title, String time, String composer, String genre) {
		super(title, time, composer);
		// TODO Auto-generated constructor stub
		this.genre = genre;
	}
	//기본 노래 정보와 음악 장르를 가지며, 재즈/팝/클래식/힙합 중 하나의 값을 가진다.
	
	public String getGenre()
	{
		return genre;
	}
	
	public void setGenre(String genre)
	{
		this.genre = genre;
	}
	
	public String toString()
	{
		return getTitle() + ", " + getTime() + ", " + getComposer() + ", " + genre;
	}
}
