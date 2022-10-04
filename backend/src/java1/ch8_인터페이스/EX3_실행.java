package java1.ch8_인터페이스;

public class EX3_실행 {

	public static void main(String[] args) {
	
		EX3_Car myCar = new EX3_Car();
		myCar.run();
		
		// 구현객체 교체
		myCar.frontLeftTire = new EX3_KumhoTire();
		myCar.frontRightTire = new EX3_KumhoTire();
		
		myCar.run();
	}
	
	
	
}
