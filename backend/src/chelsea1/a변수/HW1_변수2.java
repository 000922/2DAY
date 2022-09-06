package chelsea1.a변수;	// 패키지명

// 1. 클래스선언 [ 모든 코드는 클래서에서 작성된다. ]
public class HW1_변수2 {	// class s
	
	// 1. 장동완ㅅ겅 [ cltrl + 스페이스바 ]
	// 2. main 메소드 작성 [ main + 자동완성 ]
			// main 함수 : 코드를 읽어주는 함수 
	public static void main(String[] args) {	// main s
		
		// p.48
		// 변수 : 변하는수 [ 데이터 1개 저장 가능한 메모리 ]
		// p.52
		int value; // 변수의 선언 [ 자료형 변수명 ; ** 끝에 ;
		// syso + 자동완성
			// !! 오류발생 : 변수에 데이터가 없기 때문에
			// System.out.println(value); // console  출력함수 [ js : consle.log ( ) ]
		value = 10; // 변수에 값 대입
		System.out.println(value);
		
		// p.53
		int hour = 3;	// 변수 선언과 ㄱ동시에 값 대입 [ 초기화 = 처음에 값 넣어준다. ]
		int minute = 5;
		System.out.println( hour +"시간" + minute +"분");
		 			// + 연산자
						// 1. 연결 연산자 : 변수 + "문자열" + 변수 + "문자열"
								// 3+java	=> 	java
						// 2. 더하기 연산자 : 변수[숫자] + 변수[숫자]
								// 3+3 		=> 6
		int totalMinte = ( hour*60) + minute;		// +더하기 연산자
		System.out.println("총" +totalMinte + "분");	// + 연결 연산자
		
		// p.53 변수값 교환
		int x = 3;
		int y = 5;
		System.out.println("x : " + x + " , y : " + y);
				// 코드는 순서대로[순서도/알고리즘] 하나씩 처리한다.
				// x = y 	// x = 5 y = 5
				// y = x 	// x =5  y = 5
		// 임시 보관 [ 문제 해결 = 임시 변수 생성 ]
		int temp = x;
		x = y;
		y = temp;
		System.out.println("x : " + x + " , y : " + y);
	}	// main e
}	// class e
/*-------------------------------------------------------------------*/
/*
  	변수 선언 
  		1. 자료형 [ 변수의 크기 [
  		2. 변수명 [ 변수의 이름 ] --> 변역 --> 메모리 주소 찾아가기
  		3. 값 [변수에 들어있는 데이터 ]
  	
  		int value = 10
  		[1] [2] 	[3]
  		자료형 변수명 = 데이터
  		
  		컴퓨터 [ 0 , 1 ]
  						본체
  						1. CPU : 관리,감독,변역 등
  						2. 주기억장치[RAM]	: 저장[QUSTN] 프로그램 실행시 [ 휘발성메모리]
  						3. 보조기억장치 [ ROM ] : .CLASS코드파일 [ 비휘발성 메모리 ] : DB
  						메모리 [ RAM]
  						OXIF8BID2	[16진수 메모리 주소 ]
  
  
  
 */
















