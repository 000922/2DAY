package chelsea1.b연산자;

public class HW1_연산자2 {	// c s

	public static void main(String[] args) {	// m s
		
		// 1. 산술
		int 정수1 = 10; int 정수2 = 20;
		System.out.println(" 더하기 : "+ 정수1+정수2 );
		System.out.println(" 더하기 : "+ (정수1+정수2));
		System.out.println(" 뺴기 : "+ (정수1-정수2) );
		System.out.println(" 곱하기 : "+ (정수1*정수2) );
		System.out.println(" 나누기 : "+ (정수1/정수2) );
		System.out.println(" 나머지 : "+ (정수1%정수2) );
		
		// 2. 비교
		System.out.println("이상 : " + ( 정수1 >= 정수2 ));
		System.out.println("이하 : " + ( 정수1 <= 정수2 ));
		System.out.println("초과 : " + ( 정수1 > 정수2 ));
		System.out.println("미만 : " + ( 정수1 < 정수2 ));
		System.out.println("같다 : " + ( 정수1 == 정수2 ));
		System.out.println("같지않다 : " + ( 정수1 != 정수2 ));
		
		// 3. 논리
		int 정수3 = 30; int 정수4 = 40;
		System.out.println(" 13.&&[AND] " + (정수1>=정수2 && 정수3>=정수4));
		System.out.println(" 14.||[QR] " + (정수1>=정수2 || 정수3>=정수4));
		
		// 4. 증감
		int 정수5 = 10;
		System.out.println("후위증가 : " + (정수5++) );
		System.out.println("확인 : " +정수5);
		System.out.println("선위증가 : " + (++정수5) );
		System.out.println("후위증가 : " + (정수5--) );
		System.out.println("확인 : " +정수5);
		System.out.println("선위감소 : " + (--정수5) );
		
		// 5.대입연산자
		int 정수6 = 10;
		정수6 += 3 ;
		System.out.println(" 대입 결과 : "+ 정수6);
		
		정수6 -=5;
		System.out.println(" 대입 결과 : " + 정수6);
		
		// 6. 삼항연산자 
		int 점수 = 85;
		char 등급 = 점수 > 90 ?'A' : 'B';
		System.out.println(" 등급 결과 : " +등급);
		
		char 등급2 = 점수 > 90 ? 'A' : 점수 > 80 ? 'B' : 'C' ;
		System.out.println(" 등급 결과 : " + 등급2);
		
		

		
		
		
		
	}	// main e
	
}	// class e
