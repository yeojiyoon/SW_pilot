package no07;

public class Song {
	//각 노래는 제목, 재생시간, 음악가 정보를 가진다.
	private String title;
	private String time;
	private String composer;
	
	public Song()
	{
		this.title="";
		this.time="";
		this.composer="";
	}
	
	public Song(String title, String time, String composer)
	{
		this.title = title;
		this.time = time;
		this.composer = composer;
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public String getTime()
	{
		return time;
	}
	
	public String getComposer()
	{
		return composer;
	}
	
	public void setTitle(String title)
	{
		this.title = title;
	}
	
	public void setTime(String time)
	{
		this.time = time;
	}
	
	public void setComposer(String composer)
	{
		this.composer = composer;
	}
	
	public String toString()
	{
		return title + ", " + time + ", " + composer;
	}
}
