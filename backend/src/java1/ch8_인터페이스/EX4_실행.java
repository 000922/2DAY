package java1.ch8_인터페이스;

public class EX4_실행 {
	public static void main(String[] args) {
		
		// 1. 인터페이스 변수에 구현객체 대입
		EX4_Vehicle vehicle = new EX4_Bus();
		
		vehicle.run();
		
		// 2. 인터페이스에 없는 메소드 이므로 사용불가
		// vehicle.checkFare(); // [X]
		
		// 3. 형변환 [ 인터페이스 -> 객체 ]
			// 객체/변수 명 instanceof 클래스명
		System.out.println("관계확인 : " + (vehicle instanceof EX1_Television) );
		System.out.println("관계확인 : " + (vehicle instanceof EX4_Bus ) );
		
		EX4_Bus bus = (EX4_Bus)vehicle;
		
		bus.run();
		bus.checkFare();
		
		
		
		
		
	} // main end

} // class end
