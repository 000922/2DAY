package java1.가계부;

import java.util.ArrayList;
import java.util.Scanner;

public class view {
	
	Scanner scanner = new Scanner(System.in);
	controller control = new controller();
	
	public static void main(String[] args) { view view = new view(); view.menu(); }
		
		// 0. 메인메뉴
		void menu() {
			while( true ) {
				read();
				System.out.println("1.추가 2.수정 3.삭제 4.검색 5.통계");
				int btn = scanner.nextInt();
				if( btn == 1 ) { create(); }
				else if ( btn == 2 ) { update(); }
				else if ( btn == 3 ) { delete(); }
			}
		}
		// 1. 내용추가 화면 메소드	// create = 생성
		void create() {
			System.out.println("날짜 : "); String e_date = scanner.next();
			System.out.println("금액 : "); int e_money = scanner.nextInt();
			System.out.println("내용 : "); scanner.nextLine(); String e_comment = scanner.nextLine();
			boolean result = control.create( e_date , e_money , e_comment );
			if( result ) {System.out.println("등록성공");}
			else { System.out.println("등록실패");}
		}
		// 2. 내용 출력 화면 메소드	// read = 읽기/조회
		void read() {
			ArrayList<ExpenseDTO > list = control.read();
			System.out.println("번호\t날짜\t\t금액\t내용");
			for( ExpenseDTO dto :  list ) {	// list 에서 dto 하나씩 꺼내오기 
				// for ( 타입파라미터 임시변수 : 리스트/배열 ) { }
				System.out.println(dto.getE_no() + "\t");
				System.out.println(dto.getEdate() + "\t");
				System.out.println(dto.getE_money() + "\t");
				System.out.println(dto.getE_comment() + "\n");
			}
		} 
		// 3. 내용 수정 화면 메소드	// update = 수정
		void update() {
			System.out.println(" 수정할 번호 :");	int e_no = scanner.nextInt();
			System.out.println(" 수정할 날짜 :");	String e_date = scanner.next();
			System.out.println(" 수정할 금액 :");	int e_money = scanner.nextInt();
			System.out.println(" 수정할 내용 :");	scanner.nextLine();String e_comment = scanner.nextLine();
			boolean result = 
			control.update( e_no , e_date , e_money , e_comment );
			if( result ) { System.out.println("수정성공"); }
			else { System.out.println("수정실패"); }
		}
		
		// 4. 내용 삭제 화면 메소드	// delete = 삭제 
		void delete() { 
			System.out.println(" 삭제할 번호 : "); 
			int e_no = scanner.nextInt();
			boolean result = control.delete( e_no);
			if( result ) { System.out.println("삭제성공"); }
			else { System.out.println("삭제실패[ 삭제할 번호 없다 or DB오류"); }
		}
		
		
		
		
		
		// main end

}	// class end
