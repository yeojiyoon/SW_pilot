package no07;

public class Player {
	/*
	 * 1. 음악을 1곡 재생할 수 있다.

		2. 현재 재생중인 음악 정보 속성을 가진다.
		
		3. 음악 볼륨 정보 속성을 가진다.
		
		4. 볼륨 초기값은 1이다.
		
		5. 청각에 예민한 동물을 위한 노래는 음악 볼륨 범위가 0~5이다.
		
		6. 사람을 위한 노래는 볼륨 범위는 0~50이다.
		
		7. 음악 재생/일시 정지 메서드가 있다. (재생할 때 음악 정보를 출력한다.)
		
		8. 음악 볼륨을 조절 메서드가 있다. (볼륨을 조절할 때 볼륨값을 출력한다.)
		
		9. 동물을 위한 음악을 재생하기 전, 볼륨을 확인하고 5이상이면 자동으로 줄인다.
	 */
	private int volume;
	private int flag;//0:사람 1:동물
	
	AnimalSong animalSong = new AnimalSong();
	ManagerSong managerSong = new ManagerSong();
	
	public Player()
	{
		setVolume(1);
		setFlag(-1);
	}
	
	public void nowPlaying(ManagerSong managerSong)
	{
		setFlag(0);
		this.managerSong = managerSong;
	}
	
	public void nowPlaying(AnimalSong animalSong)
	{
		setFlag(1);
		this.animalSong = animalSong;
	}

	public int getFlag() {
		return flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}
}
