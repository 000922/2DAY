package chelsea1.a변수;

import java.util.Scanner;

public class HW5_입출력3 { // class s
	
	public static void main(String[] args) {	// main s
		
		int 변수	= 123;
		System.out.println( 변수 + "원");
		System.out.printf("%d원\n" , 변수);
		
		int value = 123;
		System.out.printf("상품의 가격:%d원\n" , value);
		System.out.printf("상품의 가격:%6d원\n" , value);
		System.out.printf("상품의 가격:%-6d원\n" , value);
		System.out.printf("상품의 가격:%06d원\n" , value);
		
		double area = 6.2215 * 10 * 10;
		System.out.printf("반지름이 %d인 원의 넓이: %10.2f\n" , 10 ,area);
		
		// 2.
		String name = "마운트";
		String job = "선수";
		System.out.printf("%6d| %-10s|%10s\n" , 1 , name , job);
		
		// 선언
		Scanner 입력객체 = new Scanner(System.in);
		
		int 입력정수 = 입력객체.nextInt();
		System.out.println("입력받은 정수 : +입력정수");
		
		String 입력문자열 = 입력객체.next();
		System.out.println("입력받은 문자열 : " + 입력문자열);
		
		// 저장
		Scanner scanner = new Scanner(System.in);
		System.out.print("이름 :");		String 이름 = scanner.next();
		System.out.print("나이 :");		int 나이 = scanner.nextInt();
		System.out.print("키 :");		double 키 = scanner.nextDouble();
		//
		System.out.println("-------개인정보---------");
		System.out.printf("%5s \t 5%s \t %5s\n" , "이름" , "나이" , "키");
		System.out.printf("%5s \t%5.2f" , "이름" , "나이" , "키");
		
		
		
	}	// main e
} // class e
