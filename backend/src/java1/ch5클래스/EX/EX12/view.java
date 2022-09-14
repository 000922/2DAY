package java1.ch5클래스.EX.EX12;

import java.util.Scanner;



// print , scanner : 입/출력 작성할 예정

public class view {
	// * 함수 밖에 scanner 선언한 이유 : 모든 함수에서 같이 사용할려고 [필드]
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		start(); // 함수 호출
		
		
	}
	
	
	// 1. 프로그램 시작하는 화면 구현 함수 [ 매개변수x 반환x 정적메소드: 호출시 객체 생략 가능 ]
	static void start() {
		while(true) {	// 무한 루프
			view_boardlist();	// 무조건 view_boardlist() 함수 호출
			System.out.println("--------비회원 게시판----------------");
			System.out.println("1.글쓰기 2.글보기 : ");
			int ch = scanner.nextInt();
			if( ch == 1 ) { view_regist(); }	// 만일 1번 입력 했으면 함수 호출 view_regist(); 함수 호출
			else if( ch == 2 ) { view_board(); }	// 만일 2번 입력 헀으면 view_board(); 함수 호출
			else {System.out.println("안내) 알수 없는 번호입니다. ");}	// 그외
			
		}
	}	// start end
	
	// 2. 게시물을 등록하는 화면 구현 함수
	static void view_regist() {
		System.out.println(">>>>>>게시물 등록 페이지"); 
		System.out.println("제목 : ");			String title = scanner.next();
		System.out.println("내용 : ");			String content = scanner.next();
		System.out.println("작성자 : ");			String writer = scanner.next();
		System.out.println("비밀번호 : ");		String password = scanner.next();
		
		// 1. 메소드 호출[통신]
		boolean result = 
		Contorller.con_regist(title , content , writer , password );
		// 2. 메소드 호출한 결과
		if( result ) {
			System.err.println("안내) 게시물 등록 완료");
		}else {
			System.err.println("안내) 게시물 실패 [관리자에게 문의 ]");
		}
	}
	
	// 3. 게시물을 보기하는 화면 구현 함수
	static void view_board( ) {
		System.out.println("게시물번호 선택 : ");  int bnum = scanner.nextInt();
		System.out.println(">>>게시물 상세 페이지"); 
		Board temp = Contorller.boardlist[bnum];	// 새로운 객체[임시객체] = 입력받은 인덱스의 객체
		if( temp == null ) {System.out.println("안내) 없는 게시물번호 입니다."); return; }	// 만약에 해당 객체가 null 이면 함수
		System.out.println("제목 : " + temp.title +"   작성자 : " + temp.writer  );
		System.out.println("내용 : " + temp.content );
		System.out.println("1.뒤로가기 2.수정 3.삭제 선택 : " ); int ch = scanner.nextInt();
		if( ch == 1 ) {}
		else if( ch == 2 ) { } // 수정 페이지 함수 호출
		else if( ch == 3 ) {view_delete( bnum ); } // 삭제 페이지 함수 호출 [ 매개변수 1개 int = 현재 보고 있는 게시물 ]
		else { }
		return;
	}
	
	// 4. 게시물 몰록 화면 구현 함수
	static void view_boardlist( ) {
		System.out.println(">>>>>게시물 목록 페이지"); 
		System.out.println("번호\t작성자\t\t제목");
		for( int i = 0 ; i<Contorller.boardlist.length; i++ ) {
			Board temp = Contorller.boardlist[i];
				// temp 객체의 목적
			if( temp != null) {
				System.out.println( i + "\t\t");
				System.out.println( temp.writer +"\t\t");
				System.out.println( temp.title +"\n");
			} // if end
		}	// for end
	}	// m end
	
	// 5. 게시물 삭제 함수
	static void view_delete( int bnum ) {
		System.out.println("비밀번호 : "); String password = scanner.next();
		if( Contorller.boardlist[bnum].password .equals(password) ) {
			Contorller.con_delete( bnum );
		}else {
			System.out.println("안내) 패스워드가 다릅니다.");
		}
	}	// m end
	
	// 2. 게시물 삭제 함수
	static void con_delete() {
		if()
		for( int i = bnum ; i<boardlist.length ; i++ ) {
			boardlist[bnum] = boardlist[bnum+1];	// 한칸씩 당기기
		}
	}
	
	
	
	
	
	
}	// class end
