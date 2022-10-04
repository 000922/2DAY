package java1.ch8_인터페이스;

public class EX1_실행 {
	
	public static void main(String[] args) {
	
		// 1. 객체 [ 인터페이스 x ]
		EX1_Television tv = new EX1_Television();
		// 1. 인터페이스 구현 객체
		// 인터페이스 변수명 = new 구현클래스( );
		EX1_RemoteControl rc;
		
		// 2. 인터페이스 변수에 구현객체 대입
		rc = new EX1_Television();	// 리모콘에 텔레비전 가능 탑재
		
		// 3. 메소드 실행
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		
		System.out.println("TV --> Audio 변경");
		
		// 2. 인터페이스 변수에 구현객체 변경
		rc = new EX1_Audio();		// 리모콘에 오디오 기능 변경
		
		// 3. 메소드 실행 
		rc.turnOn();
		rc.setVolume(7);
		rc.turnOff();
		
		System.out.println("Audio --> 스마트tv 변경");
		
		EX1_SmartTelevision stv = new EX1_SmartTelevision();
		
		rc = stv;
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		EX1_Searchable sc = stv;
		sc.search("11번");
		
	} // main end
}	// class end
