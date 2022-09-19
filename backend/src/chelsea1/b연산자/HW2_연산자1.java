package chelsea1.b연산자;

import java.util.Scanner;

public class HW2_연산자1 {	// c s

	public static void main(String[] args) {	// m s
		// 입력객체 선언
		Scanner scanner = new Scanner(System.in);
		/*
		  	문제1 : 급여 계산 
					[조건] 입력받기 : 기본급 , 수당 
					[출력] 실수령액 = 기본급 + 수당 - 세금[기본급10%]
		  */
		
			// 문제 1 
			System.out.print("문제1) 기본급 : "); 	int 기본급 = scanner.nextInt();
			System.out.print("문제1) 수당 : "); 	int 수당 = scanner.nextInt();
			int 실수령액 = 기본급 + 수당 - (int)(기본급*0.1); 
			System.out.println("문제1) 결과 : " + 실수령액 );
			
		
		/*
			문제2 : 지폐 개수 세기 
			[조건] 십만원 단위의 금액을 입력받기 
			[출력] 입력받은 금액의 지폐수 출력 
			[예시]  356789
			십만원 : 3장 
			만원 : 5장 
			천원 : 6장 
		 */
			// 문제 2
			System.out.println("문제2) 금액 : ");
			int 금액;
			금액 = scanner.nextInt();
				// 1. 십만원 계산
				System.out.println("십만원 : " + (금액/100000)+"장");
					금액 -= ( 금액/100000)* 100000;
				System.out.println("만원 : " + (금액/10000)+"장");
				System.out.println("천원 : " +  (금액/1000)+"장");
				System.out.println("맞다 :  " +  ( 금액 == 7 ));
						
		// 문제3 : 하나의 정수를 입력받아 7의 배수 이면 '맞다' 아니면 '아니다' [ if x ]
		
		// 문제 3	[ 배수 : 값%수 == 0	, 값은 그 수의 배수 ]
		System.out.println("문제3) 정수 입력 : ");
		int 문제3 = scanner.nextInt();
		String 결과3 = 문제3 % 7 == 0 ? "7배수 맞습니다." : "7배수 아니다.";
			// 삼향연산자= 	조건		?		참		 :	거짓
		System.out.println("결과3) : " + 결과3 );
		
				
		// 문제4 : 하나의 정수를 입력받아 홀수이면 이면 '홀수' 아니면 '짝수' [ if x ]
		
		// 문제 4
		System.out.println("문제4) : "); int 문제4 = scanner.nextInt();
		String 결과4 = 문제4 % 2 == 1 ? "홀수" : "찍수";
		System.out.println("결과4) : " + 결과4);
		
		// 문제5 : 하나의 정수를 입력받아 7의 배수 이면서 짝수 이면 '참' 아니면 '거짓' 
		
		// 문제 5
		System.out.println("문제5) 정수 입력 :"); int 문제5 = scanner.nextInt();
		String 결과5 = ( 문제5 % 7 == 0 && 문제5 % 2 == 0 ) ? "참" : "거짓" ;
		System.out.println("결과5) : " + 결과5);
		
		// 문제6 : 두개의 정수를 입력받아 더 큰수 출력 
		
		// 문제 6
		System.out.println("문제6_1 정수 입력 : ");	int 문제6_1 = scanner.nextInt();
		System.out.println("문제6_2 정수 입력 : ");	int 문제6_2 = scanner.nextInt();
		System.out.println("결과6) : " + (문제6_1 > 문제6_2 ? 문제6_1 : 문제6_2 ) );
		
		// 문제7 : 반지름을 입력받아 원 넓이 출력하기 

		// 문제 7
		System.out.println("문제7)3.14 : "); 	double 반지름 = scanner.nextDouble();
		System.out.println("결과 원넓이 : " + (반지름*반지름*3.14) );
		
		// 문제8 : 두 실수를 입력받아 앞실수의 값이 뒤의 값의 몇 %인지 출력하기 
		// ?????
		
		// 문제 8
		// ?????
		
		// 문제9 : 사다리꼴 넓이 구하기 [ 윗변과 밑변 높이를 입력받아 출력하기 ]
		
		// 문제 9
		System.out.println("문제9) 윗변 : ");	  		double 윗변 = scanner.nextDouble();
		System.out.println("문제9) 밑변 : ");	  		double 밑변 = scanner.nextDouble();
		System.out.println("문제9) 높이 : ");	  		double 높이 = scanner.nextDouble();
		System.out.println("결과 : " + ( (윗변*밑변)*높이/2));
		
		// 문제10: 키를 정수를 입력받아 표준체중 출력하기
		// ????
		// 문제 10
		// ?????
		
		// 문제11 : 키와 몸무게를 입력받아 BMI 출력하기
		// ?????
		// 문제 11
		// ?????
		
		// 문제12 : inch 를 입력받아 cm 로 변환하기 [ 1 inch -> 2.54cm ]
		
		// 문제 12
		System.out.println("문제12) : "); 		double inch = scanner.nextDouble();
		System.out.println("결과: cm : " + (inch*2.54) );
		
		
		/*
		  문제13 :  중간고사, 기말고사, 수행평가를 입력받아 반영비율별 계산하기
							소수 둘째 자리 까지 점수 출력하기
							중간고사 반영비율 => 30 %
							기말고사 반영비율 => 30 %
							수행평가 반영비율 => 40 %
		 */
		
		// 문제 13
		System.out.print("문제13) :");
		System.out.print("중간고사 : "); 	double 중간고사 = scanner.nextInt()*0.3;
		System.out.print("기말고사 : "); 	double 기말고사 = scanner.nextInt()*0.3;
		System.out.print("수행평가 : "); 	double 수행평가 = scanner.nextInt()*0.4;
		System.out.printf("결과 : %.2f" , (중간고사+기말고사+수행평가) );
		
		// 문제14 :  연산 순서 나열 하고 x와 y값 예측하기
		// ???
		// 문제 14
		// ???/
		
		
	} // m e
	
}	// c e
