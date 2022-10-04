package java1.ch8_인터페이스;

public class EX1_Audio implements EX1_RemoteControl {

	private int volume;
	
	@Override
	public void turnOn() { System.out.println("Audio 켭니다."); }
	@Override
	public void turnOff() { System.out.println("Audio 끕니다."); }
	@Override
	public void setVolume(int volume) { 
		if(volume>EX1_RemoteControl.MAX_VOLUME) {
			this.volume = EX1_RemoteControl.MAX_VOLUME; // tv소음을 10 고정
		} else if(volume<EX1_RemoteControl.MIN_VOLUME) {
			this.volume = EX1_RemoteControl.MIN_VOLUME;			
		} else {
			this.volume = volume ;
		}
		System.out.println("현재 audio 볼륨 : " + this.volume);
	}
	
	
	
} // class end
