package java1.ch8_인터페이스;

public class EX4_Bus implements EX4_Vehicle {

	
	@Override
	public void run() {System.out.println("버스가 달립니다.");}
	
	public void checkFare() {System.out.println("승차요금을 체크합니다.");}
}
