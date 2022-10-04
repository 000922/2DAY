package java1.ch8_인터페이스;

public class EX1_Television implements EX1_RemoteControl {
						// [implements 인터페이스 ] : 구현하다 ( 추상 구현 )
						// [ extends 클래스 ] : 연장하다 ( 상속 )
	
	// 1. 필드
	private int volume;
	// 2. 생성자 
	// 3. 메소드
	// RemoteControl 인터페이스의 추상메소드를 구현하자
	@Override
	public void turnOn() { System.out.println(" TV를 켭니다."); }
	@Override
	public void turnOff() { System.out.println("TV를 끕니다."); }
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
		
	}
	
	
	
	
	
	
} // class end
