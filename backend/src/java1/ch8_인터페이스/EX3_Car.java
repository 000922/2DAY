package java1.ch8_인터페이스;

public class EX3_Car {
	
	EX3_Tire frontLeftTire 	= new EX3_HankookTire();
	EX3_Tire frontRightTire = new EX3_HankookTire();
	EX3_Tire BackLeftTire 	= new EX3_HankookTire();
	EX3_Tire BackRightTire 	= new EX3_HankookTire();
	void run() {
		frontLeftTire.roll(); 	frontRightTire.roll();
		BackLeftTire.roll(); 	BackRightTire.roll();
	}
	
}
