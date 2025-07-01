package no07;

public class StringClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * MusicLibary 와 Player 클래스의 객체를 생성한다.

		라이브러리에 노래 5곡을 추가한다 (세 종류 동물을 위한 노래와 사람을 위한 노래2곡을 추가한다)

		사람을 위한 음악을 검색하고 첫번째 곡을 플레이어로 재생한다.
		
		볼륨을 30으로 설정한다.
		
		‘당나귀’를 위한 음악을 검색하고 플레이어로 재생한다.
		
		노래 제목으로 노래 1곡을 삭제한다.
		 */
		MusicLibary musicLibary = new MusicLibary();
		Player player = new Player();
		
		musicLibary.addSong("초원을 그리며", "2분", "레이나", "사슴");
		musicLibary.addSong("영웅 호테", "1분", "돈키", "당나귀");
		musicLibary.addSong("과자를 줄게", "3분", "제롬", "코끼리");
		musicLibary.addSong("화양연화", "2분", "장양림", "재즈");
		musicLibary.addSong("시간의 수평선", "4분", "하윤", "팝");
		
		musicLibary.delSong("시간의 수평선");
		
		player.nowPlaying(musicLibary.findSongForTarget("사람"));
	}
}
