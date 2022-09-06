package chelsea1.a변수;	

public class HW3_문자열2 {	// class s
	
	public static void main(String[] args) {	// main s
		
		// p.64 String 타입 [ String 클래스 ]
		// char 문자 = "자바";  // 오류발생 : char 문자 한개만 저장할수 있다.
		String 문자열 = "자바";
		
		// p.65
		String name ="홍길동";	System.out.println(name);
		String job ="프로그래머";	System.out.println(job);
		
		// p.66
		System.out.println("안녕하세요");		// println : 출력후 줄바꿈 처리 o
		System.out.print("자바입니다.");		// print  	: 출력후 줄바꿈 처리 x
		System.out.println("하하하하하");
		
		
		// p.66
		System.out.println("번호\t이름\t직업");
		System.out.println("행 단위 출력\n");
		System.out.println("우리는 \"개발자\" 입니다.");
		System.out.println("봄\\여름\\가을\\겨울");
		
		System.out.println("--------------------------");
		// 예1
		System.out.println("\\ /\\");
		System.out.println(" ) ( ')");
		System.out.println(" ( / )");
		System.out.println("\\ (_) |");
		// 예2
		System.out.println("|\\_/|");
		System.out.println("|q p|   /}");
		System.out.println("( o )\"\"\\");
		System.out.println("|\"^\"`	  |");
		System.out.println("||_/=\\\\_|");
		
		// ㅇ예3
		System.out.println("\t[[ 출석부 ]]");
		System.out.println("\n---------------------------");
		System.out.println("\n이름\t1교시\t2교시\t3쇼");
		System.out.println("\n유재석\t1출석\t2결석\t3출석");
		System.out.println("\n강호동\t1출석\t2결석\t3출석");
		System.out.println("\n---------------------------");
		
		
	}	// main e
}	// class e
