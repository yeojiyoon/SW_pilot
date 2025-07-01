package no07;

import java.util.ArrayList;
import java.util.List;

public class MusicLibary {
	/*
	 * 1. 새로운 음악을 추가할 수 있다. (추가된 음악의 정보가 출력된다.)

		2. 기존 음악 제목으로 삭제할 수 있다. (삭제된 음악 정보가 출력한다.)
		
		3. 동물을 위한(또는 사람을 위한) 모든 음악 조회하기
		
		4. 제목/대상 동물/장르 등 조건으로 음악 검색하기
	 */
	
	private int flag; //0:사람 1:동물
	
	List<AnimalSong> animalSong = new ArrayList<>();
	List<ManagerSong> managerSong = new ArrayList<>();
	
	public void matchFlag(String genre)
	{
		if(genre.equals("사슴") || genre.equals("당나귀") || genre.equals("코끼리"))
		{
			this.flag = 1;
		}
		
		else if(genre.equals("재즈") || genre.equals("팝") || genre.equals("클래식") || genre.equals("힙합"))
		{
			this.flag = 0;
		}
		else
		{
			this.flag = -1;
			System.out.println("장르가 잘못되었습니다.");
		}
	}
	
	public void addSong(String title, String time, String composer, String genre)
	{
		matchFlag(genre);
		if(flag==1)
		{
			animalSong.add(new AnimalSong(title, time, composer, genre));
			System.out.print("새로운 노래 \"");
			System.out.print(animalSong.get(animalSong.size()-1));
			System.out.println("\" 추가되었습니다.");
		}
		else if(flag==0)
		{
			managerSong.add(new ManagerSong(title, time, composer, genre));
			System.out.print("새로운 노래 \"");
			System.out.print(managerSong.get(managerSong.size()-1));
			System.out.println("\" 추가되었습니다.");
		}
	}
	
	public void delSong(String title)
	{
		for (int i = 0; i < animalSong.size(); i++)
		{
			if(animalSong.get(i).getTitle().equals(title))
			{
				System.out.print("노래 \"");
				System.out.print(animalSong.remove(i));
				System.out.println("\" 삭제되었습니다.");
			}
		}
		
		for (int i = 0; i < managerSong.size(); i++)
		{
			if(managerSong.get(i).getTitle().equals(title))
			{
				System.out.print("노래 \"");
				System.out.print(managerSong.remove(i));
				System.out.println("\" 삭제되었습니다.");
			}
		}
	}
	
	public Song findSongForTarget(String target)
	{
		if(target.equals("사람"))
		{
			return managerSong.get(0);
		}
		
		else if(target.equals("동물"))
		{
			return animalSong.get(0);
		}
		
		else
		{
			return managerSong.get(0);
		}
	}
}
