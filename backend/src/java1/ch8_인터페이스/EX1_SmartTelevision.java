package java1.ch8_인터페이스;

public class EX1_SmartTelevision implements EX1_RemoteControl, EX1_Searchable {

	private int volume;
	
	@Override
	public void search(String url) { System.out.println(url + "을 검색합니다."); }
	@Override
	public void turnOn() { System.out.println(" 스마트TV를 켭니다."); }
	@Override
	public void turnOff() { System.out.println("스마트TV를 끕니다."); }
	@Override
	public void setVolume(int volume) { 
		// 만일 현재 TV 소음이 리모콘의 최대소음보다 크면
		if(volume>EX1_RemoteControl.MAX_VOLUME) {
			this.volume = EX1_RemoteControl.MAX_VOLUME; // tv소음을 10 고정
		} else if(volume<EX1_RemoteControl.MIN_VOLUME) {
			this.volume = EX1_RemoteControl.MIN_VOLUME;			
		} else {
			this.volume = volume ;
		}
		System.out.println("현재 스마트 tv 볼륨 : " + this.volume);
	}
	
	
} // class end
