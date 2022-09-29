package java1.ch7_상속.EX5_타이어예제;

public class EX5_실행 {
	public static void main(String[] args) {
		
		
		// 1. 자동차 생성
		Car car = new Car();
			// tire 객체가 4개 
		
		// 2. 자동차 5번ㅇ 회전
		for( int i=1; i<=5; i++) {
			int result = car.run();
			
			
			// 3. 만약에 펑크이면 타이어 교체
			if( result == 1 ) { // 앞왼쪽
				System.out.println("앞왼쪽 HankookTire로 교체 ");
				car.frontLeftTire = new HankookTire(15 , "앞왼쪽");
			}
			if( result == 2 ) {	// 앞오른쪽
				System.out.println("앞오른쪽 HankookTire로 교체 ");
				car.frontRightTire = new HankookTire(13 , "앞오른쪽");
			}
			if( result == 3 ) {	// 뒤온쪽
				System.out.println("뒤왼쪽 KumhoTire로 교체 ");
				car.backLeftTire = new KumhoTire(14 , "뒤왼쪽");
			}
			if( result == 4 ) {	// 뒤오른쪽
				System.out.println("뒤오른쪽 KumhoTire로 교체 ");
				car.backRightTire = new KumhoTire(17 , "뒤오른쪽");
			}
			
			System.out.println("==================================");
			
		} // for end
		
		
		
		
		
		
	} // main end
}	// class end
