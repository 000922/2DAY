package java1.ch5클래스.EX.EX10;

public class EX10실행 {
	
	public static void main(String[] args) {
		
		// 1. 객체 선언
		Car myCar = new Car();
		
		// 2. 객체에 메소드 호출 
		myCar.setGas(5); 	// 매개변수 5 // 반환 x
		
		// 3. 객체에 메소드 호출
		boolean gasState = myCar.isLeftGas();	// 항상 오른쪽 부터 실행 
			// 매개변수 x // 반환 boolean 
		
			// gasState = true 
		
		if( gasState ) {
			System.out.println("출발합니다.");
			myCar.run(); // 매개변수 x // 반환 x 
		} 
		
		// 4.
		if( myCar.isLeftGas() ) {
			System.out.println("gas를 주입할 필요가 있습니다.");
		}else {
			System.out.println("gas를 주입 하세요.");
		}
		
	}	// main end
}	// class end
