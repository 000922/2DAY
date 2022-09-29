package chelsea1.테스트.Level2;

import java.util.Scanner;

public class EX9_자유주제 {

	public static void main(String[] args) {
		
		
				System.out.println("❎❎❎❎❎❎❎ 계산기 ❎❎❎❎❎❎❎");
				

				int First = 0; 		
				int Second = 0;
				
				String 수학기호 = "";

				Scanner scanner = new Scanner(System.in);
				
				
				// 입력 받기 10 + 10 = 20
				System.out.print("🔢 숫자 입력 : ");
				First = scanner.nextInt();
				
				System.out.print("🔣 기호 입력 : ");
				수학기호 = scanner.next();
				
				System.out.print("🔢 숫자 입력 : ");
				Second = scanner.nextInt();
				

				// 더하기 빼기 나누기 곱하기 ~~ 입력 받기 
				if( 수학기호.equals( "+" ) ) {
					System.out.println(First+"+"+Second+"="+(First+Second));
				}
				else if( 수학기호.equals( "-" ) ) {
					System.out.println(First+"-"+Second+"="+(First-Second));
				}
				else if( 수학기호.equals( "*" ) ) {
					System.out.println(First+"*"+Second+"="+(First*Second));
				}
				else if( 수학기호.equals( "/" ) ) {
					System.out.println(First+"/"+Second+"="+(First/Second));
				}
				else {
					System.out.println("❎❎❎❎❎❎❎ 입력X ❎❎❎❎❎❎❎");
				}
		
		 
	} // main end
	
} // class end
