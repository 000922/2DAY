package chelsea1.테스트.Level1;

import java.util.Scanner;

public class EX7 {

	
	public static void main(String[] args) {
		System.out.println(" >> Level1_7 answer >> ");
		System.out.println(" >> answer time : " + " >> \n" );
		Scanner scanner = new Scanner(System.in);
		
		String output = "";
		
		/* 문제풀이 위치 */
		System.out.print("회원명 String : "); 	String name = scanner.next();
		System.out.print("상태 boolean : ");		Boolean bool = scanner.nextBoolean();
		System.out.print("회원번호 byte : ");		Byte number = scanner.nextByte();
		System.out.print("성별 char : ");		String 성별 = scanner.next();
		System.out.print("포인트 int : ");	    int point = scanner.nextInt();
		System.out.print("예금액 long : ");		Long money = scanner.nextLong();
		System.out.println("키 float : ");	 	Float height = scanner.nextFloat();
		System.out.println("몸무게 double : ");	Double kg = scanner.nextDouble();

		// ---------------------------------------------------------------------------- //
		
		System.out.println("----------회원 개인정보----------");
		System.out.println(" 원명 	: "+ name );
		System.out.println(" 상태 	: "+ bool );
		System.out.println(" 원번호 	: "+ number );
		System.out.println(" 성별 	: "+ 성별 );
		System.out.println(" 포인트 	: "+ point );
		System.out.println(" 예금액 	: "+ money );
		System.out.println(" 키		: "+ height );
		System.out.println(" 몸무게 	: "+ kg );
		System.out.println("-------------------------------");
		
		/* ----------- */
	}
}
/* 
[문제조건] 
	1. 문제풀이 위치 외 코드는 수정 불가 합니다.
	2. 기본 자료형8개 + 문자열클래스 변수 1개 를 이용한 9개변수를 입력 받습니다.
	3. 입력받은 9개 변수를 그림과 같이 출력합니다.
	4. 기존에 미리 작성된 변수를 최대한 활용합니다.
	
*/