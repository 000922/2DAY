package java1.ch4배열;

import java.util.Scanner;



public class EX7_비회원게시판 {	// class s
	
	public static void main(String[] args) {	// main s
		// 0.
		String[][] memberlist = new String[100][1];
		Scanner scanner = new Scanner(System.in);
		// 1.
		while( true ) {
			System.out.println("=================비회원제 게시판==================");
			System.out.println("번호	 작성자	제목");
			System.out.println("1.글쓰기 2.글보기 선택:");
			System.out.println("==============================================");
			System.out.println("선택 : "); int btn = scanner.nextInt();
			
			if( btn == 1) {
							System.out.println("=================글 쓰기 페이지==================");
							System.out.println("제목 :");		String title = scanner.next();
							System.out.println("게시물 :");	String content = scanner.next();
							System.out.println("이름  :");	String writer = scanner.next();
							System.out.println("비밀번호 ;");	String password  = scanner.next();	
							
							
			}	// if end
			else if( btn == 2) {
							System.out.println("=================커뮤니티 페이지==================");
							System.out.println("번호	 작성자	제목");	 	
							
							for( int row = 0 ; row<memberlist.length ; row++ ) {
								if( memberlist[row][0] == null) {
									
									
									System.out.println("1.글쓰기 2.글보기 선택:");
									
								} // if end
							} // for end
			}	// else if end
			
				
				
				
			
			
				
			
			
		} // while e
	}	// main e
}// class e


/*
  		  
  		
  
  
 
 */