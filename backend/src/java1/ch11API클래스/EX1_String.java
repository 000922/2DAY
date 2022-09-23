package java1.ch11API클래스;

import java.util.Scanner;

public class EX1_String {
	
	public static void main(String[] args) {
		
		// 기본자료형으로는 문자열 저장X -> String 클래스 
		// byte -> 문자		byte[] -> 문자열 
		// 키보드 입력 ---스트림(byte)---> 컴퓨터
		// byte ----> String 생성자 
		
		// 1.
		byte b = 72;	// [ 숫자 ]
		char c = (char) b;	System.out.println( c );
		// [ char 기능 : (JAVA) 유니코드 변환 ]	72 -> H
		
		byte[] bytes = { 72 , 101 , 108 , 108 , 111 , 32 , 74 , 97 , 118 , 97 };
					//	0	,	1	2		3	4		5	6	7	8		9
		String str1 = new String( bytes );
		System.out.println( str1 );
		
		String str2 = new String( bytes , 6 , 4 );	// 6번째 부터 4개 실행  고로 74부터 ~ 97까지 
		System.out.println(str2);
		
		// 2.
		byte[] bytes2 = new byte[100];
		System.out.println(" 입력 : "); 	
		
		try {
			int readByteNo =   System.in.read( bytes2 ); 
				// readByteNo : 읽어온 바이트수 저장하는 변수 
			
			// for( int i = 0 ; i<= bytes2.length ; i++ ) {
			//	System.out.println( bytes[i] );
			// }
			String str3 = new String( bytes2 , 0 , readByteNo-2 );	// bytes2 만 입력 하면 Enter 까지 들어오기 때문에 readByteNo 사용한다. 
			System.out.println( str3 );
			System.out.println("-----------절취선----------------");
		}	
		catch (Exception e) { }
		
		
		
		
	} // main end

}	// class end
