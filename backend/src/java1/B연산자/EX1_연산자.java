package java1.B연산자;

public class EX1_연산자 { // class s

	public static void main(String[] arge) {
		
		int 정수1 = 10; int 정수2 = 20;
		System.out.println(" 더하기 : "+ 정수1+정수2 );
		System.out.println(" 더하기 : "+ (정수1+정수2));
		System.out.println(" 뺴기 : "+ (정수1-정수2) );
		System.out.println(" 곱하기 : "+ (정수1*정수2) );
		System.out.println(" 나누기 : "+ (정수1/정수2) );
		System.out.println(" 나머지 : "+ (정수1%정수2) );
		
		// 2. 비교
		System.out.println("이상 : " +( 정수1>=정수2 ) );
		System.out.println("이하 : " +( 정수1<=정수2 ) );
		System.out.println("초과 : " +( 정수1>정수2 ) );
		System.out.println("미만 : " +( 정수1<정수2 ) );
		System.out.println("같다 : " +( 정수1==정수2 ) );
		System.out.println("같지않다 : " +( 정수1!=정수2 ) );
		
		// 3. 논리
		int 정수3 = 30; int 정수4 = 40;
		System.out.println(" 13.&&[AND] " + (정수1>=정수2 && 정수3>=정수4) );
		System.out.println(" 14.||[OR] " + (정수1 >= 정수2 || 정수4 >= 정수3) );
		
		// 4. 증감
		int 정수5 = 10;
		System.out.println("후위증가 : " + (정수5++) ); 	// 출력 후에 1 증가 
		System.out.println(" 확인 :" +정수5 );
		System.out.println(" 선위증가 :" + (++정수5) ); 	// 출력 전에 1 증가
		System.out.println(" 후위감소 : " + (정수5--) );   	// 출력 후에 1 감소
		System.out.println(" 확인 : " + 정수5 );
		System.out.println(" 선위감소 : " + (--정수5) ); 	// 출력 전에 1 감소

	}
	
} // class e

/*
 	연산자 : 계산시 사용되는 특수문자
 		1. 산술연산자
 			+ 더하기 -뺴기 *곱하기 /나누기 %나머지
 			+연결연산자
  		2.비교연산자	-> 걀과 : true 혹은 false
  			>=이상[크거나같다]	>초과[크다]	==[같다]
  			<=이하[작거나같다]	<미만[작다]	!=[같지않다]
  		3.논리연산자 :	비교연산자 2개 이상 작성
  			5 <= a <= 10 [x] [이런거 안됨] ---> and / or [이런거 쓰자]
  			
  			&& 	: and[이면서 면서 이고 그리고 모두 ]
  			|| 	: or	[ 이거나 거나 또는 하나라도 ]
  			! 	: not [부정(반대) : true -> false / false -> true
  			
  		4.대입연산자
  			= 	: 오른쪽 데이터를 왼쪽 저장(대입)
  			+= 	: 오른쪽 데이터를 온쪽 데이터와 더한 후 왼쪽에 대입
  			*= /= %= -=
  		5.증감연산자
  			변수++ [ 1증가 ]
  			변수-- [ 1감소 ]
  		6.삼항연산자
  			조건식 ? 참 : 거짓
  			조건식1 ? 조건식2 ? 참2 : 거짓2 : 거짓1 ---> 조건식이 많으면 가독성 떨어짐 -> if 사용
  			
  			
 */
