package java1.ch4배열;

import java.util.Scanner;

public class EX7_비회원게시판 {	// class s
	
	public static void main(String[] args) {	// main s
		// 0.
		String[][] memberlist = new String[100][4];
		Scanner scanner = new Scanner(System.in);
		// 1.
		while( true ) {
			System.out.println("=================비회원제 게시판==================");
			System.out.println("번호	 작성자	제목");
			System.out.println("1.글쓰기 2.글보기 선택:");
			System.out.println("============================================");
			System.out.println("선택 : "); int btn = scanner.nextInt();
			for(int i = 0 ; i<memberlist.length ; i++) {
				if(memberlist[i][0] != null) {						
					System.out.println(i + "\t" + memberlist[i][2] + "\t" + memberlist[i][0]);
				}
			}
			
			
			if( btn == 1) {
							for( int row = 0; row<memberlist.length; row++) {
								if(memberlist[row][0] == null) {
									System.out.println("=================글 쓰기 페이지==================");
									System.out.println("제목 :");		String title = scanner.next();
									System.out.println("게시물 :");	String content = scanner.next();
									System.out.println("이름  :");	String writer = scanner.next();
									System.out.println("비밀번호 ;");	String password  = scanner.next();	
							
										memberlist[row][0] = title;		memberlist[row][1] = content;
										memberlist[row][2] = writer;		memberlist[row][3] = password;
										
										System.out.println("-----------커뮤니티-------------");
										System.out.println("번호	 작성자	제목");
									
										// 저장
										if(memberlist[row][0] != null) {		// if 2				
											for(int i = 0 ; i<=row ; i++) {		 // for 2				
												System.out.println(i + "\t" + memberlist[i][2] + "\t" + memberlist[i][0]);
											} // for2 e
										} // if2 e
										
									break;
								} // if e
							} // for e
			}	// if end
			else if( btn == 2) {
							System.out.println("=================커뮤니티 페이지==================");
							System.out.println("번호	 작성자	제목");	 	
							
							for( int row = 0 ; row<memberlist.length ; row++ ) {
								if( memberlist[row][0] == null) {
									System.out.println("-------게시물 상세페이지----------");
									
									System.out.println("게시물 번호(인덱스) 선택 : ");
									int qrewawq = scanner.nextInt();
									
									System.out.println("작성자 ; "+ memberlist[qrewawq][2] +"\t\t");
									System.out.println("제목 ; "+ memberlist[qrewawq][0]  );
									System.out.println("내용 ; "+ memberlist[qrewawq][1]  );
									
									System.out.println("1. 목록보기(뒤로가기) 2.글삭제 3.글수정 선택 :");
									int good = scanner.nextInt();
									System.out.println("1. 목록보기(뒤로가기)" + memberlist[good]!=null);
									System.out.println("2.글삭제" + memberlist[good]!=null);
									System.out.println("3.글수정 선택" + memberlist[good] !=null);
									System.out.println(" 알림)) 현 게시물 비밀번호 :");
														 
									break;
								} // if end
							} // for end
			}	// else if end
			
				
								
				
			
			
				
			
			
		} // while e
	}	// main e
}// class e
			
			


/*
  		  멍청한 PC
  		
 
 

 */